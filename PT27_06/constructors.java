package PT27_06;

class student{
	String regno;
	int year;
	String name;
	boolean dist;
	
	student(String regno, int year, String name, boolean dist){
		this.regno=regno;
		this.year=year;
		this.name=name;
		this.dist=dist;
		
		System.out.println("Register No: "+ regno);
		System.out.println("Name: "+ name);
		System.out.println("Year: "+ year);
		System.out.println("Distinction?: "+ dist);
}

public class constructors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
