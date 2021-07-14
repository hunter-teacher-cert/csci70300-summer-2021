import java.io.*;
import java.util.*;

public class Node {

    private String data;
    private Node next;

    public Node() {
	data = "";
	next = null;
    }//default constructor

    public Node(String value) {

	data = value;
	next = null;
    }//constructor(vale)

    public Node(String value, Node next) {
	data = value;
	this.next = next;
    }//constructor(value, next)

    public void setData(String value) {
	data = value;
    }//setData

    public void setNext(Node n) {
	next = n;
    }//setNext

    public String getData() {
	return data;
    }//end getValue

    public Node getNext() {
	return next;
    }//getNext

    public String toString() {
	return data;
    }//toString

}//class Node
