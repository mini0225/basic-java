package j25_문자열;

import java.net.http.HttpRequest;

public class String6 {
    public static void main(String[] args) {

        String httpRequest = "";
        /*
            문자열이 비어있지 않으면
            1. null x
            2. "" x
            3. " " x
          */

//        if(!httpRequest.replaceAll(" ","").equals("") && httpRequest != null){
        if(!httpRequest.isBlank()){ //isBlank = 2,3번 포함.  isEmpty 는 띄어쓰기는 공백으로 보지 않는다.
            System.out.println(httpRequest);
        }else{
            System.out.println("공백은 사용할 수 없습니다.");
        }
    }
}
