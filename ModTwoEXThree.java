import java.util.Scanner;
class ModTwoEXThree {
  public static void main(String[] args) {

    // Declaring variables  
    Scanner input = new Scanner(System.in);

    int sugarLevel;
    String mealStatus;

    // User input
    System.out.println("Your meal status");
    mealStatus = input.nextLine();
    System.out.println("Enter the Blood Sugar Level");
    sugarLevel = input.nextInt();
    
    input.close();

    // Check if person is diabetic or not

    if(sugarLevel < 100 && mealStatus == "fasting")
    {
        System.out.println("Your blood sugar level is normal");
    }
    else if(sugarLevel < 130 && mealStatus == "before a meal")
    {
         System.out.println("Your blood sugar level is normal");
    }
    else if(sugarLevel < 180 && mealStatus == "taking a meal")
    {
         System.out.println("Your blood sugar level is normal");
    }
    else
    {
         System.out.println("You have diabetes!!");
    }


  }
}