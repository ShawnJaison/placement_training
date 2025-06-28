package placement_training.wed_12_03;

import java.util.Scanner;

public class left_shift_array {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int d=sc.nextInt();
        
        int ar[]=new int[n];
        for(int i=0;i<n;i++){
            ar[i]=sc.nextInt();
        }
        
        for(int i=0;i<d;i++){
        	int temp1=ar[0];
        	
        	ar[0]=0;
        	for(int j=1;j<n;j++) {
        		int temp2=ar[j];
        		ar[j]=ar[j-1];
        		ar[j-1]=temp2;
        	}
        	
        	ar[(n-1)]=temp1;
        }
        
        for(int i=0;i<n;i++){
            System.out.print(ar[i]+" ");
        }
	}
}

//array indices should be of int type and cannot be of long type

/* 

	for(int i=0;i<3;i++){
		int temp=0;
		int a=0;
		int z=n-1;
		for(int j=0;j<(n/2);j++){
    		temp=ar[z];
    		ar[z]=ar[a];
    		ar[a]=temp;
    		a=a+1;
    		z=z-1;
		}
	}

*/
/*ar[j]=ar[j]+ar[j-1];
ar[j-1]=ar[j]-ar[j-1];
ar[j]=ar[j]-ar[j-1];*/