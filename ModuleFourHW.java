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
        
        /*
        Questions 1: Is it possible to write a method that takes string as an input and returns an array?
        If no, then why? If yes, then can we create a method/function in the code above that will take user
        entered string as input arguments and returns a character array for the first approach where string is converted
        into a character array?

        Example:
        public static <some_datatype><function_name>(<string_entered_by_user>)
        {
            some function logic;
            .
            .
            .
            return <array_of_characters_in_the_string_entered_by_user>
        }


        Question 2: In our program, we are asking user to input a character. But when the user inputs a string
        like "ab" or "dfg", the program halts and an error message is shown. With the help of while loop, or a
        do-while loop, is it possible to modify the code in such a way that when the user inputs anything else other
        than character, the program should prompt user to "enter a character" until user makes a correct input.

        Example:
        boolean exitFlag = false;
        while(!exitFlag)
        {
            #ask user to input a string;
            #ask user to input a character;
            if(user_input != character)
            {
                #ask user to input a character
            }
            else if(use_input_is_in_correct_format)
            {
                #store the input in variables;
                exitFlag = true;
            }
        }

        Question 3: Similar to first query, is it possible to encapsulate the second phase where we are checking the count
        of character in character array into a method/function where the function takes character to be checked and the array
        as arguments and returns the count of the character in an array?

        Example:
        public static <some_datatype><function_name>(<array_of_characters>, <charater_to_be_checked>)
        {
            some function logic;
            .
            .
            .
            return <num_of_occurrence_of_character_to_be_checked>
        }
        */

    }
}
