package 로또번호생성;

//import java.util.*; :모든 클래스 import
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lotto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int lottoArray[] = new int[6];
        int userArray[] = new int[6];

        int bonus;
        int bonusUser;

        int count = 0;

        //1~45까지의 랜덤숫자 출력
        for(int i = 0; i < 6; i++) {
            lottoArray[i] = random.nextInt(45) + 1;
        }
        bonus = random.nextInt(45)+1;

        System.out.println("Lotto : " + Arrays.toString(lottoArray) + "bonus : " + bonus);

        //사용자한테 6개 숫자 입력받기
        System.out.println("숫자 6개 입력 : ");
        for(int i = 0; i<6; i++){
            userArray[i] = scanner.nextInt();
        }
        System.out.println("보너스 숫자 입력 : ");
        bonusUser = scanner.nextInt();

        System.out.println("Lotto : " + Arrays.toString(userArray) + "bonus : " + bonusUser);

        //로또 배열의 값고 사용자 배열의 값 중 같은 값이 몇 개 있는지 카운팅
        for(int j = 0; j<6 ; j++){
            for (int i = 0; i < 6; i++) {
                if (lottoArray[j] == userArray[i]) {
                    count++;
                }

            }
        }
        System.out.println("총 맞춘 갯수 : " + count);

        if( count == 6) {
            System.out.println("축하드립니다. 1등입니다.");
        }else if( count == 5) {
            if (bonus == bonusUser) {
                System.out.println("축하드립니다. 2등입니다.");
            } else {
                System.out.println("축하드립니다. 3등입니다.");
            }
        }else if( count == 4) {
            System.out.println("축하드립니다. 4등입니다.");
        }else if( count == 3) {
            System.out.println("축하드립니다. 5등입니다.");
        }else {
            System.out.println("다음 기회에...");
        }

    }
}
