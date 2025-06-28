package placement_training.wed_26_03;

public class diamond {

	public static void main(String[] args) {
		for(int i=0;i<4;i++) {
			for(int j=0;j<4-i-1;j++) {
				System.out.print(" ");
			}
			for(int j=4-i-1;j<4;j++) {
				System.out.print("* ");
			}
			System.out.println();
			if(i==4-2) {
				break;
			}
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
