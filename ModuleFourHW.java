// Program to count the occurrence of a character in a given string
/*
Pseudo-code:
Step1: Take input from the user as a string
Step2: Ask user what specific character it wants to count
Step3: Convert the input string to character array using Java's inbuilt methods or naive approach 
Step6: Loop through each character and count the sequence and print it to the user
*/

import java.util.*;


public class ModuleFourHW
{
    public static void main(String[] args)
    {
        // TODO: Declare variables and scanner for user inputs

        Scanner input = new Scanner(System.in); // Scanner for taking user input

        String sentence; // the variable that will hold the input string
        char character; // the variable that holds the character which is being checked in the input string
        int count; // the variable that holds the number of times a character appears in the input string

        // TODO: Take input from the user and store then in a variable
        System.out.print("Enter a string: "); // prompt to enter a string
        sentence = input.nextLine(); // user inputs a string
        System.out.print("Enter a character: "); // prompt user to enter a character
        character = input.nextLine().charAt(0); // user inputs a character

        // TODO: Convert the input string into character array

        // Method 1: Using 'charAt()' method

        sentence = sentence.toLowerCase(Locale.ROOT).replace(" ", ""); // remove white spaces from input string and convert the string to lowercase
        character = Character.toLowerCase(character); // convert the input character to lowercase

        char[] charactersArray = new char[sentence.length()]; // array consisting of characters from the input string

        for(int i=0;i<sentence.length();i++) // iterate through the for loop and enter each character in the character array
        {
            charactersArray[i] = sentence.charAt(i); // char at checks each character at index location and stores it in character array
        }

        // TODO: To count the occurrence of character in the string
        count = 0; // initialize count to 0
        for (char c : charactersArray) // Use 'foreach' or 'enhanced for loop' to iterate through array
        {
            if(c == character) // if the character matches the input character increment the count by 1
            {
                count +=1;
            }
        }

        // Print the output to user
        System.out.println("There is/are "+count+ " " +"'"+Character.toUpperCase(character)+"'"+" in the input string.");


        // TODO: Alternative approach to converting input string to array using 'toCharArray' method
        /*
        char[] charArray = sentence.toCharArray(); // This one line of code does the exact same thing as above

        for (char x:charArray)
        {

            System.out.println(x);
        }
        */
    }
}
