package 자바패키지;

import java.text.SimpleDateFormat;
import java.util.Date;

//Format, 내가원하는 날짜형식으로 변환가능.
public class Date2 {
    public static void main(String[] args) {
        Date day = new Date();
        String patternKorea = "yyyy-MM-dd";
        String patternUSA = "MM-dd-yyyy";
        String patternUK = "dd-MM-yyyy";
        String pattern1 = "E요일 HH시 mm분 ss초";

        SimpleDateFormat p1 = new SimpleDateFormat(patternKorea);
        SimpleDateFormat p2 = new SimpleDateFormat(patternUSA);
        SimpleDateFormat p3 = new SimpleDateFormat(patternUK);
        SimpleDateFormat p4 = new SimpleDateFormat(pattern1);
        System.out.println("-------------------------------");
        System.out.println("현재 날짜 : "+ day);
        System.out.println("한국형식(년월일) :" + p1.format(day));
        System.out.println("미국형식(월일년) :" + p2.format(day));
        System.out.println("영국형식(일월년) :" + p3.format(day));
        System.out.println("pattern1 : "+ p4.format(day));
    }
}
