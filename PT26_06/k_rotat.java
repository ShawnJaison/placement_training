package PT26_06;
import java.util.*;

public class k_rotat {

	public static void main(String[] args) {
		int[] a= {1, 2, 3, 4, 5};
		
		int k=7 ;
		
		for(int i=0;i<(k%a.length);i++) {
			int t=a[0];
			for(int j=1;j<a.length;j++) {
				a[j-1]=a[j];
			}
			a[a.length-1]=t;
			System.out.println(Arrays.toString(a));
		}
		
		
	}

}
