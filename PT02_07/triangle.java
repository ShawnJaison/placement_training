package PT02_07;
import java.util.*;
public class triangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i-1;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<(i*2)+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println(9/2);

	}

}
