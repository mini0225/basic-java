package j05_Scanner;

import java.util.Scanner;

public class Input1 {
    public static void main(String[] args) {

        String name = "김경민" ;

        Scanner scanner = new Scanner(System.in); //scanner로 최초 선언 1회 후 스캔시에는 'scanner.' 사용하여 스캔한다.

        /**
         *   scanner.next(); 는 String 으로 저장된다. 띄어쓰기 포함 불가능, 띄어쓰기 기준으로 추가 입력값으로 인식한다.
         *   scanner.nextLine(); 는 띄어쓰기를 포함하여 입력가능.
         *   int s = scanner.next(); 는 성립할 수 없는 작성이다.
         *
         */

        System.out.println("이름: "+ name);

        String s1 = scanner.nextLine();  // scanner.next(); 주석처리 하니까 process finished 뜸. 살아있을 떄는 사용자의 입력을 기다린다. nextLine 은 띄어쓰기 가능
        String s2 = scanner.next();  // scanner.next(); 한번 호출에 한번 입력임. 띄어쓰기는 하나의 입력으로 받는다.
        String s3 = scanner.next();

        System.out.println();

        System.out.println("입력 받은 값1: " + s1);
        System.out.println("입력 받은 값2: " + s2);
        System.out.println("입력 받은 값3: " + s3);




    }

}
