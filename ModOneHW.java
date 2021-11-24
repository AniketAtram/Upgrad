import java.util.Scanner;
class ModOneHW {
  public static void main(String[] args) {
    
    // user input
    Scanner input = new Scanner(System.in);
    
    // Variable Declaration
    int assetTackingNumber;
    String assetName;
    float assetValue;

    // Variable Initialization w.r.t user input
    
    // System.out.println("Enter asset Tracking number: ");
    assetTackingNumber = input.nextInt();
    // System.out.println("Enter asset name: ");
    assetName = input.next();
    // System.out.println("Enter asset value: ");
    assetValue = input.nextFloat();
    
    input.close();
    // Printing the values

    System.out.println(assetTackingNumber);
    System.out.println(assetName);
    System.out.println(assetValue);
  }
}