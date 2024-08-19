// Enter 3 numbers from the user & make a function to print their average.

import java.util.*;
public class exer1{
  public static void avg(int a,int b,int c){
    int average = (a+b+c)/3;
    System.out.println("The average of the numbers is: "+average);
    return;
  }
  
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter first numer: ");
    int a = sc.nextInt();

    System.out.print("Enter second numer: ");
    int b = sc.nextInt();

    System.out.print("Enter third number: ");
    int c = sc.nextInt();

    avg(a,b,c); // <-- calling the function 
    
  }
}