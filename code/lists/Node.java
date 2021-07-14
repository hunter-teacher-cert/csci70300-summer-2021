import java.io.*;
import java.util.*;

public class Node {

  private String name;
  private Node next;

  public Node() {
    name = "";
    next = null;
  }//default constructor

  public Node(String value) {

    name = value;
    next = null;
  }//constructor(vale)

  public Node(String value, Node next) {
    name = value;
    this.next = next;
  }//constructor(value, next)

  public void setData(String value) {
    name = value;
  }//setData

  public void setNext(Node n) {
    next = n;
  }//setNext

  public String getValue() {
    return name;
  }//end getValue

  public Node getNext() {
    return next;
  }//getNext

  public String toString() {
    return name;
  }//toString

}//class Node
