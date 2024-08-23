// Write a program to print Fibonacci series of n terms where n is input by user :
// 0 1 1 2 3 5 8 13 21 ..... 
import java.util.*;
public class exer9{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your number: ");
    int n = sc.nextInt();
  
    int n1 = 0;
    int n2 = 1;
    int fibo = 0;
  
    int i =1;
    while(i!=n){
      n1 = n2;
      fibo = n1+n2;
      n2 = fibo;
      System.out.print(fibo+" ");
      i++;
    }
  }
}