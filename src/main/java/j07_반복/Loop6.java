package j07_반복;

/*
    for 문 은 일정한 규칙을 가지고 순차적으로 뭔가 증가될 때
    while 조건문!! if 처럼 사용, 해당 조건이 되었을때 멈춰라~
 */

public class Loop6 {
    public static void main(String[] args) {

        int n = 5;

        for (int i =0; i<n; i++){
            System.out.println(i+1);
        }

        int i = 0; // while 에 쓰이는 변수 i는 바깥쪽에 쓰인다.

        while(i<n) {
            System.out.println(i+1); // 큰일남, i를 +1 해서 출력해도 외부에 i가 있기 떄문에 i 는 계속 0 임.
            i++;
        }




    }
}