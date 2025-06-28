package placement_training.wed_12_03;
import java.util.*;
public class factorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        long r=1;
        for(long i=a;i>0;i--){
            r=r*i;
            System.out.println(r);
        }
        System.out.println(r);

	}

}
