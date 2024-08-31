import java.util.*;

public class justprob{
  public static void main(String args[]){
    String result;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your string: ");
    String objt = sc.next();
    result = "";
    for(int i=0;i<objt.length();i++){
      if(objt.charAt(i) == 'e'){
        result += 'i';
      }else{
        result += objt.charAt(i);
      }
    }
    System.out.println(result);
      
    
    
  }
}