package level_0;

import java.util.ArrayList;
// add
//분수의 덧셈
//문제 설명
//첫 번째 분수의 분자와 분모를 뜻하는 numer1, denom1, 
//두 번째 분수의 분자와 분모를 뜻하는 numer2, denom2가 매개변수로 주어집니다.
//두 분수를 더한 값을 기약 분수로 나타냈을 때 분자와 분모를 순서대로 담은 배열을 return 하도록
//solution 함수를 완성해보세요.

//numer1 denom1	numer2	denom2	result
//1		2		3		4		[5, 4]
//9		2		1		3		[29, 6]

public class AdditionOfFractions {
	public int[] solution(int numer1, int denom1, int numer2, int denom2) {

		int boon_ja = (numer1 * denom2) + (numer2 * denom1);
		int boon_mo = denom1 * denom2;

		
		int max = 1;
		for (int i = 1; i <=boon_ja; i++) {
			if (boon_ja % i == 0 && boon_mo % i == 0) {
				max = i;
			} // for

		}
		int[] answer = {  boon_ja / max, boon_mo / max };
		return answer;
	}

}
