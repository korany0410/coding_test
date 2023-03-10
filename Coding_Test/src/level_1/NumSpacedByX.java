package level_1;
//x만큼 간격이 있는 n개의 숫자

public class NumSpacedByX {
	public static void main(String[] args) {
		
		int x = 0;
		int n = 0;
		long[] answer = new long[n];
		// x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트

	      for(int i=0; i<n; i++){
	         answer[i] = (long)x * (i+1);
	      }

		
	}// main


}
