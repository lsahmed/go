import java.util.*;
public class Functions{
  public static int returnMul(int a,int b){
    int mult = a * b;
    return mult;
  }
  
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter first number: ");
    int a = sc.nextInt();
    System.out.print("Enter second numer: ");
    int b = sc.nextInt();
    
    int mul = returnMul(a,b);
    System.out.println(mul);
      
    
  }
}