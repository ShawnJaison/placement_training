package placement_training.thu_13_03;

public class bubble_sort {

	public static void main(String[] args) {
		int a[]= {50, 20, 30, 10, 40};
		int max=0;
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length-i-1;j++) {
				if(a[j]>a[j+1]) {
					max=a[j];
					a[j]=a[j+1];
					a[j+1]=max;
				}
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}

}
