import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day1_Data_Types 
{

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */

        int z=scan.nextInt();
        double a=scan.nextDouble();//after taking the input in double, cursor is moved to the end of the double input ( 5.6_ )
        scan.nextLine();//to move the cursor to the next line.
        String b=scan.nextLine();

        System.out.println ((z+i)+"\n"+(a+d)+"\n"+s+b);
        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.

        /* Print the sum of both integer variables on a new line. */

        /* Print the sum of the double variables on a new line. */

        /* Concatenate and print the String variables on a new line; 
        the 's' variable above should be printed first. */

        scan.close();
    }
}