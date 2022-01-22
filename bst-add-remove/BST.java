import java.util.NoSuchElementException;

/**
 * Your implementation of a BST.
 */
public class BST<T extends Comparable<? super T>> {

    /*
     * Do not add new instance variables or modify existing ones.
     */
    private BSTNode<T> root;
    private int size;

    /*
     * Do not add a constructor.
     */

    /**
     * Adds the data to the tree.
     *
     * This must be done recursively.
     *
     * The new data should become a leaf in the tree.
     *
     * Traverse the tree to find the appropriate location. If the data is
     * already in the tree, then nothing should be done (the duplicate
     * shouldn't get added, and size should not be incremented).
     *
     * Should be O(log n) for best and average cases and O(n) for worst case.
     *
     * @param data The data to add to the tree.
     * @throws java.lang.IllegalArgumentException If data is null.
     */
    public void add(T data) {
        if(data == null) throw new IllegalArgumentException();
        root = addHelper(data, root);
    }
    
    private BSTNode<T> addHelper(T data, BSTNode<T> currentNode) {
        // base case
        if(currentNode == null) {
            size++;
            return new BSTNode(data);
        };
        if(data.compareTo(currentNode.getData()) > 0){
            currentNode.setRight(addHelper(data, currentNode.getRight()));
            return currentNode;
        }
        if(data.compareTo(currentNode.getData()) < 0){
            currentNode.setLeft(addHelper(data, currentNode.getLeft()));
            return currentNode;
        }
        return currentNode;
    }

    /**
     * Removes and returns the data from the tree matching the given parameter.
     *
     * This must be done recursively.
     *
     * There are 3 cases to consider:
     * 1: The node containing the data is a leaf (no children). In this case,
     * simply remove it.
     * 2: The node containing the data has one child. In this case, simply
     * replace it with its child.
     * 3: The node containing the data has 2 children. Use the SUCCESSOR to
     * replace the data. You should use recursion to find and remove the
     * successor (you will likely need an additional helper method to
     * handle this case efficiently).
     *
     * Do NOT return the same data that was passed in. Return the data that
     * was stored in the tree.
     *
     * Hint: Should you use value equality or reference equality?
     *
     * Must be O(log n) for best and average cases and O(n) for worst case.
     *
     * @param data The data to remove.
     * @return The data that was removed.
     * @throws java.lang.IllegalArgumentException If data is null.
     * @throws java.util.NoSuchElementException   If the data is not in the tree.
     */
    public T remove(T data) {
        if(data == null) throw new IllegalArgumentException();
        BSTNode<T> dummyNode = new BSTNode(data);
        root = deleteHelper(root, data, dummyNode);
        return dummyNode.getData();
    }
    
    private BSTNode<T> deleteHelper(BSTNode<T> currentNode, T data, BSTNode<T> dummyNode) {
        if (currentNode == null) throw new NoSuchElementException();
        if (data.compareTo(currentNode.getData()) == 0) {
            size--;
            dummyNode.setData(currentNode.getData());
            // No child
            if (currentNode.getLeft() == null && currentNode.getRight() == null)  return null;
            
            // 1 child only
            if (currentNode.getLeft() == null) {
                return currentNode.getRight();
            }
            else if (currentNode.getRight() == null) {
                return currentNode.getLeft();
            };
            
            // 2 child
            BSTNode<T> tempDummyNode = new BSTNode(data);
            currentNode.setRight(minValue(currentNode.getRight(), tempDummyNode));
            currentNode.setData(tempDummyNode.getData());
            
        } 
        else if (data.compareTo(currentNode.getData()) < 0) {
            currentNode.setLeft(deleteHelper(currentNode.getLeft(), data, dummyNode));
        } 
        else if (data.compareTo(currentNode.getData()) > 0) {
            currentNode.setRight(deleteHelper(currentNode.getRight(), data, dummyNode));
        }
        return currentNode;
    }
    
    private BSTNode<T> minValue(BSTNode<T> root, BSTNode<T> tempDummyNode)  { 
       if (root.getLeft() == null) {
           tempDummyNode.setData(root.getData());
           return root.getRight();
       } else {
           root.setLeft(minValue(root.getLeft(), tempDummyNode));
       } 
       return root;
    } 
    /**
     * Returns the root of the tree.
     *
     * For grading purposes only. You shouldn't need to use this method since
     * you have direct access to the variable.
     *
     * @return The root of the tree
     */
    public BSTNode<T> getRoot() {
        // DO NOT MODIFY THIS METHOD!
        return root;
    }
    
    void inorder() { 
        inorder_Recursive(root); 
    } 
   
    // recursively traverse the BST  
    void inorder_Recursive(BSTNode<T> root) { 
        if (root != null) { 
            inorder_Recursive(root.getLeft()); 
            System.out.print(root.getData() + " "); 
            inorder_Recursive(root.getRight()); 
        } 
    } 
    /**
     * Returns the size of the tree.
     *
     * For grading purposes only. You shouldn't need to use this method since
     * you have direct access to the variable.
     *
     * @return The size of the tree
     */
    public int size() {
        // DO NOT MODIFY THIS METHOD!
        return size;
    }
}