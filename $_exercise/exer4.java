// Write a function that takes in the radius as input and returns the circumference of a circle.
import java.util.Scanner;
public class exer4{
  public static float circum(float radius){
    float pie = 3.14f;
    float circumference = 2*pie*radius;
    return circumference;
  }
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the radius: ");
    float radius = sc.nextFloat();

    float theCircumference = circum(radius);
    System.out.println(theCircumference);
  }
}