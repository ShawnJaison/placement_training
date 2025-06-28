package placement_training.thu_27_03;

import java.util.*;

public class ins_at_specif_ind {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n+1];
        
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        int ind=sc.nextInt();
        int v=sc.nextInt();
        
        for(int i=n;i>=ind;i--){
            arr[i]=arr[i-1];  
        }
        
        arr[ind-1]=v;
        
        for(int i=0;i<n+1;i++){
            System.out.print(arr[i]+" ");
        }

	}

}
