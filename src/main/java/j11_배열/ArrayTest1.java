package j11_배열;

public class ArrayTest1 {
    public static void main(String[] args) {
        int[] numArray = new int[10]; //0~9 까지의 4byte 짜리 int 방이 열개 생김.

        int index = 9;

        numArray[index] = 10;
        //=>나머지 자리는 0으로 초기화 되어 있는 상태임.
        for(int i = 0;i<10; i++){
            System.out.println(numArray[i]);
        }



    }
}
