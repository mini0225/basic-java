package 자바패키지;


import java.io.FileInputStream;
import java.util.Scanner;

//파일 입출력 실습
public class Scanner1_2 {
    public static void main(String[] args) {
        try{
            FileInputStream fis = new FileInputStream("C://Users//antcj//Desktop//쿠폰.txt");
            //경로에 있는 파일 불러온다.

            Scanner s = new Scanner(fis);
            while(s.hasNext()){
                System.out.println(s.nextLine());
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
