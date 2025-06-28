package placement_training.wed_26_03;

public class diamondv2 {

	public static void main(String[] args) {
		/*int n = 5;
		for (int i = 0; i < n; i++) {
           for (int j = 0; (i <= n / 2) ? (j < n / 2 - i) : (j < i - n / 2); j++) {
        	   System.out.print(" ");
           }
           for (int j = 0; (i <= n / 2) ? (j <= i) : (j < n - i); j++) {
               System.out.print("* ");
           }
           System.out.println();
        }*/
		int n = 9;
        for (int i = 0; i < n; i++) {
            for (int j = 0; (i <= n / 2) ? (j < n / 2 - i) : (j < i - n / 2); j++) {
                System.out.print(" ");
            }
            for (int j = 0; (i <= n / 2) ? (j <= i) : (j < n - i); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
	}

}
