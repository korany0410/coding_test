package protractor;
//������
//������ 0�� �ʰ� 90�� �̸��� ����, 90���� ����, 
//90�� �ʰ� 180�� �̸��� �а� 180���� ������ �з��մϴ�.
//�� angle�� �Ű������� �־��� �� ������ �� 1, ������ �� 2, �а��� �� 3, ���� �� 4�� return�ϵ��� solution �Լ��� �ϼ����ּ���.
//
//���� : 0 < angle < 90
//���� : angle = 90
//�а� : 90 < angle < 180
//�� : angle = 180
//���ѻ���
//0 < angle �� 180
//angle�� �����Դϴ�.
//����� ��
//angle	result
//70	1
//91	3
//180	4
public class Protractor {
	public static void main(String[] args) {
		
		int angle = 0;
		int answer = 0;
		if(0 < angle && angle < 90) {
			answer = 1;
		}else if( angle == 90) {
			answer = 2;
		}else if(  90 < angle && angle < 180 ) {
			answer = 3;
		}else if( angle == 180) {
			answer = 4;
		}
		
		
		
	}//

}
