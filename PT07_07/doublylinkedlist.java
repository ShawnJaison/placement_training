package PT07_07;

/*class node{
	int data;
	node next;
	node prev;
	
	public node(int data) {
		this.data=data;
		this.next=null;
		this.prev=null;
	}
}

public class doublylinkedlist {
	node head=null;
	node tail=null;
	
	public void ins_at_end(int data) {
		node n=new node(data);
		
		if(head==null && tail==null) {
			head=n;
			tail=n;
			return;
		}
		
		tail.next=n;
		n.prev=tail;
		tail=n;
	}
	
	public void ins_at_beg(int data) {
		node n=new node(data);
		
		if(head==null && tail==null) {
			head=n;
			tail=n;
			return;
		}
		
		head.prev=n;
		n.next=head;
		head=n;
	}
	
	public void display() {
		for(node i=head;i!=null;i=i.next) {
			System.out.print(i.data+ " <-> ");
		}
		System.out.println();
		System.out.println("/________________________________/");
	}
	
	public void reverse() {
		for(node i=tail;i!=null;i=i.prev) {
			System.out.print(i.data+ " <-> ");
		}
		System.out.println();
		System.out.println("/________________________________/");
	}

	public static void main(String[] args) {
		doublylinkedlist dll=new doublylinkedlist();
		
		dll.ins_at_beg(10);
		dll.ins_at_end(20);
		dll.ins_at_end(30);
		dll.ins_at_end(40);
		dll.ins_at_end(50);
		dll.display();
		dll.reverse();

	}

}
*/