package level_0;

public class Test1 {

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
