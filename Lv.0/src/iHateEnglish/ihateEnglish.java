package iHateEnglish;

//��� �Ⱦ��
//���� ����
//��� ���� �Ӿ��̴� ����� ǥ��Ǿ��ִ� ���ڸ� ���� �ٲٷ��� �մϴ�. 
//���ڿ� numbers�� �Ű������� �־��� ��, numbers�� ������ �ٲ� return �ϵ���
//solution �Լ��� �ϼ��� �ּ���.
public class ihateEnglish {
	public static void main(String[] args) {

		String[] number_arr = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

		String numbers = "onefourzerosixseven";
		for (int i = 0; i < number_arr.length; i++) {
			numbers = numbers.replaceAll(number_arr[i], String.valueOf(i));
		}
		long answer = Long.parseLong(numbers);
		System.out.println(numbers);

	}// main
}
