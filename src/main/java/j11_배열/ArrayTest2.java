package j11_배열;

/*
            10명의 학생이름을 담을 수 있는 StudentNames 배열을 출력
            [출력결과]
            1. 정빈
            2. 김규민
            3. 박경효
            4. 김혜진
            5. 김지향
            6. 전병욱
            7. 윤도영
            8. 이성욱
            9. 홍성욱
            10. 박민화
         */

import java.util.Scanner;

public class ArrayTest2 {
//    public static void main(String[] args) {
//
//        String [] StringArray = new String[10];
//
//        StringArray[0] = "정빈";
//        StringArray[1] = "김규민";
//        StringArray[2] = "박경효";
//        StringArray[3] = "김혜진";
//        StringArray[4] = "김지향";
//        StringArray[5] = "전병욱";
//        StringArray[6] = "윤도영";
//        StringArray[7] = "이성욱";
//        StringArray[8] = "홍성욱";
//        StringArray[9] = "박민화";
//
//
//
//        System.out.println("[출력결과]");
//
//        for(int i =0 ; i<10 ; i++){
//
//            System.out.println((i+1)+". " + StringArray[i]);
//
//        }
//    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int count = 0;
        String[] studentNames = null;

        System.out.print("학생 몇명을 등록하시겠습니까? ");
        count = scanner.nextInt();
        scanner.nextLine();

        studentNames = new String[count];

        for(int i =0;i< studentNames.length;i++){ //10을 studentNames.length 를 쓰면 배열 따라가서 편함.
            System.out.print((i+1)+"번 학생이름 : ");

            studentNames[i] = scanner.nextLine();
        }

        System.out.println("[출력결과]");

        for(int i =0; i<studentNames.length;i++){

            System.out.println((i+1)+"번 학생이름 : " + studentNames[i]);

        }

    }
}

