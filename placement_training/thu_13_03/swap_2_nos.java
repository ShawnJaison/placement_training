package placement_training.thu_13_03;

public class swap_2_nos {

	public static void main(String[] args) {
		int a=20;
		int b=30;
		
		System.out.println("A: "+a);
		System.out.println("B: "+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("A: "+a);
		System.out.println("B: "+b);

	}

}
