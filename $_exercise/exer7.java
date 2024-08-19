// Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered.

import java.util.Scanner;
public class exer7{
  public static void main(String args[]){
    int positive = 0, negative = 0, zeros = 0;
    Scanner sc = new Scanner(System.in);
    System.out.print("Press 1 to start or 0 to stop: ");
    int input = sc.nextInt();
    while(input==1){
      System.out.print("Enter your number: ");
      int num = sc.nextInt();
      if(num>0){
        positive++;
      }else if(num<0){
        negative++;
      }else{
        zeros++;
      }
      System.out.print("Press 1 to continue or 0 to stop: ");
      input = sc.nextInt();
    }
    System.out.println("Positive: "+positive);
    System.out.println("Negative: "+negative);
    System.out.println("zeros: "+zeros);
  }
}