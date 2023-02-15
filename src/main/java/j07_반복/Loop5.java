package j07_반복;

import java.util.Scanner;

public class Loop5 {
    public static void main(String[] args) {

        for (int i = 0; i < 8; i++) {

            int dan = i+2;

                for(int j = 0; j<9; j++){ //변수 선언은 한번만 가능, 지역('{}')이 있기때문임. i,j,k 순으로 변수 설정
                    int num = j+1;
                    System.out.println( dan +"X" + num+"=" +(dan*num));
            }
        }
    }
}