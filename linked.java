package CodingDemo;

import java.util.concurrent.locks.*;

 class linked{
	
	 private static class Node{
		 private int data;
		 private Node next;
		 Node(int data){
			 this.data=data;
			 this.next=null;
		 }
	 }
	 public static void main(String[] args) {
		 Node head = new Node(9);
		 Node second = new Node(29);
		 Node third = new Node(95);
		 Node fourth = new Node(97);
		 
		 head.next=second;
		 second.next=third;
		 third.next=fourth;
		 
		 display(head);
		 int size=length1(head);
		Node pre= insert(head,123,4);
		 display(pre);
		 /*	 insertAtMiddle(third,45);
		 display(head);
		 Node n = insertNode(head,76);
		 display(n);
		 
		 Node last = new Node(100);
		 fourth.next=last;
		 display(n);
		 System.out.println("THis is final insert statement Dear");
		 Node end = insertAtEnd(n,120);
		 display(end);    */
	}
	 public static void display(Node head) {
		 if(head==null)
			 return;
		 Node current= head;
		 int count=0;
		 while(current!=null) {
			 System.out.print(" "+current.data+" -->");
			 current= current.next;
			 count++;
		 }
		 System.out.println(" null");
		 System.out.println("Number of ELEMENTS : "+count);
	 }
	 public static Node insertFirstNode(Node head,int data) {
		 Node newhead = new Node(data);
		 if(head==null)
	     return newhead;
		 newhead.next=head;
		 head = newhead;
		 return head;
	 }
     private static Node insertAtEnd(Node head,int data) {
    	 Node newhead= new Node(data);
    	 if(head==null)
         return newhead;
    	 Node current;
    	 current= head;
    	 while(current.next!=null) {
    		 current=current.next;
    	 }
    	 current.next=newhead;
    	 return head;
     }
     protected static void insertAtMiddle(Node second,int data) {
    	 if(second==null) {
    		 System.out.println("can't be Null");
    		 return;
    	 }
    	 Node newnode = new Node(data);
    	 newnode.next=second.next;
    	 second.next=newnode;
     }
      public static Node insert(Node pre,int data,int position) {
    	  if(pre==null)
    		  return pre;
    	  Node current = pre;
    	  int count=0;
    	  while(count<position-1) {
    		  count++;
    		  current=current.next;
    	  }
    	  Node newnode = new Node(data);
    	  newnode.next=current.next;
    	  current.next=newnode;
    	  
    	  return pre;
    }
      public static int length1(Node head) {
    	     int count=0;
    	     while(head!=null) {
    	    	 count++;
    	     }
    	      return count;
      }
 }
 