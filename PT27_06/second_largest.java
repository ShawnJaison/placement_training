package PT27_06;
import java.util.*;

public class second_largest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int[] a=new int[n];
		
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		
		int f=a[0], s=a[0];
		for(int i=0;i<n;i++) {
			if(f<a[i]) {
				s=f;
				f=a[i];
			}
			else if(s<a[i] && f>a[i]) {
				s=a[i];
			}
		}
		
		System.out.println(f+" "+s);

	}

}
