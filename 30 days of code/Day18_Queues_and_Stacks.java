import java.io.*;
import java.util.*;

public class Day18_Queues_and_Stacks {

    char st[];
    char que[];
    int top;
    int front;
    int rear;

    Day18_Queues_and_Stacks ()
    {
        top=-1;
        front=-1;
        rear=-1;
        st=new char[100];
        que=new char[100];
    }
    void pushCharacter (char ch)
    {
        st[++top]=ch;
    }

    void enqueueCharacter (char ch)
    {
        que[++rear]=ch;
    }

    char popCharacter ()
    {
        return st[top--];
    }

    char dequeueCharacter ()
    {
        return que[++front];
    }
    // Write your code here.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Day18_Queues_and_Stacks p = new Day18_Queues_and_Stacks();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;                
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is " 
                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
}