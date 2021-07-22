import java.io.*;
import java.util.*;

public class TreeNode{
    private int data;
    private TreeNode left,right;

    public TreeNode(){
	this(0);
	left = null;
	right = null;
    }

    public TreeNode(int data){
	this.data = data;
	left = null;
	right = null;
    }

    public void setData(int data){
	this.data = data;
    }

    public void setLeft(TreeNode left){
	this.left = left;
    }

    public void setRight(TreeNode right){
	this.right = right;
    }

    public int getData(){
	return data;
    }

    public TreeNode getLeft(){
	return left;
    }

    public TreeNode getRight(){
	return right;
    }
}
