package placement_training.tue_25_03;

import java.util.*;

public class years {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int y=n/365;
		int w=(n%365)/7;
		int d=(n%365)%7;
		System.out.println(y);
		System.out.println(w);
		System.out.println(d);

	}

}
