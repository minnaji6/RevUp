# Instructions  

### Description:
Welcome to your first program here! This activity is to help you use a simple print out statement to write `Hello World!` to the console.

Please follow the steps below to get started:

### Steps:
1. When writing a Java program, we create and use Java files. These files have the `.java` file extension. Note that there is one file in our project called `Main.java`. We will be working in this file.

Every Java file needs a **class declaration** and the class name must match the name of the file. Add in the following code to your Main.java file:
```Java
class Main {
  
}
```
This is a class declaration. Note the syntax. We use the `class` keyword and then name the class `Main` since our file is Main.java. We also have an opening and closing curly brace. These braces are the beginning and the end of the class. All of the code that you write needs to be inside of the class, which means it must be in-between the braces.

2. If you try to run your program now, you'll get an error in the Console tab. That's because your program is missing something very important. The **main method** is the starting point of your application and if your program doesn't have one, your program will not run! Add the following code **inside of your Main class**:
```Java
public static void main(String[] args) {
  
}

```
This code is the main method. You don't have to worry about what all of the keywords mean, just know that you'll need this block of code to start a Java application. We'll learn more about the main method later on. What we **do** need to know about the main method is that it also has curly braces that let us and Java know where it begins and ends.

Check your Main.java file. It should currently look like this:
```Java
class Main {
    public static void main(String[] args) {
    
  }
}
```
3. If you run the code now, you will no longer get an error in the console, but notice that nothing really seems to happen. That's because your program doesn't do anything yet. We need to add in statements. **Statements** are lines of code that perform a task. Let's add in a statement to our main method. Add in the following code **inside of the main() method**:
```Java
System.out.println("This will print to the console!");
```
Check your Main.java file. It should currently look like this:
```Java
class Main {
  public static void main(String[] args) {
      System.out.println("This will print to the console!");
  }
}
```
`System.out.println()` is what we use to print out a value to the console. The value we printed out is the text: `This will print to the console!`. In Java, text needs to be surrounded by double quotation marks. Also note that the statement ends in a semi-colon. This is also required by Java.

Run the program. In the Console tab, you should see `This will print to the console!` printed out.

4. Now it's your turn! In the main method, create a new statement that uses `System.out.println()` to print `Hello World!` to the console.

### Test:
Use the test provided. 

#### Sample output:
```
This will print to the console!
Hello World!
```
  