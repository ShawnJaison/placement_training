package PT02_07;
import java.util.*;
public class zer_on {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++) {
			if(i%2==0) {
				System.out.println("0".repeat(n));
			}else {
				System.out.println("1".repeat(n));
			}
		}

	}

}
