package PT02_07;
import java.util.*;

public class sort_evs {

	public static void main(String[] args) {
		int[] a= {6, 5, 4, 9, 7, 2, 5};
		
		int cnt=0;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				cnt+=1;
			}
		}
		
		int[] ind=new int[cnt];
		
		int j=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				ind[j]=i;
				j++;
			}
		}
		
		for(int i=0;i<ind.length;i++) {
			for(int k=i+1;k<ind.length;k++) {
				if(a[ind[i]]>a[ind[k]]) {
					int t=a[ind[i]];
					a[ind[i]]=a[ind[k]];
					a[ind[k]]=t;
				}
			}
		}
		
		System.out.println(Arrays.toString(a));

	}

}
