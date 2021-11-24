import java.util.Scanner;
class ModTwoEXFive {
  public static void main(String[] args) 
  {
      // Declaring variables
      Scanner input = new Scanner(System.in);
      int month;

      System.out.println("Enter a number between 1-12");
      month = input.nextInt();

      // Use switch case to output the name of the month

      switch(month)
      {
          case 1:
          System.out.println("The month is January.");
          break;

          case 2:
          System.out.println("The month is February.");
          break;

          case 3:
          System.out.println("The month is March.");
          break;

          case 4:
          System.out.println("The month is April.");
          break;

          case 5:
          System.out.println("The month is May.");
          break;

          case 6:
          System.out.println("The month is June.");
          break;

          case 7:
          System.out.println("The month is July.");
          break;

          case 8:
          System.out.println("The month is August.");
          break;

          case 9:
          System.out.println("The month is September.");
          break;

          case 10:
          System.out.println("The month is October.");
          break;

          case 11:
          System.out.println("The month is November.");
          break;

          case 12:
          System.out.println("The month is December.");
          break;

          default:
          System.out.println("Enter a number between 1 to 12");
      }   


  }
}