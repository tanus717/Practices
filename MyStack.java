package CodingDemo;
import java.util.NoSuchElementException;

public class MyStack {
	private ListNode top;
	private int length;
  private  class ListNode {
	  private int data;
	  private ListNode next;
	  public ListNode (int data) {
		  this.data = data;
		  this.next  = null; 
	  }
  }
  public MyStack() {
	top =null;
	length =0;
}
  public   int length() {
	  return length;
  }
  public  boolean isEmpty()   {
	  return length==0;
  }
  public int push( int data) {
	  ListNode newNode =  new ListNode(data);
	  if(isEmpty()) {
		   top = newNode;
		   length++;
	  }
	  newNode.next=top;
	  top = newNode;
	  length++;
	  return top.data;
  }
  public int pop() throws Exception {
	  if(isEmpty()) {
		  throw new Exception("No node");
	  }
	      int data = top.data;
	      top = top.next;
	      length--;
	      return data;
  }
  public int peek() {
	  int result  =  top.data;
	  return result;
  }
  
	public static void main(String[] args) throws Exception {
                              MyStack m =  new MyStack();
                             m.push(12);
                             m.push(34);
                             m.push(142);
                             System.out.println("Length is : "+m.length);
                             System.out.println("Remove Node is :" + m.pop());
                             System.out.println("Length is : "+m.length);
                             System.out.println("top value is : "+m.peek());
                             System.out.println("insert elements is : "+m.push(45));
                             System.out.println("Length is : "+m.length);
	}

}
