//Write a function to print the sum of all odd numbers from 1 to n.
import java.util.*;
public class exer2{
  public static void printSum(int n){
    int sum = 0;
    for(int i=1;i<=n;i++){
      if(i%2!=0){
        sum += i;
      }
    }
    System.out.println(sum);
    return;
  }
  
  public static void main(String args[]){
    Scanner myobj = new Scanner(System.in);
    System.out.print("Enter the number: ");
    int n = myobj.nextInt();

    printSum(n);
  }
}
