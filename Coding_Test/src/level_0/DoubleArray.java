package doubleArray;
//�迭 �ι� �����
//���� ����
//���� �迭 numbers�� �Ű������� �־����ϴ�. 
//numbers�� �� ���ҿ� �ι��� ���Ҹ� ���� �迭�� 
//return�ϵ��� solution �Լ��� �ϼ����ּ���.

public class DoubleArray {
	public int[] solution(int[] numbers) {
		
	        int[] answer = new int [numbers.length];
	          for(int i = 0; i<numbers.length; i++) {
	        	answer[i] = numbers[i]*2;
	        }
	        return answer;
	    }
    }//solution


