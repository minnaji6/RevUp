import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number in the console above 6.");
    int x = sc.nextInt();
    sc.close();

    int loopCount = 0;
    
    while(loopCount < 10){
      System.out.println(loopCount);
      loopCount++;
    }
    
    System.out.println("The loop ended!\n");

    while(x >= 6){
      System.out.println(x);
      x--;
    }
    
    System.out.println("The loop ended!\n");
  }
}