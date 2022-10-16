# Instructions  
### Description:
So far, when we have been creating classes, these classes sometimes define **class members**, or variables and methods. So far, the class members we have been defining have been **instance members**. When an object of a class is created, it is given copies of any instance members defined in that class. The objects then use their own copies of these variables and methods.

Today, you will learn how and when to use the **static** keyword to create **static members**, which are static variables and methods. When a class member is static, there is only ever one copy of that member, and it belongs solely to the class itself, not to any objects created from the class.

In this activity there can be multiple apartments using the same watertank. You will have to finish the watertank class so that whenever an apartment uses water they use up some of the water in the watertank. This amount should decrease for everyone even if only one apartment uses water.

Please follow the steps below:

### Steps:
1. Add in the Apartment class to the **Apartment.java** file:
```Java
public class Apartment {

  // instance variable
   int floorNumber;

  // constructor
   public Apartment(int floorNumber) {
     this.floorNumber = floorNumber;
   }

  // instance method
   public void useWater() {
    
   }
    
}
```
This class allows us to create Apartment objects. Looking at the class, we can see that it defines one instance variable,  **floorNumber**. Because it is an instance variable, this means every Apartment object created from the class will have its own floorNumber variable.

A **parameterized constructor** is then defined and it takes in one value that is used to initialize an Apartment object's floorNumber to whatever value is passed in to the constructor. We'll see an example of how to use this constructor later on in this lab, and we'll go over parameterized constructors in more detail in a later lab. 

Lastly, an instance method, **useWater()** is defined, but it is unfinished. We'll finish it later on in this lab.

2. Next, let's create the WaterTank class. Add in the following code to the **WaterTank.java** file:
```Java
class WaterTank {

}
```
3. The WaterTank class represents the water that the Apartment objects will be sharing. Let's create a static variable will represent the current water level of the tank. Add in the following code into the WaterTank class:
```Java
public static int waterLevel = 100;
```
Note that we added in the **static** keyword in our variable's declaration, right in front of the datatype. This indicates to the JVM that the member is static and there should only be one copy of the variable (no copies are given to objects created from the class). This means, in order to use the variable, we have to directly access it from the class itself, rather than by using an object. We'll demonstrate how to do this in the next step. We also initialized the variable to `100`.

4. Next, let's create a static method and have it use our waterLevel variable. Add the following code inside your WaterTank class, below what you have so far:
```Java
public static void printWaterLevel() {
  System.out.println("Water level: " + WaterTank.waterLevel);
}
```
We created a static method named printWaterLevel(). Notice that it also has the **static** keyword that is placed before the method's return type. This indicates to the JVM that the member is static and in order to call the method, you call it directly from the class, rather than from an object.

Inside of the method, we also access and use the static waterLevel variable. Notice the syntax: `WaterTank.waterLevel`. Rather than creating and using an object to access the waterLevel, we referenced the class itself to access it.

5. Now its your turn to create a static method and call it. Create a static method called decreaseWaterLevel() that does the following:
- IF the waterLevel is greater than `0`, reduce the waterLevel by `10` and print the following string to the console: `"Water gushes"`.
- ELSE have the method print out the following string instead: `"No water!"` and do not reduce the waterLevel.
  
6. Go back to the useWater() method in Apartment.java and update it to resemble the following code:
```Java
  // instance method
   public void useWater() {
      WaterTank.decreaseWaterLevel();
   }
```
Notice that we added a statement. This statement calls the WaterTank class's static method, decreaseWaterLevel(). Again, notice that when we try to use a static member, we do not create any objects. Instead, we directly reference the class to access the static member.

7.  In the same method's code block, have it call the WaterTank class's static method **printWaterLevel()** below what you have so far.
    
8. Now it's time to test the program! Add in the following code to your Main.java file's **main()** method:
```Java
// create some Apartment objects
Apartment apartment1 = new Apartment(234);
Apartment apartment2 = new Apartment(123);

// use the objects' instance variables
System.out.println("Apartment1's floor number: " + apartment1.floorNumber);
System.out.println("Apartment2's floor number: " + apartment2.floorNumber);

// keep using up the water until there is no water left
for(int i = 0; i <= 5; i++) {
  // use the objects' instance methods
  apartment1.useWater();
  apartment2.useWater();
}
```
We create two Apartment objects using the paramaterized constructor. Each Apartment is given its own copy of the floorNumber instance variable, and we can see that in the output when you run the program. We then create a loop to call their useWater() methods until there is no more water to use. Notice that they each affect the same waterLevel variable. Because waterLevel is static, there is only one copy. Lastly, notice that because useWater() is an instance method, we have to use the Apartment objects in order to call it. 

### Test:
Use the test provided. This test uses the sample code from the main method in Main.java.

#### Sample output:
```
Apartment1's floor number: 234
Apartment2's floor number: 123
Water gushes
Water level: 90
Water gushes
Water level: 80
Water gushes
Water level: 70
Water gushes
Water level: 60
Water gushes
Water level: 50
Water gushes
Water level: 40
Water gushes
Water level: 30
Water gushes
Water level: 20
Water gushes
Water level: 10
Water gushes
Water level: 0
No water!
Water level: 0
No water!
Water level: 0
```