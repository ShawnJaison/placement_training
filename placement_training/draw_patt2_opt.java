package placement_training;

public class draw_patt2_opt {

	public static void main(String[] args) {
		int a=12345;
		int n=a;

		int l=0;
		
		while(n!=0) {
			n=n/10;
			l=l+1;
		}
		
		int ar[]=new int[l];
		int i=0;
		int r=0;
		while(a!=0) {
			r=a%10;
			ar[i]=r;
			a=a/10;
			i=i+1;
		}
		
		for(int j=(l-1);j>=0;j--) {
			System.out.print(ar[j]);
			if(j>0) {
				System.out.print(" + ");
			}
		}
		
		

	}

}
