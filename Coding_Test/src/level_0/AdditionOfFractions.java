package level_0;

import java.util.ArrayList;
// add
//�м��� ����
//���� ����
//ù ��° �м��� ���ڿ� �и� ���ϴ� numer1, denom1, 
//�� ��° �м��� ���ڿ� �и� ���ϴ� numer2, denom2�� �Ű������� �־����ϴ�.
//�� �м��� ���� ���� ��� �м��� ��Ÿ���� �� ���ڿ� �и� ������� ���� �迭�� return �ϵ���
//solution �Լ��� �ϼ��غ�����.

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
