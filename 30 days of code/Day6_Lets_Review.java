import java.io.*;
import java.util.*;

public class Day6_Lets_Review
 {

    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while (t>0)
        {
            String s=sc.nextLine();
            String s1="", s2="";
            for (int i=0; i<s.length(); i++)
            {
                if (i%2==0)
                {
                    s1=s1+s.charAt(i);
                }
                else
                s2=s2+s.charAt(i);
            }
            System.out.println (s1+" "+s2);
            t--;
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}