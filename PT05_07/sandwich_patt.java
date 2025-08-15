package PT05_07;
import java.util.*;

public class sandwich_patt {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i=i+2) {
			int val=(i-1)*n+1;
			System.out.println(val);
			for(int j=1;j<=n;j++) {
				System.out.printf("%02d ", val++);
			}
			System.out.println();
		}
		
		for(int i=n;i>=2;i=i-1) {
			if(i%2==0) {
				int val=(i-1)*n+1;
				System.out.println(val);
				for(int j=1;j<=n;j++) {
					System.out.printf("%02d ", val++);
				}
			}
			
			System.out.println();
		}
		
		

	}

}
