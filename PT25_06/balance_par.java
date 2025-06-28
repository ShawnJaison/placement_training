package PT25_06;
import java.util.*;
public class balance_par {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String a=sc.nextLine();
		
		int cnt=0;
		
		for(int i=0;i<a.length() && cnt>=0;i++) {
			if(a.charAt(i)=='(') {
				cnt++;
			}
			else if(a.charAt(i)==')') {
				cnt--;
			}
		}
		
		if(cnt==0) {
			System.out.println("Balanced");
		}
		else {
			System.out.println("Not balanced");
		}

	}

}
