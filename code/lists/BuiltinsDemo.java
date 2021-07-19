import java.io.*;
import java.util.*;

public class BuiltinsDemo {
    public static void main(String[] args) {
	ArrayList<Integer> ali = new ArrayList<Integer>();
	ArrayList<String> als = new ArrayList<String>();

	ali.add(5);
	ali.add(20);
	als.add("Hello");
	als.add("World");

	System.out.println(ali + ":" + ali.get(0));
	System.out.println(als + ":" + als.get(0));


	LinkedList<Integer> lli = new LinkedList<Integer>();
	LinkedList<String> lls = new LinkedList<String>();

	lli.add(5);
	lli.add(20);
	lls.add("Hello");
	lls.add("World");

	System.out.println(lli + ":" + lli.get(0));
	System.out.println(lls + ":" + lls.get(0));

	// built in LIFO (Last in First Out) Stack
	Stack<String> ss = new Stack<String>();
	ss.push("A");
	ss.push("B");
	ss.push("C");
	while (!ss.empty()){
	    String s = ss.pop();
	    System.out.println(s);
	}

	// built in FIFO (First in First Out) Queue
	// oops, there isn't one
	
	       

    }
}
