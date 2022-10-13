# Computer Science I
## Lab 7.0 - Lists & Arrays
[School of Computing](https://computing.unl.edu)  
[College of Engineering](https://engineering.unl.edu/)  
[University of Nebraska-Lincoln](https://unl.edu)  
[University of Nebraska-Omaha](https://unomaha.edu)  

This lab introduces dynamic collections and arrays in Java.

## Prior to Lab

* Read and familiarize yourself with this handout.
* Read the required chapters(s) of the textbook as
  outlined in the course schedule.

## Peer Programming Pair-Up

***For students in the online section:*** you may complete
the lab on your own if you wish or you may team up with a partner
of your choosing, or, you may consult with a lab instructor to get
teamed up online (via Zoom).

***For students in the on campus section:*** your lab instructor
may team you up with a partner.  

To encourage collaboration and a team environment, labs are be
structured in a *peer programming* setup.  At the start of
each lab, you will be randomly paired up with another student
(conflicts such as absences will be dealt with by the lab instructor).
One of you will be designated the *driver* and the other
the *navigator*.  

The navigator will be responsible for reading the instructions and
telling the driver what to do next.  The driver will be in charge of the
keyboard and workstation.  Both driver and navigator are responsible
for suggesting fixes and solutions together.  Neither the navigator
nor the driver is "in charge."  Beyond your immediate pairing, you
are encouraged to help and interact and with other pairs in the lab.

Each week you should alternate: if you were a driver last week,
be a navigator next, etc.  Resolve any issues (you were both drivers
last week) within your pair.  Ask the lab instructor to resolve issues
only when you cannot come to a consensus.  

Because of the peer programming setup of labs, it is absolutely
essential that you complete any pre-lab activities and familiarize
yourself with the handouts prior to coming to lab.  Failure to do
so will negatively impact your ability to collaborate and work with
others which may mean that you will not be able to complete the
lab.  

## Lab Objectives & Topics

By the end of this lab you should
* Understand dynamic memory management and how the Java garbage
  collector operates
* Know how to work with `List` collections: how to create them, use them,
  pass and return them from functions
* Pass and return `List` collections from methods

### Background

Arrays are ordered collections that hold multiple values of a
certain type (`int` or `String` values for example).  
Individual *elements* in an array can be accessed using an
*index* value and the square bracket `[]` syntax.  For example,
suppose we have an `int` array named `arr`. The first element
is at index `0` and can be accessed using `arr[0]`, the second
is at index `1` and can be accessed using `arr[1]`, etc.  If
there are `n` elements in the array the last one would be at
index `n-1`: `arr[n-1]`.  This is known as zero-indexing.
In Java, the length property: `arr.length` can be used to
determine how big an array is.  You can create an array using
the `new` keyword:

``` java
int arr[] = new int[100];
```

You should take care that you do not access elements beyond
the range of the array's indices.  Attempts to access
elements outside this range will result in an `IndexOutOfBoundsException`.

#### Lists

Though Java supports traditional arrays, a much better option
is to use *dynamic collections*: collections that offer a rich
collection of methods that you can use to perform various operations.

* A `List` is similar to an array; it holds elements in an ordered
manner and allows duplicates.
* A `Set` is a collection that stores elements in an unordered manner
and does not allow duplicates
* A `Map` is a collection that stores elements using a key-value
pair system (a key maps to a value)

This lab will focus on `List`s.  You can declare and create a `List`
as follows.

```java
List<Integer> numbers = new ArrayList<>();
```

The `<Integer>` syntax is a *parameterization*: it specifies that the
list only holds `Integer` values.  The `ArrayList` is a specific
*implementation* of the `List` data structure.  You can perform basic
operations:

```java
//add elements
numbers.add(10);
numbers.add(20);
numbers.add(30);

//print the list
System.out.println(numbers);

//get an element using 0-indexing:
int x = numbers.get(1);

//iterate over the elements:
for(int i=0; i<numbers; i++) {
  System.out.printf("element at %d is %d\n", i, numbers.get(i));
}

//even better to use an "enhanced for loop":
for(Integer x : numbers) {
  System.out.println(x);
}
```

For complete documentation, see <https://docs.oracle.com/en/java/javase/16/docs/api/java.base/java/util/List.html>

#### Memory Management

Dynamic memory management involves allocating memory when needed and
freeing up after it is no longer needed. Poorly written programs that do
not handle memory properly can crash or cause memory leaks. A memory
leak occurs when all references to a chunk of memory are lost, but the
memory was not properly cleaned up. This can lead to wasted resources
and a substantial slow-down in performance.

Java, like many modern programming languages offers automatic garbage
collection. In the case of Java, the Java Virtual Machine manages memory
for you: once an object is no longer being referenced by another object,
it is available to be garbage collected and its memory freed up for
further use by the JVM or by the operating system. In general, you have
no control over when and how garbage collection is performed; the JVM
decides when it is best and how best to go about it.

A typical example in Java:

``` java
String message = new String("Hello World!");
message = null;
```

The code snippet above allocates new memory space to hold the
`String`{.java} object containing the `"Hello World!"`{.java} message.
The variable message is holding a reference to that `String`{.java}
object; it points to the memory location where the string is being
stored. In the second line when we reassign what the message variable is
pointing to (to null) then all references to that original memory
location are lost. In many programming languages the string would
persist in memory until the program ended. In Java, it becomes available
to be garbage collected and may, at some point, be cleaned up by the
JVM.

#### 2-D Arrays

You can create two-dimensional arrays to hold *tables* (or
matrices) of data in rows/columns.  To create a 2-D array,
you simply need to specify the number of rows/columns when
you create it and use two indices to access elements.

```java
//create a 10 x 20 table of integers:
int table[][] = new int[10][20];

//top-left most element:
table[0][0] = 42;
//bottom-right most element:
table[9][19] = 101;

//iterating over both rows and columns:
int counter = 0;
for(int i=0; i<table.length; i++) {
  for(int j=0; j<table[i].length; j++) {
    table[i][j] = counter;
    counter++;
  }
}
```

# Activities

Clone the repository from GitHub containing the code for this lab by using
the following URL: https://github.com/cbourke/CSCE155-C-Lab07

## Observing Garbage Collection

For this exercise, we'll observe a memory leak in action and fix it.  To
do so, you may need to work from a linux-based command line (not Eclipse).

### Instructions

1.  Open the `MemoryLeakA.java` source file and familiarize
    yourself with what it does.

2.  Move to the project's root directory, `CSCE155-Java-Lab07`

3.  Compile and build the project using the Apache Ant build script
    (`build.xml`) by executing the following on the command line:
    `ant compile`

4.  Now run the program by executing the following from the command
    line:

    `java -cp build/classes unl.cse.memory.MemoryLeakA 10`

5.  Reopen the source file and comment out the line that prints the
    $i$-th order statistic; recompile with the same ant command

6.  Now run the program by executing the following from the command line
    (this will log information on when Java's garbage collector is
    executing and how it affects memory):

    `java -verbose:gc -XX:+PrintGCDetails -cp build/classes unl.cse.memory.MemoryLeakA 1000000`

7.  Observe the output for a couple of minutes, but ultimately you may
    have to kill your program (control-c)

8.  Answer the questions in your handout.

## Breaking Garbage Collection

Java's garbage collection relieves the user from having to worry about
cleaning up memory, but it does not mean that we can ignore dynamic
memory issues altogether in Java. Java can still have "memory leaks" if
poorly written code holds on to references even though it no longer
needs them. If objects and data continue to have valid references, they
are not eligible for garbage collection and remain resident in memory.
In this exercise we'll observe such a situation.

### Instructions

1.  Open the `MemoryLeakB.java` source file and compare that to
    the other demo file--what are the key differences?

2.  Execute this program in the background from the command line via the
    following (the ampersand runs the process in the background):

    `java -cp build/classes unl.cse.memory.MemoryLeakB 1000000 &`

3.  To monitor how much memory your program is using, start the top
    program: `top -u login` where `login` is replaced with
    your cse login. Your Java process should be the top process.

4.  Observe the performance of your program for a couple of minutes and
    then kill it: quit top by typing 'q' then type the command
    `kill 1234` where `1234` is the ID of your Java
    process (first column in top).

## More Exercises

You will now get some practice by implementing several more
utility methods.  For each method in the `ListUtils` class:

1. Write documentation in your own words so you have an understanding
   of what it is supposed to do.
2. Implement each method
3. Perform some ad-hoc tests in the `ListUtilsDemo` file to verify
   your methods work.
4. Run the JUnit tests in the `ListUtilsTests` test suite to confirm
   your methods are correct.

Look for ways to make your life easier: some functions may
be able to utilize others.

* `public static double getMean(List<Integer> elements)` - computes the
  average of `elements`

* `public static int getMin(List<Integer> elements)` - returns the minimum
  of the `elements`

* `public static int getIndexOfMin(List<Integer> elements)` - returns
  the *index* of the the minimum of the `elements`

* `public static int getMax(List<Integer> elements)` - returns the maximum
  of the `elements`

* `public static int getIndexOfMax(List<Integer> elements)` - returns
  the *index* of the the maximum of the `elements`

* `public static List<Integer> filterThreshold(List<Integer> elements, int threshold)` -
  creates and returns a new `List` that contains only
  `elements` that are greater than or equal to `threshold`.
  For example, if we pass the `List`
  `[10, 5, 32, 8, 7, 28, 15, 12]`
  with `threshold = 10` then the returned array should be
  `[10, 32, 28, 15, 12]`

* `public static int[][] createMultiplicationTable(int n, int m)` - creates and
  returns a new `(n x m)` 2-D array that contains the values in
  a multiplication table.  For example, if `n = 3, m = 5` then
  the result should look like:
```text
[ 1   2   3   4   5 ]
[ 2   4   6   8  10 ]
[ 3   6   9  12  15 ]
```  

## Handin/Grader Instructions

* Hand in your completed source file, `ListUtils.java` through the
  handin and verify your program is correct by using the grader.
* Even if you worked with a partner, you *both* need to
  turn in all files.
