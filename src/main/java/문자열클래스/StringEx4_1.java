package 문자열클래스;

//Wrapper - 기본자료형을 객체화 하기 위함.
/*
    오토 박싱 ( auto boxing ) - 기본자료형 값을 자동으로 wrapper 클래스의 객체로 변환
    오토 언박싱 ( auto unboxing ) - wrapper 클래스의 객체값을 자동으로 기본자료형으로 변환.
 */

public class StringEx4_1 {
    public static void main(String[] args) {
        int i = 30;
        Integer ii = new Integer(i); //권장하지않음.
        System.out.println(ii);
        //Integer i = 30; 이런식으로
        System.out.println("-----------------------------");

        double d =3.14;
        Double dd = new Double(d);
        System.out.println(dd);


    }
}
