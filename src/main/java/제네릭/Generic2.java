package 제네릭;

public class Generic2 {
    public static void main(String[] args) {
        A<Integer> a1 = new A<>(); //앞에서 자료형을 정했기 때문에 뒤에서는 공백 가능
//        a1.x = 'a'; a1의 자료형을 integer로 잡았기 때문에 문자열이 들어오면 오류 발생
        a1.x = 10;
        a1.y = 20;
        System.out.println(a1.x + a1.y);
        System.out.println();

        A<String> a2 = new A<>();
        a2.x = "hello";
        a2.y = "world";
        System.out.println(a2.x + a2.y);


    }
}


class A<T>{
    T x;
    T y;
}