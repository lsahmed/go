import java.util.*;
public class twoD{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter numbers of rows: ");
    int rows = sc.nextInt();
    System.out.print("Enter numbers of cols: ");
    int cols = sc.nextInt();

    int[][] itsnumbers = new int[rows][cols];
   
    for(int i=0;i<rows;i++){
      for(int j=0;j<cols;j++){
        itsnumbers[i][j] = sc.nextInt();
      }
    }

    System.out.print("Enter the number to find: ");
    int x = sc.nextInt();
    for(int i=0;i<rows;i++){
      for(int j=0;j<cols;j++){
        if(itsnumbers[i][j]==x){
          System.out.println("number " + x + " Found at indices: " + i + "," + j);
        }
      }
    }
  }
}