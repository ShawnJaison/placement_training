package placement_training.wed_26_03;

import java.util.*;

public class pattern_10 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<i+1;j++) {
				System.out.print("*");  
			}
			for(int j=i+1;j<(n*2)-1-i;j++) {
				System.out.print(" ");
			}
			for(int j=(n*2)-1-i;j<n*2;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i;j++) {
				System.out.print("*");
			}
			for(int j=n-i;j<n+i;j++) {
				System.out.print(" ");
			}
			for(int j=n+i;j<n*2;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		

	}

}
