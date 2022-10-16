# Instructions  
You have learned a lot of information up to this point in the lessons. Today we will introduce our first data structure, the Array. A **data structure** is a construct that allows us to group together and work with multiple values. 

Arrays are a specific structure that uses **indexes**, which are numbers that represent the positions in the array. Arrays are also **zero-indexed**, which means that the index sequence starts at zero.

Arrays in Java are **fixed**, meaning once an array is created, you cannot add or remove **elements**, or values, from the array.

This exercise will have you practice creating and working with arrays.

  ## Steps
  1. Add the following code into your **main()** method:
```Java
int[] array1 = {4, 20, 15, 2, 19};
```
This is the syntax we use to create an array and assign it to a variable. Notice the variable's datatype is `int[]` which represents an an array of int values. If we wanted to reference an array of String values, we would specify that the variable's type is `String[]`. 

After creating our reference variable, we used the syntax to create an array. You use curly braces and pass in a comma-separated list of values you want to store in the array. Once the array is created, we cannot add or remove any positions in the array. 

Recall that arrays are zero-indexed. Here is a visual of which element is at which index:
```
{4, 20, 15, 2, 19}
 0   1   2  3   4  // indexes
```
Notice that there are 5 elements, but the last index is four. This is because our indexes start at zero.

2. Below what you have so far in your **main()** method, create a String array that contains the following elements and assign it to a variable called **words**:
- "Hello"
- "there"
- "how"
- "are"
- "you?"
<br><br>
  Make sure to assign your array to a variable!

3. Next, we'll access an element within our arrays. Add the following code below what you currently have in your **main()** method:
```Java
System.out.println(array1[2]);
```
The syntax `array1[2]` is what we use to access an element within an array. We use the reference variable, array1, to indicate what array we want to work with, and then we use square brackets to specify which index in the array we want to get the value of. We then print out the value to the console. Run the program to see the new output.

4. Below what you have so far in your **main()** method, create a statement that prints the element at index 1 from the **words** array to the console. Run the program to see the new output.

5. Now we will check the size of our arrays. Add the following code below what you currently have in your **main()** method:
```Java
System.out.println(array1.length);
```
Every array you create is an object. That means it can have properties and methods. One property that all arrays have is the **length** property. The property's value is the size of the array. In the example above, we are accessing the length property to get the size of our array, and then we print the size out to the console. Run the program to see the new output.

6. Below what you have so far in your **main()** method, create a statement that prints the length of the **words** array to the console. Run the program to see the new output.

7. A very common thing we want to do with an array is access each element, one at a time. To do this, we can use a for-loop to iterate over the array. Add the following loop below what you currently have in your **main()** method:
```Java
for (int i = 0; i < array1.length; i++) {
  System.out.println(array1[i]);
}
```
The for-loop creates a variable and initializes it: `int i = 0`. You can choose to name the variable whatever you'd like, but it is convention to name it `i`. This variable represents the current index of the array, which is why it starts at 0, the first index. 

After every iteration of the loop, this variable is incremented: `i++`. This means every loop allows us to access the next element in the array. 

The loop ends when we reach the last index in the array, which is the last position the array has: `i < array1.length`. The last index of an array will always be the array's length - 1. By setting our loop's condition to be "i must be less than the array's length", we are ensuring we don't go out of bounds and try to access a position that the array doesn't have. 

Lastly, in the loop's code block we print out the element of the array that is in the current index. We do this by using the syntax: `array1[i]` where `i` represents the current index. Run the program to see the new output.

8. Below what you have so far in your **main()** method, create a for-loop that iterates over the **words** array and prints out each element in the array.

9. Run this exercise's test to ensure you followed the lab accordingly.
  