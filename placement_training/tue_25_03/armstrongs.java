package placement_training.tue_25_03;

import java.util.*;

public class armstrongs {

	static int pow(int n, int p){
        int r=1;
        for(int i=0;i<p;i++){
            r=r*n;
        }
        return r;
    }
    
    static void arm(int a, int z){
        for(int i=a;i<=z;i++){
            int l=0;
            int t=i;
            while(t>0){
            	t=t/10;
                l=l+1;
            }
            t=i;
            int s=0;
            while(t>0){
                s=s+(pow((t%10), l));
                t=t/10;
            }
            if(s==i) {
            	System.out.println(s);
            }
            
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int lb=sc.nextInt();
        int ub=sc.nextInt();
        arm(lb, ub);
    }

}
