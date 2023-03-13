package level_1;
//ÇÏ»þµå ¼ö 
public class HarshadNumber {
	class Solution {
	    public boolean solution(int x) {
	        boolean answer = true;
	        int sum = 0;
			
			String str = Integer.toString(x);
			int[] arr = new int[str.length()];

			for(int i=0; i<str.length(); i++) {
				
				sum +=str.charAt(i) - '0';
			}
	        
		    if(x%sum ==0) {
				answer = true;
			}else{
	            answer = false;
	        }
	        return answer;

	    }
	}
}
