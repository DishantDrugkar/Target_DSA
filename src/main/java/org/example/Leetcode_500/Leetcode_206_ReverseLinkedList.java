package org.example.Leetcode_500;

public class Leetcode_206_ReverseLinkedList {
   public static class Node{
       int data;
       Node next;
       public Node(int data){
           this.data = data;
           this.next = null;
       }
   }
   public static Node head;
   public static Node tail;

   public void addLast(int data){
       Node newNode = new Node(data);
       if(head == null){
           head = tail = newNode;
           return;
       }
       tail.next = newNode;
       tail = newNode;
   }
   public void print(Node head){
       Node currNode = head;
       while(currNode != null){
           System.out.print(currNode.data + " -> ");
           currNode = currNode.next;
       }
       System.out.println("NULL");
   }
   public Node reverse(Node head){
       if(head == null || head.next == null){
           return head;
       }
       Node prevNode = null;
       Node currNode = head;
       while(currNode != null){
           Node nextnode = currNode.next;
           currNode.next = prevNode;
           prevNode = currNode;
           currNode = nextnode;
       }
       return prevNode;
   }
    public static void main(String[] args) {
       Leetcode_206_ReverseLinkedList list = new Leetcode_206_ReverseLinkedList();

       list.addLast(1);
       list.addLast(2);
       list.addLast(3);
       list.addLast(4);
       list.addLast(5);
       list.print(head);

       list.head = list.reverse(list.head);
       list.print(head);
    }
}
