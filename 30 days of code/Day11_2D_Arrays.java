import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Day11_2D_Arrays
 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        scanner.close();

        int max=arr[0][0]+arr[0][1]+arr[0][2]+arr[1][1]+arr[2][0]+arr[2][1]+arr[2][2];
        int sum=0;
        for (int k=0; k<6-2; k++)
        {
            for (int j=0; j<6-2; j++)
            {
                sum=arr[k][j]+arr[k][j+1]+arr[k][j+2]+arr[k+1][j+1]+arr[k+2][j]+arr[k+2][j+1]+arr[k+2][j+2];

                if (sum>max)
                    max=sum;
            }
        }

        System.out.println (max);
    }
}