package PT24_06;
import java.util.*;
public class rem_dupl {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String r="";
		boolean[] seen=new boolean[26];
		
		for(int i=0;i<s.length();i++) {
			if(seen[s.charAt(i)-97]!=true) {
				seen[s.charAt(i)-97]=true;
				r=r+s.charAt(i);
			}
		}
		System.out.println(r);

	}

}
