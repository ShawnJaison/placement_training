package PT01_07;
import java.util.*;


public class no_vow {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String s=sc.nextLine();
		char c=sc.next().charAt(0);
		String r="";
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=c) {
				r=r+s.charAt(i);
			}
		}
		System.out.println(r);
		

	}

}
