import java.util.Scanner;
class ModTwoEXFour {
  public static void main(String[] args) {
    
    // Declaring variables

    Scanner input = new Scanner(System.in);
    boolean wantsCarInMumbai;
    int numberOfHours;
    int totalBill = 0;
    // Check for the conditions

    // is user looking to rent a car in Mumbai?
    
    System.out.println("Are you looking to rent a car in Mumbai?");
    wantsCarInMumbai = input.nextBoolean();

    if(wantsCarInMumbai) // Is the user looking to rent a car in Mumbai?
    {
        System.out.println("For how many hours do you wish to rent a car?");
        numberOfHours = input.nextInt();
        totalBill += numberOfHours * 100;
        input.close();
        if(numberOfHours > 3) // is the number of hours requested by the user greater than 3?
        {
            if(totalBill > 300) // is the total bill higher than ₹300?
            {
                System.out.println("Congratulations!! your car is booked!!");
            }
            else
            {
                 System.out.println("Sorry! Unable to book your car!!");
            }
        } 
        else
        {
            System.out.println("Sorry! Unable to book your car!!");
        }
    }
    else
    {
        System.out.println("Sorry! Unable to book your car!!");
    }

  }
}