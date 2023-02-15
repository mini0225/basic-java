package j25_문자열;

/*
    subString
    해당 index 부터 끝까지 잘라준다.
 */
public class String2 {
    public static void main(String[] args) {

        String phoneNumber = "010-8968-3970";

        int hyphenIndex = phoneNumber.indexOf("-"); //앞에서 3번째
        int lastHyphenIndex = phoneNumber.lastIndexOf("-"); //뒤에서 부터 찾아라


        System.out.println("index : " + hyphenIndex);
        System.out.println("lastIndex : " + lastHyphenIndex);

        String subStringLastNumber = phoneNumber.substring(lastHyphenIndex+1);
        System.out.println(subStringLastNumber);
        System.out.println("-------------------");


        String subStringMidNumber = phoneNumber.substring(hyphenIndex+1,lastHyphenIndex);
        System.out.println(subStringMidNumber);


    }
}
