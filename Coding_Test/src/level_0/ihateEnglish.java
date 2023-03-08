package iHateEnglish;

//영어가 싫어요
//문제 설명
//영어가 싫은 머쓱이는 영어로 표기되어있는 숫자를 수로 바꾸려고 합니다. 
//문자열 numbers가 매개변수로 주어질 때, numbers를 정수로 바꿔 return 하도록
//solution 함수를 완성해 주세요.
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
