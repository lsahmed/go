import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner myobj = new Scanner(System.in);
    System.out.println("Enter how many times you want the word:");

    int num = myobj.nextInt();
    for(int i=1; i<=num; i++){
      System.out.println("Hello");
    }
  }
}