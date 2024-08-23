import java.util.*;
public class sortx{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter size of your array: ");
    int size = sc.nextInt();
    int numbers[] = new int[size];
    for(int i=0;i<size;i++){
      numbers[i] = sc.nextInt();
    }
    boolean issort = true; //--> Is array sort default set on True;
    for(int i=1;i<numbers.length;i++){
      if(numbers[i-1]>numbers[i]){
        issort = false;
      }
    }
    if(issort){
      System.out.println("Array is in sorted manner.");
    }
    else{
      System.out.println("Array is not in sorted manner.");
    }
  }
}