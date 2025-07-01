package PT30_06;

public class sum_of_digits {

	public static void main(String[] args) {
		int n=456;
		
		int s=0;
		
		while(n>=10) {
			s=0;
			while(n>0) {
				s=s+(n%10);
				n=n/10;
			}
			n=s;
		}
		System.out.println(n);

	}

}
