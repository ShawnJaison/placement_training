package PT09_07;

public class rev_no {

	public static void main(String[] args) {
		int n=1002003;
		int s=0;
		
		while(n>0) {
			s=(s*10)+(n%10);
			n=n/10;
		}
		System.out.println(s);

	}

}
