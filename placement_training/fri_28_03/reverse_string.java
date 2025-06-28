package placement_training.fri_28_03;

import java.util.*;

public class reverse_string {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String r="";
        for(int i=0;i<s.length();i++){
            r+=s.charAt(s.length()-i-1);
        }
        System.out.println(r);

	}

}
