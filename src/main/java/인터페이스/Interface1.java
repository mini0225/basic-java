package 인터페이스;

/*
    인터페이스 내 일반 메서드 불가능
    인터페이스 내 변수 불가능 상수만 가능
    인터페이스 내 객체 생성 불가능
    인터페이스 내 멤버 메서트 abstract 키워드 생략가능
    인터페이스 내 멤버 변수 final 키워드 생략가능

 */

public class Interface1 {
    public static void main(String[] args) {
        B b = new B();
        b.methodA();
        b.methodB();
//        b.x=30; final 상수값 변경 불가능.
    }
}

interface Ainter{
    final int x = 10;
     int y= 20; //final 생략가능
    abstract void methodA();
    void methodB(); // abstract 생략가능
    //void f3(){}; 일반 메서드 불가능
}

class B implements Ainter{
    @Override
    public void methodA() {
        System.out.println("methodA입니다.");
    }

    @Override
    public void methodB() {
        System.out.println("methodB입니다.");
    }
}