package 문자열클래스;

public class StringEx1 {
    public static void main(String[] args) {
        String str ="hello"; //이렇게 바로 가능

        //이어서 붙임. concat
        System.out.println(str.concat("world"));

        System.out.println("----------------------------");
        //subString(시작위치, 끝위치) 시작index부터 끝위치index전까지 출력
        System.out.println(str.substring(2,4));
        //subString(시작위치) 거기서부터 끝까지
        System.out.println(str.substring(3));

        System.out.println("----------------------------");
        //length 문자열의 길이를 들고온다
        System.out.println(str.length());

        System.out.println("----------------------------");
        //toUppercase, toLowerCase 대소문자로 변경
        System.out.println(str.toUpperCase());
        System.out.println("TEST".toLowerCase());

        System.out.println("----------------------------");
        //charAt(index) 해당 인덱스 문자 들고옴
        System.out.println(str.charAt(0));

        System.out.println("----------------------------");
        //indexOf(문자열) 해당 문자열의 인덱스를 들고옴
        //-1 값이출력될경우 찾지못한 것임.
        //대소문자 구분필요
        System.out.println(str.indexOf("e"));
        System.out.println("hello world".indexOf("orl"));

        System.out.println("----------------------------");
        //equals(문자열)
        System.out.println(str.equals("hello"));
        System.out.println(str.equals("HELLO"));

        System.out.println("----------------------------");
        //trim() 앞뒤 공백 제거
        System.out.println(" test ".trim());

        System.out.println("----------------------------");
        //replace, replaceAll
        System.out.println(str.replace("l","L"));
        System.out.println("hello world".replace("l","L"));
        System.out.println("hello world".replace("hello","bye"));

    }
}
