package placement_training;

import java.util.*;

public class big_3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int r= a>b?a>c?a:c:b>c?b:c;
	}
}
