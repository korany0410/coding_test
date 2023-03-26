package level_1;

public class TurnNumIntoArr {
	public static void main(String[] args) {
		long n = 1596;
		String a = "" + n;
        int[] answer = new int[a.length()];
        
        int cnt=0;

        while(n>0) {
            answer[cnt]=(int)(n%10);
            n/=10;
//            System.out.println(n);
            cnt++;
        }
        
        System.out.println(answer);
        
	}

}
