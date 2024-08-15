// Write a program to calculate the factorial of n;

import java.util.*;
public class _temp{
  public static int fact(int n){
    int factorial = 1;
    for(int i=n;i>=1;i--){
      factorial = factorial*i;
    }
    return factorial;
  }
  
  public static void main(String args[]){
    Scanner myobj = new Scanner(System.in);
    System.out.print("Enter the number you want factorial of: ");
    int n = myobj.nextInt();

    int fact = fact(n);
    System.out.println(fact);
    
  }
}