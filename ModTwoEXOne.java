import java.util.Scanner;
class ModTwoEXOne {
  public static void main(String[] args) {

      // Declare the variable and scanner
      Scanner input = new Scanner(System.in);

      int numberOne;
      int numberTwo;

      // Take input from user and store them in their respective variable names
      System.out.println("Enter first number");
      numberOne = input.nextInt();
      System.out.println("Enter second number");
      numberTwo = input.nextInt();

      // Find the product of two numbers
      System.out.println("Product of "+numberOne+" and "+numberTwo+" is "+numberOne*numberTwo);

      // Increment the first number by one
      System.out.println(numberOne+" is incremented to "+ ++numberOne);

      // Find the minimum of two
      int minValue = (numberOne>numberTwo)?numberTwo:numberOne;
      System.out.println("The minimum value is : "+minValue);

      // Find the bitwise AND of the two numbers
      int bitwiseAnd = numberOne & numberTwo;
      System.out.println(numberOne+" AND "+numberTwo+" is "+ bitwiseAnd);




  }
}
