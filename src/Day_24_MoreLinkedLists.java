import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//https://www.hackerrank.com/challenges/30-linked-list-deletion/problem
public class Day_24_MoreLinkedLists {
    static class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }

    }
    static class Solution
    {

        public static Node removeDuplicates(Node head) {
            //Write your code here
            if (head==null)
                return head;
            Set<Integer> set =new HashSet<Integer>();
            Node current = head;
            Node n =current.next;

            set.add(current.data);

            while(n!=null) {
                if(set.contains(n.data)) {
                    current.next=n.next;
                } else {
                    set.add(n.data);
                    current=n;
                }
                n=n.next;
            }
            return head;
        }

        public static  Node insert(Node head,int data)
        {
            Node p= new Node(data);
            if(head==null)
                head=p;
            else if(head.next==null)
                head.next=p;
            else
            {
                Node start=head;
                while(start.next!=null)
                    start=start.next;
                start.next=p;

            }
            return head;
        }
        public static void display(Node head)
        {
            Node start=head;
            while(start!=null)
            {
                System.out.print(start.data+" ");
                start=start.next;
            }
        }
        public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            Node head=null;
            int T=sc.nextInt();
            while(T-->0){
                int ele=sc.nextInt();
                head=insert(head,ele);
            }
            head=removeDuplicates(head);
            display(head);

        }
    }
}
