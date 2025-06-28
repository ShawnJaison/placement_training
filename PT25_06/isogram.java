package PT25_06;
import java.util.*;
public class isogram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int[] count=new int[26];
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i) >= 97 && s.charAt(i) <= 127) {
				count[s.charAt(i)-97]+=1;
			}
		}

		boolean f=true;
		for(int i=0;i<count.length;i++) {
			if(count[i]>=2) {
				f=false;
			}
		}
		if(f) {
			System.out.println("Isogram");
		}
		else {
			System.out.println("Not Isogram");
		}
		

	}

}
