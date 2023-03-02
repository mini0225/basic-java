package 문자열클래스;

import java.util.Random;

//Random
public class String5 {
    public static void main(String[] args) {
        Random random = new Random(); //seed 현재시간
        Random random1 = new Random(); //seed 현재시간
        Random random2 = new Random(2); //seed:2
        Random random3 = new Random(2); //seed:2

        for(int i = 0; i < 5; i++) {
            System.out.println("기본생성자 : " +i+"번째 값 : "  + random.nextInt());
        }
        for(int i = 0; i < 5; i++) {
            System.out.println("random1 : " +i+"번째 값 : " + random.nextInt());
        }
        for(int i=0; i < 5; i++) {
            System.out.println("random2 : " +i+"번째 값 : "+random2.nextInt());
        }
        for(int i=0; i < 5; i++) {
            System.out.println("random3 : " +i+"번째 값 : "+random3.nextInt());
        }
//      => seed 값이 동일한 random2, random3 은 동일한 값이 나온다.
//        nextInt() 안에 숫자를 넣으면 0~숫자 사이 값으로 랜덤하게 출력
    }
}
