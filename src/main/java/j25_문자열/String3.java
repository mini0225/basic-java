package j25_문자열;

/*
    replace - 찾은 문자열을 다른 문자열로 바꿔준다.
 */

public class String3 {
    public static void main(String[] args) {

        String phoneNumber = "010-8968-3970";

        String replacePhoneNumber =
                phoneNumber.replaceAll("-","")
                        .replaceAll("/","")
                        .replaceAll("_","")
                        .replaceAll(" ", "");

        System.out.println(replacePhoneNumber);
    }
}
