// The use of the 'extends' keyword in the class declaration establishes that Reptile is a child of the class Animal
public class Reptile extends Animal { 
  // Field for the Replit class
  public int legCount;

  // Parameterized Constructor for Reptile Class
  public Reptile (String name, int age, int legCount) {
    super(name, age);
    this.legCount = legCount;
    System.out.println("Reptile Class Parameterized Constructor Called.");
  }
    @Override
public void printAnimalInfo() {
  super.printAnimalInfo();
  System.out.println("I am a Reptile with " + legCount + " leg(s).");
}
}