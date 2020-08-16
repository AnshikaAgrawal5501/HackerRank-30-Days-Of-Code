import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day25_RunningTime_and_Complexity
 {

    public static void main(String[] args) {

        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        while (t-->0)
        {
            int n=sc.nextInt();
            boolean flag=false;
            for (int i=2; i<=Math.sqrt(n); i++)
            {
                if (n%i==0)
                {
                    flag=true;
                    break;
                }
            }
            if (flag==false && n!=1)
            System.out.println ("Prime");
            else
            System.out.println ("Not prime");
        }
        /* Enter your code here. */
    }
}



