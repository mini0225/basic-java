package j18_제네릭;

/*
    responseData : 응답 데이터
 */

import javax.xml.crypto.Data;
import java.util.Date;

public class DataController {
    public static void main(String[] args) {
        Date now = new Date();

        ResponseData<String> responseData = new ResponseData<String>("날짜 저장 성공!", now.toString());
        System.out.println(responseData);

        ResponseData<Integer> responseData2 = new ResponseData<Integer> ("번호 자장 성공!", 10);
        System.out.println(responseData2);
    // => responseData 의 변수가 2개다 String 이기 때문에 다른거 못옴.
    // =>하나의 클래스 안의 자료형이 유동적으로 변하게 한다. (:재네릭)

        ResponseData<Date> responseData3 = new ResponseData<Date> ("날짜 객체 저장 성공", now);
        System.out.println(responseData3);
    }



}
