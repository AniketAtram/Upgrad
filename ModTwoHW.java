import java.util.Scanner;
class ModTwoHW {
  public static void main(String[] args) {
    
    // Variable declaration
    int num1, num2, num3;
    Scanner input = new Scanner(System.in);
    // User input
    num1 = input.nextInt();
    num2 = input.nextInt();
    num3 = input.nextInt();
    // Finding the greatest number

    System.out.println();
    if(num1 >= num2 && num1 >= num3){
        System.out.println(num1);
    }
    else if(num2 >= num1 && num2 >= num3){
        System.out.println(num2);
    }
    else{
        System.out.println(num3);
    }

  }
}