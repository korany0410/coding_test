package level_0;
//���� ���� �Ա� (1)
//���� ����
//�Ӿ��̳� ���ڰ��Դ� ���ڸ� �ϰ� �������� �߶� �ݴϴ�. 
//���ڸ� �������� ����� �� n�� �־��� ��, 
//��� ����� ���ڸ� �� ���� �̻� �Ա� ���� �ʿ��� ������ ���� return �ϴ� solution �Լ��� �ϼ��غ�����.


public class Pizza {
	
	public static void main(String[] args) {
		
		int n = 24;
		int answer = 0;
		
		if( n%7 == 0 ) {
			answer = n/7;
		}else {
			answer = n/7 + 1;
		}
		System.out.println(answer);
		
		
	}//main
	
}
