package placement_training.wed_26_03;

public class pattern_9 {

	public static void main(String[] args) {
		int t=2;
		for(int i=1;i<=6;i++) {
			
			for(int j=0;j<t;j++) {
				System.out.print("*");
			}
			if(i%t==0) {
				t=t+2;
			}
			System.out.println();
		}

	}

}
