package placement_training.wed_26_03;

public class pattern_3 {

	public static void main(String[] args) {
		for(int i=0;i<4;i++) {
			for(int j=0;j<4-i-1;j++) {
				System.out.print("  ");
			}
			for(int j=4-i-1;j<4;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
