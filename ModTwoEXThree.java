import java.util.Scanner;
class ModTwoEXThree {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

  		System.out.println("Enter your blood sugar level while fasting");
  		int sugarLevelFasting = input.nextInt();
  		System.out.println("Enter your blood sugar level before meal");
  		int sugarLevelBeforeMeal = input.nextInt();
  		System.out.println("Enter your blood sugar level after meal");
  		int sugarLevelAfterMeal = input.nextInt();

  		// System.out.println(sugarLevelFasting);
  		// System.out.println(sugarLevelBeforeMeal);
  		// System.out.println(sugarLevelAfterMeal);

  		String okMsg = "Your blood sugar level is normal";
  		String notOkMsg = "You have diabetes...";

  		if((sugarLevelFasting < 100) && (sugarLevelBeforeMeal < 130) && (sugarLevelAfterMeal < 180)) {
  			System.out.println(okMsg);
  		}

  		else {
  			System.out.println(notOkMsg);
  		}

  }
}
