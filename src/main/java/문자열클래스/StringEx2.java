package 문자열클래스;

//StringBuffer
/*
    String 의 replace 는 일시적으로 새로운 값이 들어가는것
    StringBuffer 의 replace 는 아예 바뀌어버리는 경우
 */
public class StringEx2 {
    public static void main(String[] args) {
        String str = "test";
        StringBuffer buffer = new StringBuffer("test");

        String str1 = str.replace("t","T");
        System.out.println(str);
        System.out.println(str1);
        System.out.println(str);
        System.out.println();

        buffer.replace(1,3,"ES");
        System.out.println(buffer);
    }
}
