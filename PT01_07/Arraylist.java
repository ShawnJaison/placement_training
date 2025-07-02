package PT01_07;
import java.util.*;

public class Arraylist {

	public static void main(String[] args) {
		ArrayList<String> p=new ArrayList<String>();
		Scanner sc=new Scanner(System.in);
		
		int op;
		
		while(true) {
			System.out.println("1. Add\n2. Del\n3. Sort\n4. Display\n5. Exit");
			op=sc.nextInt();
			sc.nextLine();
			String name;
			if(op==1) {
				System.out.println("Enter Name: ");
				name=sc.nextLine();
				p.add(name);
			}
			else if(op==2) {
				if(p.size()==0) {
					System.out.println("Empty List");
				}
				else {
					System.out.println("Enter Index to Delete: ");
					int ind=sc.nextInt();
					p.remove(ind);
				}
			}
			else if(op==3) {
				Collections.sort(p);
			}
			else if(op==4) {
				System.out.println(p);
			}
			else if(op==5) {
				System.out.println("Exiting...");
				break;
			}
		}
		
	}

}
