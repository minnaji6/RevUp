import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
   System.out.println("Enter an integer value");
   int original = sc.nextInt(); 
   sc.close();

    int copy = original;

    System.out.println(original + " equals " + copy + ": " + (original == copy));
     if(copy == original){
   System.out.println("(copy == original) is " + (copy == original));
 }
    int num1 = 100;
    int num2 = 100;
      if (num1 == num2) {
      System.out.println("They are equal");
      }
  System.out.println("string"=="string");
  System.out.println("string".equals("string"));

    String string1 = "Hello World";
    String string2 = new String("Hello World");
  System.out.println(string2 == string1);
  System.out.println(string2.equals(string1));
    
  }
}