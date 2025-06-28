package placement_training;

public class armstrong_bw_1_1000_opt {

	static int exp(int a, int n) {
		int r=1;
		for(int i=0;i<n;i++) {
			r=r*a;
		}
		return r;
	}
	
	static void armstrong(int lb, int ub) {
		for(int i=lb;i<ub;i++) {
			int n=i;
			//int l=0;
			int s=0;
			int l=(n<=999)?3:(n<=99)?2:(n<=9)?1:4;
			/*while(n>0) {
				n=n/10;
				l=l+1;
			}*/
			while(n>0) {
				//s=s+exp((n%10), l);
				s+=(l==1)?(n%10):(l==2)?(n%10)*(n%10):(l==3)?(n%10)*(n%10):(n%10)*(n%10)*(n%10)*(n%10);
				
				n=n/10;
			}
			
			
		
			if(s==i) {
				System.out.println(s);
			}
		}
	}
	
	public static void main(String[] args) {
		int lb=1;
		int ub=10000;
		
		armstrong(lb, ub);	
	}

}

