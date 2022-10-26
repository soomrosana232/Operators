import java.util.*;
class evenodd{
  public static void main(String args[]){
    Scanner ob =  new Scanner(System.in);
    System.out.println("Enter the number.");
    int num = ob.nextInt();
    if (num % 2 == 0){
       System.out.println("number is even");
       System.out.println(num);
    }
    else{
      System.out.println("number is odd");
      System.out.println(num);   
  }
}
}
 