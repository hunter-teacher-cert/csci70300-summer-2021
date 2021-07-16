import java.io.*;
import java.util.*;


public class Llist{
    private Node front; // the front of the list

    public  Llist(){
	front = null;
    }

    // Add a new node containing data
    // at the front of the list
    public void addFront(String data){
	// make the new node
	Node newNode = new Node(data);
	// point it to what front points to
	newNode.setNext(front);
	// point front to the new node
	front = newNode;
    }

    public String toString(){
	Node currentNode;
	currentNode = front;
	String result = "";
	while (currentNode != null){
	    result = result + currentNode + "->";
	    // this is like i=i+1 is for arrays
	    // but for linked lists 
	    currentNode = currentNode.getNext();
	}
	result = result + "null";
	return result;

    }

    // returns True if there is nothing in the list
    // False otherwise
    public boolean isEmpty(){
	return front==null; // could also return !front
    }

    // returns the number of items in the list
    // Hint: look at the toString
    // to remind you how to traverse down the list
    public int length(){
	Node currentNode = front;
	int count = 0;
	while (currentNode != null){
	    count = count + 1;
	    currentNode = currentNode.getNext();
	}
	return count;
    }

    // returns the item at location index;
    // returns null if there aren't enough
    // items. Starts with index 0
    public String get(int index){
	// be careful not to run off the end of the list
	// move a reference to the node we want to get
	// traverse idiom
	int count = 0;
	Node currentNode = front;
	while (currentNode != null && count != index){
	    currentNode = currentNode.getNext();
	    count = count + 1;
	}
	
	// once there, return the data in that node
	if (currentNode == null){
	    return null;
	} else {
	    return currentNode.getData();
	    
	}
	
	
    }

    // sets the item at location index (starting
    // with 0) to value.
    // only sets if the index is within range
    public void set(int index, String value){

	int count = 0;
	Node currentNode = front;
	while (currentNode != null && count != index){
	    currentNode = currentNode.getNext();
	    count = count + 1;
	}
	
	// once there, set the new data
	if (currentNode != null){
	    currentNode.setData(value);
	}


    }

    // insert an item before index.
    // only inserts if the index is within bounds
    // Hint: look at toString for hints on
    // traversal and draw out a diagram.
    // You will need a variable that refers to
    // the node BEFORE you want to do the insertion.
    public void insert(int index, String value){

	Node prev=null;
	Node current=front;
	int count = 0;

	// This piggybacks the pointers - prev follows
	// current 
	while (current != null && count != index){
	    prev = current;
	    current = current.getNext();
	    count = count + 1;
	}

	// at this point, current points to the insertion location (or
	// null) and prev to the node ahead of it (or null in case
	// insertion isat the beginning.

	
	// we can only insert if index is in range
	if (current==null){
	    return;
	}

	// create the new node and set it's next to the current node
	// (where we're inserting.
	Node newNode=new Node(value);
	newNode.setNext(current);
	
	// this handles the special case.
	// if prev isn't null we're at some interior node so we
	// can just insert it.
	if(prev!=null){
	    prev.setNext(newNode);
	} else{
	    // if prev was null we're inserting at the front
	    // which is a special case and we have to make front
	    // point to (refer to) the new node.
	    front = newNode;
	}
	
	
    }

    // returns the index of the first item with
    // data value key. Returns -1 if not found
    public int search(String key){
	return -1;	
    }

    // removes the node at index.
    // does nothing if index out of bounds
    public void remove(int index){
	
    }

    
}
