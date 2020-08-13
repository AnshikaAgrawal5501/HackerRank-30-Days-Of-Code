import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day20_Sorting
 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int i=0; i < n; i++){
            a[i] = in.nextInt();
        }

        int temp, cnt=0;
        for (int i=0; i<n; i++)
        {
            for (int j=0; j<n-1-i; j++)
            {
                if (a[j]>a[j+1])
                {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    cnt++;
                }
            }
        }

        System.out.println ("Array is sorted in "+cnt+" swaps.\nFirst Element: "+a[0]+"\nLast Element: "+a[n-1]);
        // Write Your Code Here
    }
}
