package j05_Scanner;

import java.util.Scanner;

public class Input3 {

    /*
        이름 : 김준일           → name
        나이 : 29              → age
        주소 : 부산 동래구 사직동 → address
        연락처 : 010 9988 1916 → phone
        사용자의 이름은 김준일이고 나이는 29입니다.
        주소는 부산 동래구 사직동이며 연락처는 010 9988 1916입니다.

     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //위쪽에 모아서 변수 선언 및 초기화를 해놓으면 무슨변수가 있는지 한눈에 알 수 있다.
        String name = null;
        int age = 0;
        String address = null;
        String phone = null;


        System.out.println("이름 : ");
        name = scanner.next();

        System.out.println("나이 : ");
        age = scanner.nextInt();
        scanner.nextLine();
        //버퍼 때문에 'scanner.nextLine();' 필요, 아래의 주소를 입력하기전에 나이 입력후 치는 엔터를 주소가 먹어 버려서 입력이 넘어가버림.
        //next나 nextInt 다음에 나오는 nextLine앞에는 'scanner.nextLine();' 을 허공에다가 날려 준다
        // 앞전 스캔에서 날아온 엔터 때문에


        System.out.println("주소 : ");
        address = scanner.nextLine();

        System.out.println("연락처 : ");
        phone = scanner.nextLine();


        System.out.println("사용자의 이름은 "+name+"이고 나이는 "+age+"입니다.");
        System.out.println("주소는 "+address +"이며 연락처는 "+phone+"입니다.");


    }

}
