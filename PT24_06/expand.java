package PT24_06;

import java.util.Scanner;

public class expand {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		StringBuilder r=new StringBuilder();
		
		for(int i=0;i<s.length();i=i+2) {
			char t=s.charAt(i);
			int v=(int)(s.charAt(i+1)-48);
			
			for(int j=0;j<v;j++) {
				r.append(t);
			}
		}
		System.out.println(r.toString());

	}

}
