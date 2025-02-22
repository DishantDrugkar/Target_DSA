package org.example.LinkedList_Implementation.Methods;

public class addLast {
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
      if(head == null){
          System.out.println("LL is Empty");
          return;
      }
      while(currNode != null){
          System.out.print(currNode.data + " -> ");
          currNode = currNode.next;
      }
      System.out.println("NULL");
  }

    public static void main(String[] args) {
        addLast list = new addLast();
        list.addFirst(2);
        list.addFirst(1);
        list.addLast(3);
        list.addLast(4);
        list.print();

        list.print();
    }
}
