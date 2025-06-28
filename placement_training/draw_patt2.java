package placement_training;

public class draw_patt2 {

	public static void main(String[] args) {
		for(int i=0;i<=5;i++) {
			for(int j=0;j<(5-i);j++) {
				System.out.print(" ");
			}
			for(int k=0;k<i;k++) {
				System.out.print("* ");
			}
			for(int j=0;j<(5-i);j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
		for(int i=4;i>0;i--) {
			for(int j=(4-i); j>=0;j--) {
				System.out.print(" ");
			}
			for(int k=i;k>0;k--) {
				System.out.print("* ");
			}
			for(int j=(4-i);j>0;j--) {
				System.out.print(" ");
			}
			System.out.println();
		}

	}

}
