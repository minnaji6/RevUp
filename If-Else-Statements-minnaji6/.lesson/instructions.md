# Instructions  
### Description:
In this activity you will learn about how and when to use if else statements. If else statements are conditional statements, meaning they are a way to execute code depending on if a condition is met or not. The condition evaluates a boolean expression (an expression whose value is either `true` or `false`). The if statement contains a block of code that will execute _if_ the condition is `true`, and the optional else contains code that will execute if the condition evaluates to `false`.

To make an if statement, we need three parts: the `if` keyword, a condition enclosed in parentheses, and a block of code to execute, like the below example:
```
if (condition) {
  // code that will run if condition evaluates to true
}
```
The most common condtional operators are as follows:
- less than - <
- greater than - >
- less than or equal to - <=
- greater than or equal to - >=
- equal to - ==
- not equal to - !=


Please follow the steps below:

### Steps:
1. Copy and paste the following code into the main() method:
    ```java
      Scanner input = new Scanner(System.in);
      System.out.println("How old are you?");
      int age = input.nextInt(); 
      input.close();
    ```
This code creates a scanner object, asks the user their age using the console, saves the input int a variable, and then closes the scanner object. Now that we have a user's age, let's make decision based off of its value.
  
2. Copy and paste the following code into the main() method below any code you have so far:
  ```java
    int x = 5;
    
    if( x > 0 ){
      System.out.println("True!");
    }
  
    if( x == 0 ) {
      System.out.println("True!");
    }else{
      System.out.println("False!");
    }
  ```
  This code creates an int variable and assigns it the value `5`. We then an if statement that checks the variable's value to see if it is greater than `0`. If it is, the code block that follows will run. The next if statement checks if the value in the variable is `0`. If that condition evaluates to `true`, then the if statement's code block runs. Otherwise, the else block will run. Run the program to see the output.

3. Now it's your turn! Below any code you have so far in the main() method, make an if - else statement that checks if the age is 18 or above. _If_ it is then print out "You are beautiful!". _If not (else),_ print "You are so cute!". 


### Test:
Use the test provided. <br>
or<br>
To test the code yourself, you can run the code and when prompted enter a number in the console on the right, followed by enter.

#### Sample:
Input:
```
21
```
Output:
```
True!
False!
You are beautiful!
```