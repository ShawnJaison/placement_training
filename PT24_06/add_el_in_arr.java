package PT24_06;
import java.util.*;

public class add_el_in_arr {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int[] a=new int[n];
		
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		
		int d=sc.nextInt();
		int ind=sc.nextInt();
		
		int[] b=new int[n+1];
		
		for(int i=0;i<n+1;i++) {
			if(i<ind) {
				b[i]=a[i];
			}
			else if(i==ind) {
				b[i]=d;
			}
			else if(i>ind) {
				b[i]=a[i-1];
			}
		}
		
		for(int i=0;i<n+1;i++) {
			System.out.print(b[i]+" ");
		}

	}

}
