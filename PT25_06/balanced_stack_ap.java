package PT25_06;
import java.util.*;

public class balanced_stack_ap {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		
		char[] stack=new char[a.length()];
		char[] b=a.toCharArray();
		int top=-1;
		
		for(int i=0;i<a.length();i++) {
			if(b[i]=='(' || b[i]=='{' || b[i]=='[') {
				stack[++top]=b[i];
			}
			else {
				if(top==-1) {
					System.out.println("not balanced");
					return;
				}
				else {
					char last=b[i];
					if( (stack[top]=='(' && last!=')') || 
						(stack[top]=='[' && last!=']') ||
						(stack[top]=='{' && last!='}') ) {
						System.out.println("Not Balanced");
						return;
					}
					top--;
					
				}
			}
		}
		
		if(top==-1) {
			System.out.println("balanced");
		}
		else {
			System.out.println("not balanced");
		}

	}

}
