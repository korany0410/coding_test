package age;

public class Solution {
	public static void main(String[] args) {
		int age = 0;
		
		Solution sl = new Solution();
		sl.solution(age);
		System.out.println(sl.solution(age));
		

		
	}//main
	
	public int solution(int age) {
        int answer = 0;
        answer = 2022 - age;
        
        return answer;
    }
	
	
}
