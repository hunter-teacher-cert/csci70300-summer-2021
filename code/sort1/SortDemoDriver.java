import java.io.*;
import java.util.*;

public class SortDemoDriver {
    public static void main(String[] args) {

	/*
	  System.out.println(sd);

	  SortDemo sd2 = new SortDemo(20);
	System.out.println(sd2);
		
	// part 2 test lines 
	int i;
	i = sd.findSmallestIndex(0);
	System.out.println("sd["+ i +"] = "+sd.get(i)+" : " + sd);

	i = sd2.findSmallestIndex(0);
	System.out.println("sd2["+ i + "] = "+sd2.get(i)+" : " + sd2);
	
	// part 3 test lines 

	System.out.println(sd);
	  sd.sort();
	  System.out.println(sd);
	*/
	long start, elapsed;
	int size;

	size = 200000;
	// SortDemo sds = new SortDemo(size);
	// start = System.currentTimeMillis();
	// sds.sort();
	// elapsed = System.currentTimeMillis() - start;
	// System.out.println("Selection on size " + size + " : " + elapsed);

	SortDemo sdm = new SortDemo(size);
	start = System.currentTimeMillis();
	sdm.msortTest();
	elapsed = System.currentTimeMillis() - start;
	System.out.println("Selection on size " + size + " : " + elapsed);

	SortDemo sdb = new SortDemo(size);
	start = System.currentTimeMillis();
	sdb.builtinSort();
	elapsed = System.currentTimeMillis() - start;
	System.out.println("Selection on size " + size + " : " + elapsed);


	      

    }
}
