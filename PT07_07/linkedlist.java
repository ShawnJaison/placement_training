package PT07_07;

public class linkedlist {
	
	class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data=data;
			this.next=null;
		}
		
	}
	
	Node head=null;
	Node tail=null;
	
	public void insert_at_beginning(int data) {
		if(head==null) {
			Node nn=new Node(data);
			head=nn;
			tail=nn;
			return;
		}
		Node nn=new Node(data);
		nn.next=head;
		head=nn;
		return;
	}
	
	public void insert_at_end(int data) {
		if(tail==null) {
			Node nn=new Node(data);
			tail=nn;
			head=nn;
			return;
		}
		Node nn=new Node(data);
		tail.next=nn;
		tail=nn;
	}
	
	public void ins_at_pos(int data, int pos) {
		
		Node nn=new Node(data);
		
		if(pos==1) {
			nn.next=head;
			head=nn;
			if(tail==null) {
				tail=nn;
			}
			return;
		}
		
		Node curr=head;
		Node prev=null;
		int cnt=1;
		
		while(cnt!=pos && curr!=null) {
			prev=curr;
			curr=curr.next;
			cnt+=1;
		}
		
		nn.next=curr;
		prev.next=nn;
		return;
		
	}
	
	public void del_at_beginning() {
		if(head.next==null) {
			head=head.next;
			System.out.println("Empty list");
			return;
		}
		head=head.next;
		return;
	}
	
	public void del_at_end() {
		if(head==tail) {
			head=null;
			tail=null;
			return;
		}
		
		Node curr=head;
		
		while(curr.next.next!=null) {
			curr=curr.next;
		}
		tail=curr;
		tail.next=null;
	}
	
	public void del_data(int data) {
		Node curr=head;
		
		while(curr.next.data!=data) {
			curr=curr.next;
		}
		curr.next=curr.next.next;
	}
	
	public void reverse() {
		Node prv=null;
		Node curr=head;
		Node frwd=null;
		
		tail=head;
		
		while(curr!=null) {
			frwd=curr.next;
			curr.next=prv;
			prv=curr;
			curr=frwd;
		}
		
		head=prv;
		return;
	}
	
	
	
	public void display() {
		for(Node i=head;i!=null;i=i.next) {
			System.out.print(i.data+" -> ");
		}
		System.out.println();
		System.out.println("/------------------------------------------------/");
	}
		

	
	public static void main(String[] args) {
		linkedlist ll=new linkedlist();
		
		ll.insert_at_beginning(10);
//		ll.display();
		ll.insert_at_end(20);
//		ll.display();
		ll.insert_at_end(30);
//		ll.display();
		ll.insert_at_end(40);
		ll.display();
		ll.del_data(30);
		ll.display();
		ll.ins_at_pos(30, 3);
		ll.display();
		ll.reverse();
		ll.display();
		/*ll.insert_at_beginning(10);
		ll.display();
		ll.insert_at_end(20);
		ll.display();
		ll.insert_at_end(30);
		ll.display();
		ll.insert_at_end(40);
		ll.display();
		ll.ins_at_pos(25, 3);
		ll.display();
		ll.del_at_beginning();
		ll.display();*/
		

	}

}
