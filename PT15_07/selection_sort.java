package PT15_07;

import java.util.*;

public class selection_sort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int a[]=new int[n];
		
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}

		for(int i=0;i<n;i++) {
			int min=a[i];
			int ind=i;
			
			for(int j=i+1;j<n;j++) {
				if(min>a[j]) {
					min=a[j];
					ind=j;
				}
			}
			if(a[i]>a[ind]) {
				int t=a[i];
				a[i]=a[ind];
				a[ind]=t;
			}
		}
		
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
	}

}
