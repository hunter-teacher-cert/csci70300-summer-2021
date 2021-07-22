import java.io.*;
import java.util.*;

public class BSTree {
    private TreeNode root;

    public BSTree(){
	root = null;
    }

    public int search(int key){
	TreeNode current = root;

	while (/* what goes here */){
	    int currentValue = current.getValue();
	    if (currentValue == key){
		// do something
	    } else if (currentValue < key){
		// do something else
	    } else {
		// do yet another thing
		}
	}
	// do we really want to return -1?
	return -1;
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
