import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Day5_loops
{
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int p=1;
        for (int i=1; i<=10; i++)
        {
            p=n*i;
            System.out.println (n+" x "+i+" = "+p);
        }

        scanner.close();
    }
}
