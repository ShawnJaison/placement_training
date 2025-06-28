package placement_training.tue_25_03;

import java.util.*;

public class prime_pair {
	
	public static boolean isprime(int n) {
		boolean f=true;
		for(int k=2;k<n;k++) {
        	if(n%k==0) {
        		f=false;
        		return f;
        	}
        }
        return true;
		
	}

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        for(int i=2;i<=n;i++){
            for(int j=i;j<=n;j++){
                if(isprime(i)&&isprime(j)) {
                	int sum=i+j;
                	if(isprime(sum)) {
                		System.out.println(i+" "+j);
                	}
                }
            }
        }
        
        /*for(int i=2;i<=n;i++){
            for(int j=i;j<=n;j++){
                int sum=j+i;
                boolean f=false;
                for(int k=2;k<sum;k++) {
                	if(sum%k==0) {
                		f=true;
                		break;
                	}
                }
                if(f==false) {
                		System.out.println(i+" "+j);
                }
            }
        }*/
    }

}
