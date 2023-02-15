package j08_메소드;

import java.util.Random;

public class RandomNumber {
    //합수는 class 안에 작성.
    public static int calcRandom(int m){ //함수정의...복잡한 logic 재사용, 타이핑 시간 단축, 상황에 따른 다른 값 사용을 하기 위해
        //int = 자료형, m = 변수명 {}안에서만 사용
        Random random = new Random();
        int result = random.nextInt(10) *1000 + m;

        return result;
        //리턴자료형=반환자료형 : 자료형 변경 불가능.
    }

    public static void main(String[] args) {
        //Random random = new Random();
        //자료형 Random 은 같은 이름이라도 아래위중괄호 각각 존재할 수 있음.
        //위의 public 과 여기의 public 은 다른 지역으로 본다.
        int money = 5000;

//        int a = random.nextInt(10) * 1000 +money;
//        System.out.println(a);
//        int b = random.nextInt(10) * 1000 +money;
//        System.out.println(b);
//        int c = random.nextInt(10) * 1000 +money;
//        System.out.println(c);
//        int d = random.nextInt(10) * 1000 +money;
//        System.out.println(d);


//        for(int i = 0; i<10; i++){
//
//            int randNum = random.nextInt(10) +10; //0~9 , +10 해주면 10~19사이 랜덤, 즉 +n 은 시작점 설정.
//            System.out.println(randNum);
//
//
//        }

        System.out.println(calcRandom(money)); //위의 동작결과를 가진다(return)
        System.out.println(calcRandom(money));
        System.out.println(calcRandom(money));
        System.out.println(calcRandom(money));
        System.out.println(calcRandom(money));
        System.out.println(calcRandom(money));
        System.out.println(calcRandom(money));

        int r = calcRandom(money);

        System.out.println(r+100);
        System.out.println(r+1000);





    }
}
