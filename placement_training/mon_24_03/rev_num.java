package placement_training.mon_24_03;

import java.util.*;

public class rev_num {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long a=n;
        
        long s=0;
        while(a!=0) {
            s=s+(a%10);
            s=s*10;
            a=a/10;
        }
        s=s/10;
        
        if(s>Integer.MAX_VALUE||s<Integer.MIN_VALUE){
            System.out.println(0);
        }
        else{
            System.out.println(s);
        }   
    }

}
