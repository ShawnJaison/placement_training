package placement_training.fri_28_03;

import java.util.Scanner;

public class sum_of_diag {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
			
		int n=sc.nextInt();
		
		int a[][]=new int[n][n];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		
		int s=0;
		
		if(n%2==0) {
			for(int i=0;i<n;i++) {
				s=s+a[i][i]+a[i][n-i-1];
			}
		}
		else {
			for(int i=0;i<n;i++) {
				if(i==n%(n-(n/2))) {
					s=s+a[i][i];
				}
				else {
					s=s+a[i][i]+a[i][n-i-1];
				}
			}
		}
		
		System.out.println(s);

	}

}

/*if(n%2==0) {
for(int i=0;i<n;i++) {
	s=s+a[i][i]+a[i][n-i-1];
}
}
else {
for(int i=0;i<n;i++) {
	s=s+a[i][i];
}
for(int i=0;i<n;i++) {
	if(i!=n%(n-(n/2))){
		s=s+a[i][i];
	}
}
}*/
