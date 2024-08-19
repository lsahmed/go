// Write a function that takes in age as input and returns if that person is eligible to vote or not.

import java.util.Scanner;
public class exer5{
  public static boolean canVote(int age){
    if(age>18){
      return true;
    }
    return false;
  }
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your age: ");
    int age = sc.nextInt();

    boolean isVote = canVote(age);
    if(isVote==true){
      System.out.println("Yes,You can vote");
    }else{
      System.out.println("No, you cant vote");
    }
  }
}
