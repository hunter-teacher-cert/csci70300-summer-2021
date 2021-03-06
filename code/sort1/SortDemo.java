import java.io.*;
import java.util.*;

/*

Setup:
 1.Make a folder under your work repo named: ds
 2. Make another folder under that named sort1
 3. Copy this file and SortDemoDriver.java into the ds/sort1 folder
 
Lab:

Part 1:  
  1. Analyze the two constructors - try to figure out how they work.
  2. Compile and run the program (SortDemoDriver.java and SortDemo.java) and confirm
   the behavior of the constructors.

Part 2:
  1. Read the description of findSmallestIndex and complete the method.
  2. Uncomment the lines in SortDemoDriver to test.

Part 3:
  1. Complete the sort method - read comments for description
  2. Uncomment the lines in sortDemoDriver to test.

*/

public class SortDemo{

    /* Instance Variables */
    private ArrayList<Integer> data;  // to store the data
    
    private Random r; 

    
    public SortDemo(){
	data = new ArrayList<Integer>();
	r = new Random();
	for (int i=0;i<15;i++){
	    data.add(r.nextInt(20));
	}
	
    }
    
    public SortDemo(int size){
	data = new ArrayList<Integer>();
	r = new Random();
	for (int i=0;i<size;i++){
	    data.add(r.nextInt(20));
	}
	
    }

    public int get(int index){
	return this.data.get(index);
    }
    
    /*
      return the index of the ArrayList data from index start to the end
      Example, if the arraylist has:
      5,3,10,6,8
      if start was 2 (start at index 2, value 10) then it woudl return 3 which is the index of the value
      6 which is the index with the smallest value from start to end

    */
    public int findSmallestIndex(int start){
	int smallIndex = start;
	
	// start a variable at the one after start
	// your code here
	
	// loop from that variable to end and update smallIndex as needed
	// your code here
	int i;
	for (i = smallIndex + 1; i < this.data.size(); i++){
	
	    if (this.data.get(i) < this.data.get(smallIndex)){
		smallIndex = i;
	    }

	}
	return smallIndex;
    }

    
    public void sort(){
	int i;
	int smallIndex;
	int tmp;
	for (i=0;i < data.size()-1; i++){
	    smallIndex = findSmallestIndex(i);
	    tmp = data.get(smallIndex);
	    data.set(smallIndex,data.get(i));
	    data.set(i,tmp);
	}
    }



    /* If you finish the lab early you can get started on this */
    public int linearSearch(int value){
	
	
	return 0; // replace this return
    }
    
    /* If you finish the lab early you can get started on this */
    public int binarySearch(int value){
	return 0;
	    
    }
    
	
    public String toString(){
	return ""+data;
    };

    /*------------------------- MERGESORT STUFF -----------------*/


    // Preconditions: a and b are ArrayLists of Integers and
    //                both are in increasing order
    // Return: a new ArrayList of Integers that is the result
    //         of merging a and b. The new ArrayList
    //         should be in increasing order
    private ArrayList<Integer> merge(ArrayList<Integer> a,
				     ArrayList<Integer> b){

	ArrayList<Integer> result = new ArrayList<Integer>();

	// merge by moving indices down the ArrayLists
	// int aIndex = 0;
	// int bIndex = 0;
	// while (aIndex < a.size() && bIndex < b.size()){
	//     if (a.get(aIndex) < b.get(bIndex)){
	// 	result.add(a.get(aIndex));
	// 	aIndex = aIndex + 1;
	//     } else {
	// 	result.add(b.get(bIndex));
	// 	bIndex = bIndex + 1;
	//     }
	// }

	// // copy over anthing else
	// // we know that either a or b will be finished
	// while (aIndex < a.size()){
	//     result.add(a.get(aIndex));
	//     aIndex = aIndex + 1;
	// }

	// while (bIndex < b.size()){
	//     result.add(b.get(bIndex));
	//     bIndex = bIndex + 1;
	// }

	while (!a.isEmpty() && !b.isEmpty()){
	    if (a.get(0) < b.get(0)) {
		result.add(a.get(0));
		a.remove(0);
	    } else {
		// remove also returns the value so we
		// don't really need the get we used above
		result.add(b.remove(0));
	    }

	}

	// copy the rest once we're at the end of one of the lists
	while (!a.isEmpty()){
	    result.add(a.remove(0));
	}
	while (!b.isEmpty()){
	    result.add(b.remove(0));
	}
	
	
	return result;
	}

    /*
      Parameters: l - an ArrayList
      
      Returns: a new, sorted ArrayList

      This routine should implement the mergesort algorithm.
    */
    public ArrayList<Integer> msort(ArrayList<Integer> l){
	
	ArrayList<Integer> left = new ArrayList<Integer>();
	ArrayList<Integer> right = new ArrayList<Integer>();;

	// base case - if the input ArrayList is smaller than 2 elements
	if (l.size() < 2){
	    return l;
	}
	
	// split l into left and right halves
	int mid = l.size()/2;
	int i;

	for(i=0; i < mid; i++){
	    left.add(l.get(i));
	}

	// at this point, left has all the left hand stuff
	// and i should be at the midpoint

	for (i=mid; i < l.size(); i++){
	    right.add(l.get(i));
	}

	// sort the left half
	left = msort(left);
	// sort the right half
	right = msort(right);
	// merge the two halves that have been sorted
	ArrayList<Integer> result = merge(left,right);
	
	// return the result
	return result;
	
    }

    public void msortTest(){

	data = msort(data);
    }
    
    private ArrayList<Integer> fillForMerge(int size){
	ArrayList<Integer> a = new ArrayList<Integer>();
	int lastVal = r.nextInt(10);
	for (int i = 0 ; i < size ; i=i+1){
	    a.add(lastVal);
	    lastVal = lastVal + r.nextInt(10);
	}
	return a;
	
    }
    public void testMerge(){

	ArrayList<Integer> a = new ArrayList<Integer>();
	ArrayList<Integer> b = new ArrayList<Integer>();
	a = fillForMerge(10);
	b = fillForMerge(10);
	System.out.println(a);
	System.out.println(b);
	ArrayList<Integer> result = merge(a,b);
	System.out.println(result);
	
	

    }

    public void builtinSort(){
	Collections.sort(data);
	
    }
    

    
}

