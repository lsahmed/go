// Number guessing game in java.

import java.util.*;

public class _temp{
  public static void main(String args[]){
    Random mynum = new Random();
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter limit: ");
    int limit = sc.nextInt();
    
    int theNum = mynum.nextInt(limit);

    int guessNum = -1;
    int guesses = 1;
    while(guessNum != theNum){
      System.out.print("Guess the number: ");
      guessNum = sc.nextInt();
      if(guessNum!=theNum){
        System.out.println("Sorry try again");
        guesses += 1;
      }else if(guessNum==theNum){
        System.out.println("You are correct, You guesses it in "+guesses+" time.");
      }
    }
  }
}
