package PT14_07;
import java.util.*;

class queue{
	int front=-1, rear=-1;
	int cap;
	int a[];
	
	queue(int size){
		cap=size;
		a=new int[cap];
	}
	boolean isfull() {
		if(rear==cap-1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	boolean isempty() {
		if(rear==-1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	void enq(int data) {
		if(isfull()) {
			System.out.println("Queue is Full!");
			return;
		}
		rear=rear+1;
		a[rear]=data;
		if(front==-1) {
			front+=1;
		}
		return;
	}
	
	void deq() {
		if(isempty()) {
			System.out.println("Queue is Empty!");
			return;
		}
		System.out.println("Dequeued: "+a[front]);
		a[front]=0;
		front+=1;
		if(front==rear) {
			front=-1;
			rear=-1;
		}
	}
	
	void display() {
		for(int i=front;i<=rear;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
}

public class queue_imp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		queue q=new queue(n);
		
		q.enq(5);
		q.enq(10);
		q.enq(15);
		q.display();
		q.deq();
		q.display();

	}

}
