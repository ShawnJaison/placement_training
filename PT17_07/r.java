package PT17_07;

public class r {

	public static void main(String[] args) {
		int[] nums= {-2,1,-3,4,-1,2,1,-5,4};
		int s=0;
		int max=Integer.MIN_VALUE;
		
		for(int i=0;i<nums.length;i++) {
			for(int j=i;j<nums.length;j++) {
				s=s+nums[j];
				if(max<s) {
					max=s;
				}
			}
			s=0;
		}
		System.out.println(max);

	}

}
