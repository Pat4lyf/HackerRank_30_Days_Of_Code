import java.util.Scanner;

//https://www.hackerrank.com/challenges/30-linked-list/problem?isFullScreen=true
public class Day_15_LinkedList {
    static class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }

    static class Solution {

//        Method1
        public static  Node insert(Node head,int data) {
            //Complete this method
            Node current = head;
            Node newNode = new Node(data);
            if(head == null) {
                head = newNode;
            } else {
                while (current != null) {
                    if(current.next == null) {
                        current.next = newNode;
                        break;
                    }
                    current = current.next;
                }
            }

            return head;
        }

//        Method2
        public  static Node insert2(Node head, int data) {
            Node current = head;
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
            } else {
                head.next = insert2(head.next, data);
            }
            return head;
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
}
