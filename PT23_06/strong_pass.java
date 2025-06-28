package PT23_06;
import java.util.*;

public class strong_pass {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String str=sc.nextLine();
		
		int u=0, l=0, n=0, s=0;
		
		if(str.length()<8) {
			System.out.println("Weak Password");
		}
		else {
			for(int i=0;i<str.length();i++) {
				if(str.charAt(i)>=65 && str.charAt(i)<=90) {
					u=1;
				}
				else if(str.charAt(i)>=97 && str.charAt(i)<=122) {
					l=1;
				}
				else if(str.charAt(i)>=48 && str.charAt(i)<=57) {
					n=1;
				}
				else {
					s=1;
				}
			}
			if(u+l+s+n==4) {
				System.out.println("Strong Password");
			}
			else {
				System.out.println("Weak Password");
			}
		}

	}

}
