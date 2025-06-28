package placement_training;

public class armstrong {

	static int exp(int a, int n) {
		int r=1;
		for(int i=0;i<n;i++) {
			r=r*a;
		}
		return r;
	}
	
	
	public static void main(String[] args) {
		int a=8207;
		int l=0;
		int n=a;
		int s=0;
		
		while(n>0) {
			n=n/10;
			l=l+1;
		}
		int c=a;
		while(c>0) {
			s=s+exp((c%10), l);
			c=c/10;
		}
		
		System.out.println(s==a?s + " = " + a + " It is Armstrong":s + " != " + a + " It is NOT Armstrong");
		
		/*if(s==a) {
			System.out.println(s + " = " + a + " It is Armstrong");
		}
		else {
			System.out.println(s + " != " + a + " It is NOT Armstrong");
		}*/	
	}
}
