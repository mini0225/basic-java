package 자바패키지;

import java.util.Calendar;
import java.util.GregorianCalendar;

//Calendar 패키지
public class Date1_1 {
    public static void main(String[] args) {

        Calendar a = Calendar.getInstance(); //싱글톤 패턴
        Calendar b = new GregorianCalendar();

        System.out.println(a.toString());
        System.out.println(b.toString());
        //동일한 출력값.
    }
}
