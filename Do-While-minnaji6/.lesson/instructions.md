# Instructions
In this activity you will learn how to use a **do-while** loop. Recall that a loop is an iterative statement that repeats a block of code until its condition evaluates to `false`. 

The do-while loop is very similar to a while loop. The main difference is that a while loop checks its condition before running its code block and a do-while loop runs its code block and then checks its condition. This ensures that the code block will run at least once, even if the condition initially evaluates to `false`.


In this activity we will learn how to use a do-while loop. Please follow the steps below:

### Steps:
1. Copy and paste the following code into the **main()** method:
```Java
int num = 1;

do {
  System.out.println(num);
  num++;
} while (num <= 10);
```
The first statement creates a variable and assigns it an initial value. Typically, loops rely on a variable to check it's value in the loops condition. Next, the do-while loop is created. Note its syntax. It begins with the **do** keyword and follows with a code block. Next there is the **while** keyword and a condition that is checked. Because the code block comes before the condition.

In the code block, we print the current value of **num** and then increment it. In the condition, we check if **num** is less than or equal to `10`. If it is, we run the loop again. Once **num**'s value surpasses `10`, the loop ends. When you run the program, you'll notice the output is every number between `1` and `10` (inclusive).

2. Below the code you have so far in the **main()** method, create a do-while loop that prints out the numbers from `20` - `1` (inclusive). 

### Test:
Use the test provided. 

#### Sample output:
```
1
2
3
4
5
6
7
8
9
10
20
19
18
17
16
15
14
13
12
11
10
9
8
7
6
5
4
3
2
1
```