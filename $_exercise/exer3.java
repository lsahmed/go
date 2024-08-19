// Write a function which takes in 2 numbers and returns the greater of those two.
import java.util.Scanner; // <-- just importing scanner
public class exer3{
  public static int greatTwo(int a,int b){
    int greatest = 0;
    if(a>b){
      greatest = a;
    }else if(a<b){
      greatest = b;
    }

    return greatest;
  }
  public static void main(String args[]){
    Scanner myobj = new Scanner(System.in);
    System.out.print("Enter first number: ");
    int a = myobj.nextInt();

    System.out.print("Enter second number: ");
    int b = myobj.nextInt();

    int greatNum = greatTwo(a,b);
    System.out.println("The greater number is: "+greatNum);
  }
}