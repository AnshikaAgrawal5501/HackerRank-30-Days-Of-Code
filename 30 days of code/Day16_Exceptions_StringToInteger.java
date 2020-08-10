import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day16_Exceptions_StringToInteger
 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s=in.next();
        try
        {
            int S = Integer.parseInt(s);
            System.out.println (S);
        }
        catch (NumberFormatException e)
        {
            System.out.println ("Bad String");
        }
    }
}
