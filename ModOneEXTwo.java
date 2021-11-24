Twoimport java.util.Scanner;
class ModOneEXTwo {
  public static void main(String[] args) {
      
      // Variable declarations
        Scanner input = new Scanner(System.in);
        String nameOfProduct;
        float price;
        int quantity;
      // Store user input in variables declared previously
      System.out.println("Enter the name of product:");
      nameOfProduct = input.nextLine();
      System.out.println("Enter price of product:");
      price = input.nextFloat();
      System.out.println("Enter the quantity:");
      quantity = input.nextInt();

      // Print the values
      System.out.println("Name : " + nameOfProduct);
      System.out.println("Price : Rs." + price);
      System.out.println("Quantity : "+quantity);
  }
}