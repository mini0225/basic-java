package j04_연산자;

//산술연산자 + 대입연산자

public class Operation4 {
    public static void main(String[] args) {
        int num = 10;

        num = num +2;  //num += 2 랑 동일

        System.out.println(num);

        System.out.println();

        num += 2; //기존  num 에 +=뒤의 수를 더한다.

        System.out.println(num);

    }
}
