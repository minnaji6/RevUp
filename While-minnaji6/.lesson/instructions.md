# Instructions  
### Description:
You can create a loop to programmatically repeat a block of code. There are three main loops you can create: a while loop, do-while loop, and a for loop. Every loop has three main similarities:
* They have a condition that evaluates a boolean expression
* They have a code block that runs
* They need to update a value that is used in their condition
  
A while loop is used to repeat a group of statements until a condition becomes false. This loop is particularly useful for when you are uncertain about how many times the loop should repeat. Below is the syntax of a while loop:
```
while (condition) {
    // statements that repeat for every iteration (loop)
  }
```

In this activity you will learn how to use a while loop.  You will print all the numbers from x to 6 (x being a mystery number). You can assume x is always a larger number than 6.
Please follow the steps below:

### Steps:
1. Copy and paste the following code into the **main()** method:
```java
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number in the console above 6.");
int x = sc.nextInt();
sc.close();
```  
This code creates a Scanner object and saves it into the reference variable, *sc*. Next, we prompt the user to enter a number using a print statement, and then we get the user's response and save it into the variable, *x*. Lastly, we close the scanner object, as we will no longer need to read from the console.

2. Often, a loop needs to repeat a certain number of times. This is commonly done by making a variable to count the number of loops, and only looping while the variable is less than the maximum number of loops we want to run. Copy and paste the following example code into the **main()** method, below what you have there so far:
```java
int loopCount = 0;

while(loopCount < 10){
  System.out.println(loopCount);
  loopCount++;
}

System.out.println("The loop ended!\n");
```
The first statement creates a variable that starts at `0`, so as we increment it, it will represent the number of completed loops. 

Next, we create our while loop. This loop will execute until loopCount is no longer less than `10`. In the body of the while loop, we print the current loop count using the loopCount variable, and then we increment loopCount. loopCount has to be modified in some way that should eventually result in the while loop's condition being `false`, because otherwise we would have an infinite, or endlessly running, loop. This is because loopCount will always be 0 if not modified, which means the condition, `loopCount < 10`, will always evaluate to `true`.

Lastly, there is a print statement that will run after the loop ends. Run the program to see the output.

3. Now it's your turn! Create a while loop to print the values of x to `6`, decreasing in size by 1 each time. This will look similar to the example loop, but note that instead of starting at `0`, this one will start at x, and instead of increasing the value each loop, the value will decrease until it is no longer greater than or equal to` 6.`

### Test:
Use the test provided. 

#### Sample output:
If x was 10.
```
0
1
2
3
4
5
6
7
8
9
The loop ended!

10
9
8
7
6
```