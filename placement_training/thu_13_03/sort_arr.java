package placement_training.thu_13_03;

import java.util.*;

public class sort_arr {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String a[]=new String[n];
        
        for(int i=0;i<n;i++){
            a[i]=sc.nextLine();
        }
        
        Arrays.sort(a);
		/*BigInteger max=0;
		for(int i=0;i<n;i++) {
			if(max.compareTo(a[i])==-1){
                
            }
		}*/
        
        for(int i=0;i<n;i++){
        	System.out.println(a);
        }
        
        
        
    }

}
