package PT02_07;

import java.util.Scanner;

public class right_tri_nos {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		int v=1;
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<i;j++) {
				System.out.printf("%03d ", (v++));  //precision and width
			}
			System.out.println();
		}

	}

}
