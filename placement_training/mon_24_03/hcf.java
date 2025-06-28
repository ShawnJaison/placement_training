package placement_training.mon_24_03;

import java.util.*;

public class hcf {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int t=0;
        
        int m=0;
        
        while(b!=0||a!=0){
            b=b%a;
            t=b;
            a=a%b;
            t=a;
        }
        
        System.out.println(t);
    }

}
