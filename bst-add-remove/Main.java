/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		BST bst = new BST();
		bst.add(45); 
        bst.add(10); 
        bst.add(7); 
        bst.add(12); 
        bst.add(90); 
        bst.add(50); 
        //print the BST
        System.out.println("The BST Created with input data(Left-root-right):"); 
        bst.inorder();
        System.out.println("size: " + bst.size());
        //delete leaf node  
        System.out.println("\nThe BST after Delete 12(leaf node):"); 
        bst.remove(12); 
        bst.inorder();
        System.out.println("size: " + bst.size());
        //delete the node with one child
        System.out.println("\nThe BST after Delete 90 (node with 1 child):"); 
        bst.remove(90); 
        bst.inorder(); 
        System.out.println("size: " + bst.size());
                 
        //delete node with two children  
        System.out.println("\nThe BST after Delete 45 (Node with two children):"); 
        bst.remove(45); 
        bst.inorder(); 
        System.out.println("size: " + bst.size());
	}
}
