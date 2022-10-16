class Main {
  public static void main(String[] args) {

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
    
  }
}