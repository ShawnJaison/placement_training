package PT19_07;
import java.util.*;

public class patt {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		
		for(int i=1;i<=n;i++) {
			
			int k=n-1;
			int v=i;
			for(int j=1;j<=i;j++) {
				System.out.print(v +" ");
				v=v+k;
				k--;
			}
			System.out.println();
		}

	}

}
