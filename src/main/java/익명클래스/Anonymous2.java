package 익명클래스;

/*
    익명 클래스는  interface 또는 abstract 클래스를 일회성으로 구현할 때 많이 사용
 */

//interface 익명클래스로 구현하기
public class Anonymous2 {
    public static void main(String[] args) {

//        Inter1 it = new Inter1(); 인터페이스는 객체생성 불가능
        //익명 클래스를 사용해서 interface 일회성으로 구현
        Inter1 it = new Inter1(){
            @Override
            public void f1() {
                System.out.println("inter1 imple f1()");
            }
        };
        it.f1();
    }
}


interface Inter1{
    void f1();
}

//일반클래스 의 interface구현
class InterImpl implements Inter1{
    @Override
    public void f1() {

    }
}
