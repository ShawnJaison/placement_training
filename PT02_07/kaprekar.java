package PT02_07;

public class kaprekar {
	public static int len(int n) {
		int r=0;
		while(n>0) {
			n=n/10;
			r=r+1;
		}
		return r;
	}
	public static void main(String[] args) {
		int n=297;
		n=n*n;
		if(len(n)%2==0) {
			int s1=0;
			int s2=0;
			int t=n;
			for(int i=0;i<len(t)/2;i++) {
				s1=s1*10+Integer.parseInt(Integer.toString(t).charAt(i));
			}
		}
		
		

	}

}
