// Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. x^n.
import java.util.*;
public class exer8{
  public static int sqofn(int x,int n){
    int square = 1;
    for(int i=1;i<=n;i++){
      square *= x;
    }
    return square;
  }
  public static void main(String args[]){
    Scanner myobj = new Scanner(System.in);
    System.out.print("Enter base number: ");
    int x = myobj.nextInt();

    System.out.print("Enter the power number: ");
    int n = myobj.nextInt();

    int thesquareis = sqofn(x,n);
    System.out.println(x+" raised to the power "+n+" is: "+thesquareis);
  }
}