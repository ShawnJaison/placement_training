package placement_training.thu_13_03;

public class swap_1st_2_indices {

	public static void main(String[] args) {
		int ar[]= {10, 20, 30, 40, 50};
		
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i]+" ");
		}
		System.out.println();
		
		/*ar[0]=ar[0]+ar[1];
		ar[1]=ar[0]-ar[1];
		ar[0]=ar[0]-ar[1];*/
		
		for(int i=1;i<(ar.length);i++) {
			ar[i]=ar[i]+ar[i-1];
			ar[i-1]=ar[i]-ar[i-1];
			ar[i]=ar[i]-ar[i-1];
		}
		
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i]+" ");
		}
	}

}
