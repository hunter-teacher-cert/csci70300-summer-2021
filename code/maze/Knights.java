import java.io.*;
import java.util.*;

public class Knights{


    // the board is of ints rather than chars like the maze
    // since we want to track the moves by number
    
    private int[][] board;
    private int rows = 5;
    private int cols = 5;
    private int size=5;
    private String clearScreen="[0;0H\n";

    private void delay(int n)
    {
	try 
	    {Thread.sleep(n);} 
	catch(InterruptedException e)
	    {}

    }

    
    public Knights(int size){
	rows = size;
	cols = size;
	this.size=size;
	int row,col;

	// Notice that the board is 4 bigger in both directions with 0's
	// in the middle and a 2 row/col border of -1.
	// Why are we doing this?
	board = new int[cols+4][rows+4];
	for (row = 0; row < rows+4; row++){
	    for (col = 0; col < cols+4 ; col++){
		board[col][row] = -1;
	    }
	}
	for (row = 2; row < rows+2; row++){
	    for (col = 2; col < cols+2 ; col++){
		board[col][row] = 0;
	    }
	}

	
    }

    public String toString(){
	int row,col;
	int value;
	String result = "";
	for (row = 0; row < rows+4; row++){
	    for (col = 0; col < cols+4; col++){
		value = board[col][row];

		// Why do we have this if as opposed to 
		// just adding the next value to the string?
		if (value < 10 && value >= 0){
		    result = result + "0" + value+ " ";
		} else {
		    result = result + value + " ";
		}
	    }
	    result = result +"\n";
	}
	return result;
    }

    public boolean solve(int col,int row, int count){
	boolean solved = false;


	// This should return true when we've solved the problem
	// What should CHANGETHIS be?
	// in the maze we knew we were done when we found the exit
	// here, when do we know when we're done?
	// HINT: you have an nxn board and are done when you've visited
	// every board location
	if (count>CHANGETHIS){
	    System.out.println(this);
	    return true;
	}


	// this should return false when we're at an illegal locaiton
	// change CHANGETHIS to the appropriate boolean
	// HINT: we are tracking our moves in the board
	// and also built that border of -1 values.
	if (CHANGETHIS){
	    return false;
	}
	
	
	// what do we put into the board
	// Change CHANGETHIS
	board[col][row]=CHANGETHIS;

	delay(50);
	System.out.println(clearScreen+this);


	// Here we need to do try to do the 8 recursive calls
	// one for each knight's move.
	// It should be almost the same as the maze routine except:
	// 1. The maze had only four calls.
	// 2. The parameters for the call are a little different.
	// Add the recursive calls here
	

	

	// Here we unset where we were for the backtracking
	
	board[col][row]=0;
	return solved;
    }

    

    
}

