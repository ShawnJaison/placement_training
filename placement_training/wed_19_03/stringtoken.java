package placement_training.wed_19_03;

import java.util.*;

public class stringtoken {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        /*s=s.replace("!", "");
        s=s.replace(",", "");
        s=s.replace("?", "");
        s=s.replace(".", "");
        s=s.replace("_", "");
        s=s.replace("'", " ");
        s=s.replace("@", "");*/
        s=s.replaceAll("[!,?._'@]", " ");
        String ss[]=s.trim().split("\\s+");
        
        if(ss.length==1&&ss[0].isEmpty()) {
        	System.out.println(0);
        }
        else {
        	System.out.println(ss.length);
            for(int i=0;i<ss.length;i++){
                System.out.println(ss[i]);
            }
        }

	}

}
