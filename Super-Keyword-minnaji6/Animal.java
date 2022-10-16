public class Animal {
  // Fields for Animal class
  public String name;
  public int age;

  // Parameterized Constructor for Animal class
  public Animal(String name, int age) {
    this.name = name;
    this.age = age;
    System.out.println("Animal Class Parameterized Constructor Called.");
  }

  // Method for Animal class
  public void printAnimalInfo() {
    System.out.println("My name is: " + this.name + ", I am: " + this.age + " year(s) old.");
  }
}