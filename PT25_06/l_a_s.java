package PT25_06;

public class l_a_s {

	public static void main(String[] args) {
		String s="1";
		String[] rs=new String[10];
		
		for(int i=0; i<10; i++) {
			char t='\0';
			int cnt=0;
			StringBuilder r=new StringBuilder();
			
			for(int j=0;j<s.length();j++) {
				
				if(j==0) {
					t=s.charAt(j);
					cnt+=1;
				}
				else if(s.charAt(j)==t) {
					cnt+=1;
				}
				else {
					r.append(cnt).append(t);
					t=s.charAt(j);
					cnt=1;
				}
			}
			r.append(cnt).append(t);
			s=r.toString();
			System.out.println(r.toString());
			rs[i]=s;
		}
		
		for(int i=0;i<10;i++) {
			System.out.println(rs[i]);
		}
		
		/*char t='\0';
		int cnt=0;
		
		for(int i=0;i<s.length();i++) {
			if(i==0) {
			t=s.charAt(i);
			cnt+=1;
			}
			else if(s.charAt(i)==t) {
				cnt+=1;
			}
			else {
				r.append(cnt).append(t);
				t=s.charAt(i);
				cnt=1;
			}
		}
		r.append(cnt).append(t);
		s=r.toString();
		System.out.println(r.toString());
		*/

	}

}
