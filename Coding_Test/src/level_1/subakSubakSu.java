package level_1;

// 수박수박수박수박수박수?
// n	return
// 3	"수박수"
// 4	"수박수박"
public class subakSubakSu {
	public static void main(String[] args) {

		int n = 10;
		String answer = "";
		String subak = "";

		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				subak = "박";
			} else {
				subak = "수";
			}
			answer += subak;
		}

		System.out.println(answer);
	}// main
}
