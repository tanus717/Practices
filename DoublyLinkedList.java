package CodingDemo;
import java.util.NoSuchElementException;

class DoublyLinkedList {
	private 
   DoublyLinkedList () {
		this.head = null;
		this.tail = null;
		this.length = 0;
	}
	private ListNode head;
	private ListNode tail;
	private int length;
	static class ListNode  {
		private ListNode next;
		private ListNode previous;
		private int data;
		public  ListNode(int data) {
			this.data = data;
		}
	}
	public boolean isEmpty() {
		return length==0;
	}
	public int length() {
		return length;
	}
	public void insertElement(int data) {
		 ListNode newNode =  new ListNode(data); 
		 if(isEmpty())
			 head=newNode;
		 else {
			   tail.next=newNode;
		 }
		 newNode.previous=tail;
		 tail = newNode;
		 length++;
	}
	public static void main(String[] args) {
		DoublyLinkedList dl = new DoublyLinkedList();
		dl.insertElement(12);
		dl.insertElement(15);
		dl.insertElement(9);
		dl.insertElement(11);
		dl.insertElement(8);
		
		dl.displayForward();
//		dl.displayBackword();
//		dl.firstNode(45);
//		dl.displayForward();
		dl.deleteFirst();
		dl.displayForward();
		}
  public void displayForward() {
	           ListNode current = head;
	           while(current!=null)  {
	        	        System.out.print(current.data+"-->");
	        	        current = current.next;
	           }
	           System.out.println(current);
  }
  public void displayBackword() {
      ListNode current = tail;
      while(current!=null)  {
   	        System.out.print(current.data+"-->");
   	        current = current.previous;
      }
      System.out.println(current);
}
  public void firstNode(int data) {
	  ListNode newNode =  new ListNode(data); 
		 if(isEmpty())
			 tail=newNode;
		 else 
			 head.previous=newNode;
		 
		     newNode.next=head;
		     head= newNode;
		     length++;
  }
  public void deleteFirst() {
	  ListNode current = tail;
	  if(isEmpty())
		  throw new NoSuchElementException("NO Elements are present in node ");
	  else  if(head==tail) {
		  tail=null;
		  head=null;
	  }
	  else {
		   tail.previous.next=null;
		   tail =tail.previous;
		   current.previous=null;
	  }
	  length--;
  }
}

 
 
 
 
 
 
 
 
 