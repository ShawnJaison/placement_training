 package placement_training.tue_25_03;

import java.util.*;

public class happy_no {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        
        //int t=n;
        
        while(n>9) {
        	int s=0;
        	int t=n;
        	while(t>0) {
            	s=s+((t%10)*(t%10));
            	t=t/10;
            }
            n=s;
        }
        if(n==1) {
        	System.out.println(true);
        }
        else {
        	System.out.println(false);
        }

	}

}
