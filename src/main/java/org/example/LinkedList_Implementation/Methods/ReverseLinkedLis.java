package org.example.LinkedList_Implementation.Methods;

public class ReverseLinkedLis {
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
   public void addFirst(int data){
       Node newNode = new Node(data);
       if(head == null){
           head = tail = newNode;
           return;
       }
       newNode.next = head;
       head = newNode;
   }

   public void addLast(int data){
       Node newNode = new Node(data);
       if(head == null){
           head = tail = newNode;
           return;
       }
       tail.next = newNode;
       tail = newNode;
   }

   public void print(){
       Node currNode = head;
       while(currNode != null){
           System.out.print(currNode.data + " -> ");
           currNode = currNode.next;
       }
       System.out.println("NULL");
   }
    public void reverse(){
       Node prevNode = null;
       Node currNode = head;
       while(currNode != null){
           Node nextNode = currNode.next;
           currNode.next = prevNode;
           prevNode = currNode;
           currNode = nextNode;
       }
       head.next = null;
       head = prevNode;
    }
    public static void main(String[] args) {
        ReverseLinkedLis ll = new ReverseLinkedLis();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.print();
        ll.reverse();
        ll.print();
    }
}
