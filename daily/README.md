# Daily Assignments / Notes

## Deliverables
### Required
	Specifications given with each assignment in class
  - Selection sort
  - linear and binary search
  - Singly linked list
  - Merge sort
  - Mode lab
  - more will be added as we progress through the class
### Final project  (complete at least 2, more to supplement earlier work)
  complete at least two of these. You can complete more to supplement
  prior work in this class that you didn't complete. For each
  assignment you complete, put all code in a folder as specified in
  the project.
  - Knights tour Folder: ds/knights 
  
    Write a program to solve the Knights tour, that is, find a sequence
    of moves such that a knight can visit every square once without
    repeating. Your program should work on any size board but should
    be set to default to a 5x5. Note that not all board sizes have
    solutions and not all board sizes have solutions from all
    locations.
	
  - Queue Folder: ds/queue
	
	Create a class  that represents a queue. This class should use a linked list with at least two pointers. Your class should implement the following methods:
	
	- constructor(s)
	- enqueue(value) <-- add value to the end of the queue
	- x = dequeue() <-- remove and return the value at the front of the queue
	- x = front() <-- return but don't remove the value at the front
	- isEmpty() <-- returns true if the queue is empty
	- size() <-- returns the number of items in the queue
  - Doubly Linked List Folder: ds/dlist 
  
    Implement a doubly linked
	list. A doubly linked list is similar to a linked list but has
	both next and previous references. Your doubly linked list should
	have private instance variables for prev and next (and anything
	else you need). If you'd like you can also have one for current
	(the current node). Implement all methods that we implemented for
	the singly linked list.
	
  - Quicksort Folder: ds/qsort
  
    Write a program that implements the Quicksort algorithm as we
    explored in class.

  - hash table Folder: ds/hash
  
    Write a program that implements an open hash table. You must
    implement the hash function and the following methods:
	
	- constructor(s)
	- hasKey(key) - returns True if the hash  table contains key
	- get(k) - returns value of the item with key k (if present).
	- isEmpty() - returns true if the hash table is empty.
	- put(k,v) - adds an item with key k and value v to the hash table.
	- remove(k) - removes theitem with key k from the hash table (this
      method is optional, only complete if you have time.
	
  - Heapsort Folder: ds/heap 
  
	Write an implementation of the heapsort algorithm.
	  
## Day 0 - July 9
### Class intro

### Sorting Lab
	1.Make a folder under your work repo named: ds
	2. Make another folder under that named sort1
	3. Copy SortDemo.java and SortDemoDriver.java into the ds/sort1 folder
	4. Work through the lab (see comments in SortDemo.java
	
### Searching
	- Binary search resources: 
	  - Video (iterative / loop): https://www.youtube.com/watch?v=hKI93hOfeIk
	  - Video (recursive): https://www.youtube.com/watch?v=P3YID7liBug
	  - https://www.baeldung.com/java-binary-search
## Day 1 - July 9
### Sorting lab and searching
	1. finish sort lab (and search if time)
### Maze solving
	0. You can find the code for this unit in the `code/maze` folder
       of the class site / repo.
	1. Copy Maze.java , Driver.java , and maze.dat into a new
       folder named maze to a new folder in your repo ds/maze.
	2. Compile and run Driver.java and make sure you understand the code. 
	3. Copy `Knights.java` into ds/maze.
	4. Comment out the lines that solve the maze and uncomment the
       lines that solve the knights tour in Driver.java.
	5. Modify Knights.java so that it solves the Knights
       tour. Guidelines and hints are comments in the file.
	
## Day 2 - July 12
### Maze lab
	0. Review of maze code.
	1. Draw a simple maze and trace through the maze code as directed by instructor.
### Knights tour
	0. Overview
	1. Comment out the lines in Driver.java that call the maze solver.
	2. Uncomment the lines that create an instance of Knights in Driver.java.
	3. Use Maze.java as a template to complete Knights.java (see hints in the comments in Knights.java)
	4. Test by uncommenting the call to k.solve() in Driver.java
	
## Day 3 - July 13
### Maze tracing and Knights tour lab

## Day 4 - July 14
### Introduce the concept of a list
### Build Node Class
### Node practice lab
	Grab the code for Node and Driver from code/lists and in Driver:
	1.Create a new  list that looks like:
		L->"a"->"b"->"c"->"d"
	2. Write the code to insert an "x"
		between the b and the c
	3. Write the code to delete the c



## Day 5 - July 15
### Finish addFront method (15 minutes)

### Linked List Lab
	Start with our Llist.java from code/lists and complete the methods (preferably in the order given). 
	
	
## Day 6 - July 16
### Completed linked list lab 
### Linked list and ArrayList comparison
## Day 7 - July 19
### Linked List code review
### built in LinkedList
### Stacks and Queues
### Review of sorting and searching 
### Big O notation
## Day 8  - July 20
### Mergesort implementation lab
## Day 98 - July 21
## Day 10 - July 22
## Day 11 - July 23
## Day 12 - July 26
## Day 13 - July 27
## Day 14 - July 28
## Day 15 - July 29
## Day 16 - July 30
