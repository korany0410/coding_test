package level_1;
////핸드폰 번호 가리기
//phone_number	return
//"01033334444"	"*******4444"
//"027778888"	"*****8888"
public class HidePhoneNumber {
	public static void main(String[] args) {
		
		String phone_number = "01041999841";	
		String answerF = "";
		String answerB = "";
		
		for( int i= 0; i<( phone_number.length()-4 ); i++) {
			answerF += "*";	
		}//for
		
		answerB = phone_number.substring( (phone_number.length()-4) );
		String answer = answerF+answerB;
				
		System.out.println(answer);
		
	}//main
}
