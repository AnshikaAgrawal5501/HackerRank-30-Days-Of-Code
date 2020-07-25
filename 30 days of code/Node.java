import java.io.*;
import java.util.*;

class Node {
	int data;
	Node next;
	Node(int d) {
        data = d;
        next = null;
    }
}

class Day15_Linked_list {

    public static  Node insert(Node head,int data) {
        Node temp=new Node(data);
        Node temp1, temp2;
        
        if (head==null)
        {
            head=temp;
        }
        else
        {
            temp1=head;
            
            while (temp1.next!=null)
            {
                
                temp1=temp1.next;
            }
            
            temp1.next=temp;
        }
        
        return head; 
        //Complete this method
    }

	public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while(N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head,ele);
        }
        display(head);
        sc.close();
    }
}