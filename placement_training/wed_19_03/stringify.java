package placement_training.wed_19_03;

class dem{
	static String toString(int a, int y) {
		return "I am "+a+" years old. Born in "+y+".";
	}
}

public class stringify {

	public static void main(String[] args) {
		dem ob=new dem();
		System.out.println(ob.toString());
		System.out.println(dem.toString(20, 2004));
	}

}
