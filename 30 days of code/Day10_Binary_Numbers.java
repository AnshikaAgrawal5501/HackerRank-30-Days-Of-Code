import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Day10_Binary_Numbers
 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();

        int ar[]=new int[100];
        int rem, i=0;
        while (n!=0)
        {
            rem=n%2;
            n=n/2;
            ar[i++]=rem;
        }
        int cnt=0, max=0;
        for (int x=0; x<i; x++)
        {
            if (ar[x]==1)
            {
                cnt++;
            }
            else
            {
                if (cnt>max)
                max=cnt;
                cnt=0;
            }
        }
        if (cnt>max)
        max=cnt;
        System.out.println (max);
    }
}
