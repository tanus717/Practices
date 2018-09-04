package CodingDemo;
class Temp{
//	static ListNode head;
	   private static class ListNode {
		 private int data;
		 private ListNode next;
		 private ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	 }	 
	   public static void main(String[] args) throws Exception {
		   

		   ListNode head = new ListNode(46);
		   ListNode second = new ListNode(46);
		   ListNode third = new ListNode(15);
		   ListNode fourth = new ListNode(26);
		   ListNode fifth = new ListNode(46);
		   ListNode sixth = new ListNode(49);
		   ListNode seventh = new ListNode(82);

		   head.next = second;
		   second.next = third;
		   third.next = fourth;
		   fourth.next=fifth;
		   fifth.next=sixth;
		   sixth.next=seventh;
		   display(head);
		middle(head,82);
           display(head);
        //  System.out.println("Middle Node is : "+n.data);
	 }
	   	           private static void middle(ListNode head,int key) {
	   	        	if(head==null) 
	   	        		return ;
	   	        	ListNode current=head;
	   	        	ListNode temp=null;
	   	        	while(current!=null &&current.data!=key)  {
	   	        	    	 temp=current;
	   	        	    	 current=current.next;
	   	        	}
	   	        	if(current==null)
	   	        	return;       	
	   	        	temp.next=current.next;
	     }


private static void display(ListNode l) {
	 if (l==null)
		 return;
	 ListNode ln = l;
	 int count=0;
	 while(ln!=null) {
		 System.out.print(ln.data+"-->");
		 count++;
		 ln=ln.next;
	 }
	 System.out.println(ln);
	 System.out.println("no. of nodes :"+count);
   }
private static int count(ListNode head) {
	   int count =0;
	   while(head!=null) {
		   head = head.next;
		   count++;
	   }
	   return count;
}
}





//private static ListNode delete(ListNode head,int position) {
//int c = count(head);
//if(position > c || position<1) {
//	   System.out.println("Invalid");
//	   return null;
//}
//else if(position==1) {
//	   head= head.next;
//	  return head;
//}
//else {
//int count =1;
//ListNode n=head;
//while(count<position-1) {
//	   n = n.next;
//	   count++;
//}
//  ListNode current=n.next;
//  n.next=current.next;
//  current.next=null;
//return head;
//}
//}










//private static ListNode  reverse (ListNode head) {
//    if(head==null) {
// 	   System.out.println("No Node are Present");
// 	   return head;
//    }
//    else {
// 	   ListNode next=null;
// 	   ListNode previous=null;
// 	   ListNode current=head;
// 	   while(current!=null) {
// 		   next= current.next;
// 		   current.next=previous;
// 		   previous=current;
// 		   current=next;		   
// 	   }
// 	   return previous;
//    }




//  private static void insert(ListNode previous,int data) {
//	  ListNode newNode=new ListNode(data);
//	  if(previous==null) {
//		  System.out.println("Previous noded can't be null");
//		  return;
//	  }
//	    newNode.next=previous.next;
//	    previous.next = newNode;	  
// }
//  private static ListNode inertAtPosition(ListNode head,int data,int pos) {
//	   ListNode newNode = new ListNode(data);
//		 int count= count(head);
//	   if(pos>count) {
//		   System.out.println("out of list ........The length of List :- "+count);
//		   return null;
//	   }
//	   int count1=1;
//	   ListNode current = head;
//	   while(count1<pos-1) {
//		   current = current.next;
//		   count1++;
//	   }
//	  newNode.next = current.next;
//	  current.next = newNode;
//	  return head;
//  }
//  