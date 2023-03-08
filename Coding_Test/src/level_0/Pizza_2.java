package level_0;
//피자 나눠 먹기 (2)
//머쓱이네 피자가게는 피자를 여섯 조각으로 잘라 줍니다. 
//피자를 나눠먹을 사람의 수 n이 매개변수로 주어질 때, 
//n명이 주문한 피자를 남기지 않고 모두 같은 수의 피자 조각을 먹어야 한다면 
//최소 몇 판을 시켜야 하는지를 return 하도록 solution 함수를 완성해보세요.
//입출력 예
//n	result
//6	1
//10 5
//4	2



public class Pizza_2 {
	public static void main(String[] args) {
		
		int n = 0;
		int answer = 0;

		// pizza 조각 수
		int pizza = 6;
		// 피자 조각이 n명에 나누었을때 나머지가 0이 아니면 +6조각
		while(pizza%n != 0) {
			pizza += 6;
		}
		
		answer = pizza / 6;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//main
}
