package placement_training.thu_27_03;

import java.util.*;

public class array {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n+1];
        for(int i=1;i<n+1;i++){
            arr[i]=sc.nextInt();
        }
        int a=sc.nextInt();
        arr[0]=a;
        for(int i=0;i<n+1;i++){
            System.out.print(arr[i]+" ");
        }
		
		/*Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> arr1= new ArrayList<>();
        
        for(int i=0;i<n;i++){
            arr1.add(sc.nextInt());
        }
        
        int a=sc.nextInt();
        
        arr1.add(0, a);
        
        for(int i:arr1){
            System.out.print(i+" ");
        }*/

	}

}
