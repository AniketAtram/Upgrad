// printing prime numbers from 1-1000
/*
LOGIC: A prime number will have at most two factors, number 1, and the number itself
In the following program we are using the same logic
Step 1: Use a for loop to loop through the numbers
Step 2: To keep a count of all factors make use of a variable called counter
Step 3: Open another loop in such a way that it decrements the value after each iteration and
        the value starts from the variable at outer loop
Step 4: If the number is divisible by other number increment the counter by 1 else do nothing
Step 5: When the condition is exhausted check how many factors exists. If the number of factors
        are more than two, then the number is not prime.
Step 6: If step 5 is true, number is prime, print the number in the output console.*/

public class ModThreeEXSix
{
    public static void main(String[] args)
    {

        // declaring the variable
        int i,j;

        for(i=1;i<=1000;i++) // outer loop that iterates through numbers from 1-1000
        {
            int counter = 0; // a counter to keep track of the number of factors of a number

            for(j=i;j>=1;j--) // inner loop that starts from the number at outer loop and keeps decrementing
            {
                if(i%j==0) // check if the number has a factor. If the result is zero, it will increment the counter
                {
                    counter += 1;
                }
            }
            if(counter == 2) // see if there  are exactly two factors or not
            {
                System.out.print(i + " "); // print the prime number
            }
        }
    }
}
