import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String[] args) {
	Node n;
	n = new Node();
	n.setData("Eduardo");
	

	Node n2 = new Node("Brian");
	n.setNext(n2);

	System.out.println(n);

	System.out.println(n2);

	System.out.println(n.getNext());
	n.getNext().setNext(new Node("Steph"));
	System.out.println(n2.getNext());
	System.out.println(n.getNext().getNext());
	
	// 1.Create a new  list that looks like:
	//   L->"a"->"b"->"c"->"d"
	// 2. Write the code to insert an "x"
	//    between the b and the c
	// 3. Write the code to delete the c


	//1
	Node L;
	Node a = new Node("a");
	Node b = new Node("b");
	Node c = new Node("c");
	Node d = new Node("d");
	Node e = new Node("e");

	L=a;
	a.setNext(b);
	b.setNext(c);
	c.setNext(d);
	d.setNext(e);
	//2
	Node x = new Node("X");
	x.setNext(c);
	b.setNext(x);

	//3
	b.setNext(d);
	

	/* Or:
	   L = new Node("a");
	   L.setNext(new Node("B"));
	   L.getNext().setNext(new Node("C"));
	   L.getNext().getNext().setNext(new Node("D"));
	   etc
	*/
	
    }
}
