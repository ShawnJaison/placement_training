package PT27_06;

public class leader {

	public static void main(String[] args) {
		int a[]= {23, 14, 5, 7, 5, 8, 2};
		int b[]=new int[a.length];
		int j=0;
		int m=0;
		
		for(int i=a.length-1;i>=0;i--) {
			if(m<a[i]) {
				m=a[i];
				b[j]=m;
				j++;
			}
		}
		for(int i=0;i<j;i++) {
			//if(b[i]!=0) {
				System.out.print(b[i]+" ");
			//}
		}

	}

}
