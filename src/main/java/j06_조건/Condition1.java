package j06_조건;

public class Condition1 {

    public static void main(String[] args) {

        int num = - 10;

        if (num > 0 || num ==0) { // if의 ()가 true 면 중괄호가 실행이 된다.

            System.out.println("numdl 0 이거나 num은 양수 입니다.");
        } else{
            System.out.println("num은 음수 입니다.");

        }

        if (num <0){ //참이 아니니까 아예 실행이 안됨.
            System.out.println("num은 음수 입니다.");

        }
    }
}

