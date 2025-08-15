package PT17_07;

public class upperbound {

	public static void main(String[] args) {
		int[] nums= {1, 2, 2, 3};
		int x=2;
		int l=0;
        int h=nums.length-1;
        int ub=Integer.MAX_VALUE;
        while(l<=h){
            int m=(l+h)/2;
            if(nums[m]>x){
                if(ub>m){
                    ub=m;
                }
                h=m-1;
            }
            else{
                l=m+1;
            }
        }
        System.out.println(ub);

	}

}
