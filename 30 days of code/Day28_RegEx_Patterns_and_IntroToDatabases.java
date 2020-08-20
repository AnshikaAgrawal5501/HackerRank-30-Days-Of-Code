import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.Arrays;

public class Day28_RegEx_Patterns_and_IntroToDatabases
{



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String ar[]=new String [N];
        int x=0;
        String ptrn="@gmail.com";
        Pattern p=Pattern.compile(ptrn);

        for (int NItr = 0; NItr < N; NItr++) {
            String[] firstNameEmailID = scanner.nextLine().split(" ");

            String firstName = firstNameEmailID[0];

            String emailID = firstNameEmailID[1];

            Matcher m=p.matcher(emailID);
            if (m.find())
            {
                ar[x++]=firstName;
              //  System.out.println (firstName);
            }
        }

        String temp;
        for (int i=0; i<x; i++)
        {
            for (int j=0; j<x-1-i; j++)
            {
                if (ar[j].compareTo(ar[j+1])>0)
                {
                    temp=ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=temp;
                }
            }
        }

        for (int i=0; i<x; i++)
        {
            System.out.println (ar[i]);
        }

        scanner.close();
    }
}
