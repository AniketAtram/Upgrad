import java.util.Scanner;
class ModOnEXOne {
  public static void main(String[] args){
      
      // input
      Scanner input = new Scanner(System.in);

      // Variable Declaration
      
      String nameOfTeacher; // Name is a string
      int ageOfTeacher; // Age is a integer value ranging from 0-100
      String gender; // gender could be "Male" or "Female"
      String aadharCardNumber; // since aadhar number has spaces it is better to use string rather than integer or long 
      float salary; // the salary is required to have decimal value only upto two places

      // Variable Initialization

      System.out.println("Enter the name of teacher:");
      nameOfTeacher = input.nextLine();
      System.out.println("Enter the age of teacher:");
      ageOfTeacher = input.nextInt();
      System.out.println("Enter the gender of teacher:");
      gender = input.next();
      System.out.println("Enter the aadhaar number of teacher:");
      aadharCardNumber = input.next();
      System.out.println("Enter the salary of teacher:");
      salary = input.nextFloat();

      // Printing the values input by user

      System.out.println("Name of teacher is: "+nameOfTeacher);
      System.out.println("Age of teacher is: "+ageOfTeacher);
      System.out.println("Gender: "+gender);
      System.out.println("Aadhar number: "+aadharCardNumber);
      System.out.println("Salary: "+salary);

        
  }
}