class Main {
  public static void getFifthElement(int[] array) {
     System.out.println(array[5]);
  }
  public static void main(String[] args) {
    int[] array = {1,2,3,4,5};
      try{
    getFifthElement(array);
  } catch (Exception ex) {
    System.out.println("caught!");
    ex.printStackTrace();
  }
  Dog dog = new Dog();
  Dog dog2 = null;
  try {
    dog.greet(dog2);
  }
  catch (Exception ex) {
    System.out.println("caught!");
  }
  
}
}