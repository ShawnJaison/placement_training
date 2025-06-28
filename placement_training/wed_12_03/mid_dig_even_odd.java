package placement_training.wed_12_03;

public class mid_dig_even_odd {

	public static void main(String[] args) {
		int a=23578;
		int n=a;
		int d=0;
		for(int i=0; i<3 ; i++) {
			d=(d*10)+(n%10);
			n=n/10;
		}
		if((d%10)%2==0) {
			System.out.println("Even");
		}
		else {
			System.out.println("Odd");
		}

	}

}
