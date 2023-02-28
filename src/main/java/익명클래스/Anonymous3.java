package 익명클래스;


//추상클래스를 익명클래스로 구현하기
public class Anonymous3 {
    public static void main(String[] args) {
//        Abstract ab = new Abstract(); 객체생성 불가능
        Abstract ab = new Abstract() {
            @Override
            void f2() {
                System.out.println("Abstract를 상속(extends)하는 f2()");
            }
        };
        ab.f2();
    }
}

abstract class Abstract{
    abstract void f2();
}
