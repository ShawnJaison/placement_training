package PT16_07;

public class merge_sort_imp {

	public static void mergesort(int[] a) {
		int length=a.length;
		System.out.println(length);
		
		if(length<=1) {
			return;
		}
		
		int middle=length/2;
		
		int[] l=new int[middle];
		int[] r=new int[length-middle];
		
		int i=0;
		int j=0;
		
		for(;i<length;i++) {
			if(i<middle) {
				l[i]=a[i];
			}
			else {
				r[j]=a[i];
				j++;
			}
		}
		
		mergesort(l);
		mergesort(r);
		merge(l, r, a);
		
	}
	
	public static void merge(int[] l, int[]r, int[] a) {
		
	}
	
	public static void main(String[] args) {
		int[] a= {4, 3, 1, 6, 9, 8};
		mergesort(a);
	}

}
