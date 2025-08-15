package PT14_07;
import java.util.*;

class stack{
	int top=-1;
	int cap;
	int a[];
	
	stack(int size){
		cap=size;
		a=new int[cap];
	}
	
	boolean isfull() {
		if(top==(cap-1)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	boolean isempty() {
		if(top==-1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	void push(int data) {
		if(isfull()) {
			System.out.println("Stack is Full!");
			return;
		}
		top+=1;
		a[top]=data;
		return;
	}
	
	void pop() {
		if(isempty()) {
			System.out.println("Stack is Empty!");
			return;
		}
		System.out.println("Popped: "+a[top]);
		a[top]=0;
		top-=1;
		return;
		
	}
	void display() {
		for(int i=0;i<=top;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
}

public class stack_imp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		stack s=new stack(n);
		
		s.push(5);
		s.push(10);
		s.push(15);
		s.display();
		s.pop();
		s.display();

	}

}
