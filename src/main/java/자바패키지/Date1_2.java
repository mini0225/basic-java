package 자바패키지;

import java.util.Calendar;

public class Date1_2 {
    public static void main(String[] args) {
        Calendar a = Calendar.getInstance();
        int year = a.get(Calendar.YEAR);
        int month = a.get(Calendar.MONTH)+1; //1월이 0이기 때문
        int date = a.get(Calendar.DATE);

        System.out.println(year+"년"+month+"월"+date+"일");
        System.out.println("--------------------------");
        System.out.print("오늘은 이번주에서 몇 일째 인가요? ");//일월화수
        System.out.println(a.get(Calendar.DAY_OF_WEEK));
        System.out.println("--------------------------");
        System.out.print("오늘은 이번 년도에서 몇 일째 인가요? ");
        System.out.println(a.get(Calendar.DAY_OF_YEAR));
        System.out.println("--------------------------");
        System.out.print("이번달은 며칠까지 있나요? ");
        System.out.println(a.getActualMaximum(Calendar.DATE));
        System.out.println("--------------------------");


    }
}
