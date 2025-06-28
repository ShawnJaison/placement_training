package PT24_06;
import java.util.*;

public class compress {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		StringBuilder r=new StringBuilder();
		
		int cnt=0;
		char t='\0';
		for(int i=0;i<s.length();i++) {
			if(i==0) {
				t=s.charAt(i);
				cnt=1;
			}
			
			else {
				if(s.charAt(i)==s.charAt(i-1)) {
					cnt+=1;
				}
				else {
					r.append(t).append(cnt);
					t=s.charAt(i);
					cnt=1;	
				}
			}
		}
		r.append(t).append(cnt);
		System.out.println(r.toString());

	}

}
