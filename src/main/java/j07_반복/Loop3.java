package j07_반복;

import java.util.Scanner;

public class Loop3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = 0;

        System.out.println("몇번 반복할 지 입력 하세요 : ");
        n = scanner.nextInt();
        //1,2,3,4,5 가 출력되게 작성하시오

        for (int i =0; i<n; i++) {
            System.out.println("i : " +(i+1));
        }
        for(int i = 0; i<n; i++){
            System.out.println("i : "+(n-i));

        }



    }
}
