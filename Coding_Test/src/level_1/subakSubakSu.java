package level_1;

// ���ڼ��ڼ��ڼ��ڼ��ڼ�?
// n	return
// 3	"���ڼ�"
// 4	"���ڼ���"
public class subakSubakSu {
	public static void main(String[] args) {

		int n = 10;
		String answer = "";
		String subak = "";

		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				subak = "��";
			} else {
				subak = "��";
			}
			answer += subak;
		}

		System.out.println(answer);
	}// main
}
