# Data Structure design challenge

## Deliverables

Upload a file, preferably text but you can uplaod a doc file if it's
easier to  a directory named ds/ds_design in your rep. 

That document should describe your data structure. It can include
text, images, UML or other diagrams, class specifications or anything
else. Also discuss the run time for the key operations specified in
the assignment.

## Important note

This assignment is about data structure design. You are not expected
to write a fully working Java implementation or even any code although
you can write Java code as part of your descriptions.

## Another imnportant note

In this design you can only use constructs we've covered in class. You can tweak them and combine them however you want though. Things you can use:

 - arrays
 - ArrayLists
 - LinkedList (the built in one)
 - Things that you can build out of pointers 
   - linked lists we make ourself
   - Binary Search or other trees
   - Other Node / Link based structures we can build
- Methods / Classes we define and basic language constructs and data
  types.
   

## Description and questions

You are going to create a data structure to represent a phone
book. The phone book will store names and phone numbers of
individuals. Each individual will be stored using the following class
specification:

```java
public class person {
  private String lastName;
  private String firstName;
  private String phoneNumber;
  
  // other members not shown
}	
```

Design a data structure to store a phone book. The entry class should
be named `PhoneBook`, that is, if you were writing a complete, coded
solution your program would contain:

```Java
public class PhoneBook{
	// implementation not shown
}
```

`PhoneBook` can contain anything you'd like including additional data
structures.

PhoneBook should support the following operations:

1. add - you should be able to add new people in to the PhoneBook by
   `lastName`. This operation should be optimized to be as fast as
   possible.
2. find - you should be able to find a person by `lastName`. For example,
   `pb.find("Smith")` would return the person in the phone book with
   last name "Smith". Assume that last names are unique. `Find` should
   return `null` if the person is not in the phone book. This
   operation should be optimized to be as fast as possible.
3. remove - remove a person from the list based on `lastName`. This
   operation does not have to be optimized.
4. printList - this would print out an entire phone book. This
   operation does not have to be optimized.

Add a file or files into your repo describing this data structure and
the algorithms for the operations.

### additional questions:

Answer these in the same or an additionl file.

1. What is the runtime for add
1. What is the runtime for find
1. What is the runtime for remove
1. What is the runtime for printList



## Implementation hints

Make sure to consider that you want *add* and *find* to operate as
quickly as possible.

Note that you are finding (searching) based on last name. Last names
are strings and you can access an individual letter via charAt. So, if
`lastName`` is "Smith" then lastName.charAt(0) would be the *char*
'S'.

Also note that chars have numeric valuse. For example, the char 'a'
has a value of 97, 'b' is 98 etc. 'A' is 65, 'B" is 66 etc.  You can
access these values by assigning a char to an int.

```java
String s = "ABC";
int i = s.charAt(a); // i will now hold 65
```

You can use this char to int mapping to help in efficiently storing
items.

## Additions (not required)

### Reverse lookup

In addition to looking up people by last name, you might want to do a
reverse lookup - that is look up someone by number.

1. Describe an algorithm that you could use to implement a revese
   lookup by number on your data structure. What is the runtime?

2. How might you augment the data structure to implement reverse
   lookup more quickly? What would the algorithm look like now? What
   is the new runtime?
   
   

 
