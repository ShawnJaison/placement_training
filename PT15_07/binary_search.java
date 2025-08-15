package PT15_07;
import java.util.*;

public class binary_search {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int a[]=new int[n];
		
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		
		int k=sc.nextInt();
		
		int l=0;
		int h=n-1;
		int m=(l+h)/2;
		
		int f=0;
		int ind=0;
		while(l<=h) {
			if(a[m]==k) {
				ind=m;
				f=1;
				break;
			}
			else if(a[m]<k) {
				l=m+1;
				m=(l+h)/2;
			}
			else if(a[m]>k) {
				h=m-1;
				m=(l+h)/2;
			}
		}
		if(f==1) {
			System.out.println(k+" Found At "+ind);
		}
		else {
			System.out.println("Element Not Found");
		}
	}
}
