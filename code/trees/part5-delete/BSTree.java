import java.io.*;
import java.util.*;

public class BSTree {
    private TreeNode root;

    public BSTree(){
	root = null;
    }


    public void delete(int key){

	// if the tree is empty, nothing to delete
	if (root==null){
	    return;
	}
	

	// find the node that we want to delete
	// and the node above it using piggybacking
	TreeNode front = root;
	TreeNode trailer = root;

	// do the piggyback loop
	// until we either find the node or null
	// if the key isn't present
	while (front != null && front.getData() != key ){
	    if (front.getData() < key){
		trailer = front;
		front = front.getRight();
	    } else {
		trailer = front;
		front = front.getLeft();
	    }
	}

	// if the key wasn't in the tree
	if (front == null){
	    return;
	}

	// if we get here
	// front points to the node we want to delete
	// and trailer points to the one above it

	// case 1 -- the node we want to delete is a leaf
	if (front.getLeft() == null &&
	    front.getRight() == null) {

	    // repoint front's parent to null
	} else if (true /* check to see if front has one child */){
	    // repoint front's parent to front's child
	} else {
	    // front has two children
	    //
	    // find the node with the largest value
	    // on fronts left subtree
	    // and replace front with it.
	    }
	
	}
    
    
    
    private void preorderTraverse(TreeNode current){
	if (current == null)
	    return;

	//process the current node
	System.out.print(current.getData()+", ");

	// recursively print out the left subtree
	preorderTraverse(current.getLeft());

	// recursively print out the right subtree
	preorderTraverse(current.getRight());
    }

    public void preorderTraverse(){
	preorderTraverse(root);
	System.out.println();
    }

    private void postorderTraverse(TreeNode current){
	if (current == null)
	    return;

	// recursively print out the left subtree
	postorderTraverse(current.getLeft());

	// recursively print out the right subtree
	postorderTraverse(current.getRight());

	//process the current node
	System.out.print(current.getData()+", ");



    }

    public void postorderTraverse(){
	postorderTraverse(root);
	System.out.println();
    }

    private void inorderTraverse(TreeNode current){
	if (current == null)
	    return;


	// recursively print out the left subtree
	inorderTraverse(current.getLeft());

	//process the current node
	System.out.print(current.getData()+", ");

	// recursively print out the right subtree
	inorderTraverse(current.getRight());
    }

    public void inorderTraverse(){
	inorderTraverse(root);
	System.out.println();
    }


    public void insert(int key){

	TreeNode newNode = new TreeNode(key);

	// if the tree is empty
	// manually insert the new node as the root
	if (root==null){
	    root = newNode;
	    return;
	}
	
	TreeNode front = root;
	TreeNode trailer = root;
	
	while (front != null){
	    int frontValue = front.getData();
	    if (frontValue == key){
		// if we're here, it means the key is
		// already in the tree so we can
		// update this node in some way
		// and then return
		return;
	    } else if (frontValue < key){
		trailer = front;
		front = front.getRight();
	    } else {
		trailer = front;
		front = front.getLeft();
	    }
	}
	if (key > trailer.getData()){
	    // insert on the right
	    trailer.setRight(newNode);
	} else {
	    // insert on left
	    trailer.setLeft(newNode);

	}
	
	

    }


    public int search(int key){
	TreeNode current = root;

	while (current != null){
	    int currentValue = current.getData();
	    if (currentValue == key){
		return currentValue;
	    } else if (currentValue < key){
		current = current.getRight();
	    } else {
		current = current.getLeft();
	    }
	}
	throw new NullPointerException();

    }
    
    public void seed(){
	TreeNode t;

	t = new TreeNode(10);
	root = t;
	t = new TreeNode(5);
	root.setLeft(t);
	t = new TreeNode(20);
	root.setRight(t);

	root.getLeft().setRight( new TreeNode(8));

	t = new TreeNode(15);
	root.getRight().setLeft(t);

	t = new TreeNode(22);
	root.getRight().setRight(t);
	
	}
    
    
}
