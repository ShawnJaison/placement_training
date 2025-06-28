package PT26_06;
import java.util.*;

public class sum_of_el {

	public static void main(String[] args) {
		int[] a= {1, 2, 3, 4, 5};
		
		int s=0 ;
		
		for(int i=0;i<a.length;i++) {
			System.out.print(s+" ");
			s=s+a[i];
		}
		System.out.print(s);
		
		
	}

}
