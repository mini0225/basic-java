package j15_Object클래스;

public class StringEquals {
    public static void main(String[] args) {

        String name1 = "김경민";
        String name2 = "김경민";
        //김,경,민 각각의 메모리 주소가 설정되었고 김경민 이라는 배열이 형성되었기 때문에 같은걸로 본다
        String name3 = new String("김경민");
        String name4 = new String("김경민");
        //new String 으로 메모리주소 설정을 각각 하였기 떄문에 다른값

        System.out.println(name1 + ", " + name2 + ", " + name3);


        // '==' 는 주소비교임.
        //1,2 는 새로 생성이 아니라 변수 설정임.
        System.out.println(name1 == name2);
        System.out.println(name1 == name3);
        System.out.println(name3 == name4); //=>주소가 틀림
        System.out.println("----------------");
        System.out.println(name1.equals(name3)); //->equals는 값비교임.

    }
}
