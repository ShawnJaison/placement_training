package placement_training.wed_26_03;

public class pattern_6 {

	public static void main(String[] args) {
		for(int i=0;i<3;i++) {
			for(int j=0;j<3-i-1;j++) {
				System.out.print(" ");
			}
			for(int j=3-i-1;j<3;j++) {
				System.out.print("* ");
			}
			System.out.println();
			
		}
		for(int i=4;i>=0;i--) {
			for(int j=0;j<4-i;j++) {
				System.out.print(" ");
			}
			for(int j=4-i;j<4;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
