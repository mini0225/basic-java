package 문자열클래스;

//IntegerWrapper
public class StringEx4_2 {
    public static void main(String[] args) {

        Integer ii = 30; //auto boxing
        //Integer -> int
        System.out.println(ii.intValue()+3);
        //Integer -> double
        System.out.println(ii.doubleValue());
        //Integer -> float
        System.out.println(ii.floatValue());
        //Integer -> String
        System.out.println(ii.toString()+3);
//        System.out.println("hello"+"world");



    }
}
