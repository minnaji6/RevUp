import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random; 
import java.lang.Math;
public class Main {
   public static void main(String[] args) {

     Random rand = new Random();
     Scanner sc = new Scanner(System.in);
     int num;

     Guess greater = new Greater();
      Guess less = new Less();
     UserGreeting u = new UserGreeting ();
     UserHint uh = new UserHint ();
     
     int randomNum = rand.nextInt(10) +1;
       // int randomNum = 6;
      // System.out.println(randomNum);
    
     u.greeting();
     System.out.println("Please Guess a number from 1-10"); 
     

     
     int userGuess = sc.nextInt();
    
     int caseVal = 0;
     if (userGuess == randomNum){
       caseVal =1;
     } else if (userGuess >= 11) {
       caseVal =2;
     } else if (userGuess < randomNum){
       caseVal =3; 
     } else if  (userGuess > randomNum) {
       caseVal = 4;
     }



     switch (caseVal){
       case 1:
      { System.out.println ("WOW! Great guess! You are right"); }
        break;
       case 2:
         System.out.println("Please run the program again and make a guess between the given range of 1-10");
          break;
      case 3:
         { System.out.println("Your number is less than the random number.  The random number added to your guess is " + less.hint(randomNum, userGuess) + " Try again");}
         try{
           num = sc.nextInt();
           if (num == randomNum)
           {System.out.println( "Great Job! You guessed right!"); uh.greeting();}
           else {
             System.out.println(" Wrong Guess, Better luck next time! The random number was " + randomNum + ". Please run the program again"); uh.greeting();
               };
         } catch (Exception e){
           System.out.println("Invalid Input. Enter an integer");}
         break;
       case 4:
         
         {System.out.println("Your number is greater than the random number. The random number multiplied by your guess is " + greater.hint(randomNum, userGuess) + " Try again");}
         try{
           num = sc.nextInt();
            if (num == randomNum)
           {System.out.println("Great Job! You guessed right!"); uh.greeting();}
           else {
          System.out.println("Wrong Guess, Better luck next time! The random number was " + randomNum + ". Please run the program  again");
             uh.greeting();
               }
         }
         catch (Exception e){
           System.out.println("Invalid Input. Enter an integer");
         }
         break;
     }

     System.out.println();
     System.out.println("Below is a collection of the difference between user guesses and the random number. ");
     System.out.println("The last number in the collection is the difference between your guess and the random number");

     int difference = (Math.abs(randomNum-userGuess));
     List<Integer> guess = new ArrayList<>();
     guess.add(2);
     guess.add(8);
     guess.add(0);
     guess.add((difference));
    for (Integer guesses: guess) {
       System.out.println(guesses);
    }

     
     }
  
}
  

