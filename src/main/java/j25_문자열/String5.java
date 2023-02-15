package j25_문자열;

public class String5 {
    public static void main(String[] args) {

        String httpMethod = "Get";

        if(httpMethod.equalsIgnoreCase("get")){
            //equals는 대소문자 구분함.
            //equalsIgnoreCase 대소문자 구분안함.
            System.out.println("get요청 입니다.");
        }else{
            System.out.println("get요청이 아닙니다.");
        }

    }

}
