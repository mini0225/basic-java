package j06_조건;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Condition5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int selected = 0;

        System.out.println("[선택 프로그램]");
        System.out.println("1.메뉴1");
        System.out.println("2.메뉴2");
        System.out.println("3.메뉴3");
        System.out.println("4.메뉴4");
        System.out.println("5.메뉴5");
        System.out.print("실행할 명령을 선택하세요");
        selected = scanner.nextInt();

        switch(selected) { //selected 변수를 찾아서 switch한다.
            case 1: // 명령 a를 선택하면 a밑으로 다나옴
                // switch는 스타트지점(a)부터 밑으로 다나옴. 각각 break를 걸어줘야 함.
                System.out.println("메뉴1을 선택하셨습니다.");
                break;
            case 2:
                System.out.println("메뉴2를 선택하셨습니다.");
                break;
            case 3:
                System.out.println("메뉴3을 선택하셨습니다.");
                break;
            case 4:
                System.out.println("메뉴4를 선택하셨습니다.");
                break;
            case 5:
                System.out.println("메뉴5를 선택하셨습니다.");
                break;
            default : //한 지점. 해당 케이스가 없으면 찾아가는 지점.
                System.out.println("해당 번호는 선택할 수 없습니다.");

        }
        




    }
}
