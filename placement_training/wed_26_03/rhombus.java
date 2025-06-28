package placement_training.wed_26_03;

import java.util.*;

public class rhombus {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i-1;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<n;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		for(int i=0;i<n;i++) {
		    if(i==0){
		        for(int j=0;j<n-1;j++) {
				    System.out.print(" ");
		        }
		        for(int j=0;j<n;j++) {
				    System.out.print("*");
		        }
		    }
			else if(i==n-1) {
				for(int j=0;j<n;j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			else {
				for(int j=0;j<n-i-1;j++) {
					System.out.print(" ");
				}
				for(int j=0;j<1;j++) {
					System.out.print("*");
				}
				for(int j=0;j<n-2;j++) {
					System.out.print(" ");
				}
				for(int j=0;j<1;j++) {
					System.out.print("*");
				}
			}
			System.out.println();
		}

	}

}
