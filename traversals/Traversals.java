import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Your implementation of the pre-order, in-order, and post-order
 * traversals of a tree.
 */
public class Traversals<T extends Comparable<? super T>> {

    /**
     * DO NOT ADD ANY GLOBAL VARIABLES!
     */

    /**
     * Given the root of a binary search tree, generate a
     * pre-order traversal of the tree. The original tree
     * should not be modified in any way.
     *
     * This must be done recursively.
     *
     * Must be O(n).
     *
     * @param <T> Generic type.
     * @param root The root of a BST.
     * @return List containing the pre-order traversal of the tree.
     */
    public List<T> preorder(TreeNode<T> root) {
        List<T> preorderList = new ArrayList<T>();
        preorder(root, preorderList);
        return preorderList;
    }
    
    private void preorder(TreeNode<T> root, List<T> preorderList) {
        if (root == null) return;
        preorderList.add(root.getData());
        preorder(root.getLeft(), preorderList);
        preorder(root.getRight(), preorderList);
    }

    /**
     * Given the root of a binary search tree, generate an
     * in-order traversal of the tree. The original tree
     * should not be modified in any way.
     *
     * This must be done recursively.
     *
     * Must be O(n).
     *
     * @param <T> Generic type.
     * @param root The root of a BST.
     * @return List containing the in-order traversal of the tree.
     */
    public List<T> inorder(TreeNode<T> root) {
        List<T> inorderList = new ArrayList<T>();
        inorder(root, inorderList);
        return inorderList;
    }
    
    private void inorder(TreeNode<T> root, List<T> inorderList) {
        if (root == null) return;
        inorder(root.getLeft(), inorderList);
        inorderList.add(root.getData());
        inorder(root.getRight(), inorderList);
    }

    /**
     * Given the root of a binary search tree, generate a
     * post-order traversal of the tree. The original tree
     * should not be modified in any way.
     *
     * This must be done recursively.
     *
     * Must be O(n).
     *
     * @param <T> Generic type.
     * @param root The root of a BST.
     * @return List containing the post-order traversal of the tree.
     */
    public List<T> postorder(TreeNode<T> root) {
        List<T> postorderList = new ArrayList<T>();
        postorder(root, postorderList);
        return postorderList;
    }
    
    private void postorder(TreeNode<T> root, List<T> postorderList) {
        if (root == null) return;
        postorder(root.getLeft(), postorderList);
        postorder(root.getRight(), postorderList);
        postorderList.add(root.getData());
    }
}