package PT05_07;
import java.util.*;

public class box_no {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int k=n;
	
		for(int i=1;i<n;i++) {
			for(int j=1;j<n;j++) {
				if(i==1||i==(2*n-1)||j==1||j==(2*n-1)) {
					System.out.print(k);
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
