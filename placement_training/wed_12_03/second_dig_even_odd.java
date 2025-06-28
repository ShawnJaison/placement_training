package placement_training.wed_12_03;

public class second_dig_even_odd {

	public static void main(String[] args) {
		int lb=10;
		int ub=10000;
		for(int i=lb;i<ub;i++) {
			String t=((i/10)%10)%2==0?"even":"odd";
			System.out.println(i+" "+t);
		}
	}
}

//((i/100)%10)%2==0?"even":((i/1000)%10)%2==0?"even":"odd"
