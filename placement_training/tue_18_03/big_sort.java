package placement_training.tue_18_03;

import java.util.*;

public class big_sort {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String a[]=new String[n];
        
        for(int i=0;i<n;i++) {
        	a[i]=sc.nextLine();
        }
        
        String t="";
        
        for(int i=0;i<n;i++) {
            for(int j=0;j<n-i-1;j++){
                if(a[j].compareTo(a[j+1])>0){
                    t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }
        
        String temp="";
        
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(a[j].length()>a[j+1].length()){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }
        
        sc.close();
        
    }

}
