public class Dog extends Animal {
  public String breed;
  public Dog (String name, String breed, int age){
    super(name, age);
    this.breed = breed;
    System.out.println("Dog Class Parameterized Constructor Called.");
  }
  @Override
  public void printAnimalInfo() {
  super.printAnimalInfo();
  System.out.println("I am a Dog and my breed is: " + this.breed + ".");
}
  
}