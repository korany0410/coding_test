package lv0;

public class Pizza_3 {
    public static void main(String[] args) {
        int slice = 7; //조각 수
        int n = 10; // 사람 수
        int answer = 0;  //피자 판


        if( n % slice ==0){
            answer = n/slice;
        }else if(n%slice !=0){
            answer = n/slice + 1;
        }

        System.out.println(answer);



    }//main
}
