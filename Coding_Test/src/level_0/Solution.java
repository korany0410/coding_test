package level_0;
//7�� ����

//�Ӿ��̴� ����� ���� 7�� ���� �����մϴ�. 
//���� �迭 array�� �Ű������� �־��� ��, 7�� �� �� �� �ִ���
//return �ϵ��� solution �Լ��� �ϼ��غ�����.
//���ѻ���
//1 �� array�� ���� �� 100
//0 �� array�� ���� �� 100,000
//����� �� #1
//[7, 77, 17]���� 7�� 4�� �����Ƿ� 4�� return �մϴ�.
//����� �� #2
//[10, 29]���� 7�� �����Ƿ� 0�� return �մϴ�.

public class Solution {
	
	public static void main(String[] args) {
		int array[] = {7,77,17,777};
		Solution sl = new Solution();
		sl.solution(array);
		System.out.println(sl.solution(array));
		
		
	}//main

	
	public int solution(int[] array) {
		
		int answer = 0;
		
		for (int i = 0; i < array.length; i++) {
			
			String num = "";
			num = String.valueOf(array[i]);
			
			for(int j =0; j<num.length(); j++) {
				
				
				if (num.charAt(j)== '7') {
					answer++;
				}
			}
		
		} // for
		
		return answer;
		
	}// solution
}
