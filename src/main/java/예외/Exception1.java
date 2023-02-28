package 예외;

/*
    예외란? 프로그램 실행중 발생하는 오류 중에서 처리가 가능한 것을 의미.
    - 에러 : 개발자가 조치를 취할수 없는 수준 ex) 메모리 부족, JVM동작이상
    - 컴파일 에러 : 컴파일(번역) 시 발생하는 에러 ex) 오타, 잘못된 자료형 등
    - 런타임 에러 : 프로그램 실행 도중 발생하는 에러
    - 로직 에러 : 실행은 되지만 의도와는 다르게 동작하는 에러
    - 예외 : 다른 방식으로 처리 가능한 오류 ex)입력값 오류, 네트워크문제

    예외처리란? 예외가 발생했을 때 이를 적절히 처리하여 프로그램이 비정상적으로 종료되는 것을 막는방법
    try{예외가 발생할수 있는 명령}
    catch(예외클래스명 e){예외 발생시 실행할 명령}
    finally{예외 발생여부와 관계없이 무조건 실행하는 명령}
 */

public class Exception1 {
    public static void main(String[] args) {
        int a = 0;
        int b = 2;
        try {
            int c = b / a; //0으로 나눌수 없어서 나오는 산술적(ArithmeticException) 오류
        } catch (ArithmeticException e) {
            int d = a / b;
        }
        ;
    }
}