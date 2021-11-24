import java.util.Scanner;
class ModTwoEXTwo {
  public static void main(String[] args) { 
      // Declare the variables
      Scanner input = new Scanner(System.in);

      int number;

      // User input
      System.out.println("*****Even Odd Checker*****");
      System.out.println("Enter a number");
      number = input.nextInt();

      // number is eve if the remainder of number when divided by 2 is zero
      if(number%2 == 0){
          System.out.println(number+" is even.");
      }
      else{
          System.out.println(number+" is odd.");
      }  
  }
}