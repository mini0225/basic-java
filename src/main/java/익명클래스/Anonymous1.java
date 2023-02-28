package 익명클래스;

public class Anonymous1 {
    public static void main(String[] args) {
        OuterClass1 o = new OuterClass1(){
            void a(){
                System.out.println("새롭게 정의된 1회용 익명클래스 메서드입니다.");
            }
        };
        o.a();
        OuterClass1 ok = new OuterClass1();
        ok.a(); //익명클래스는 1회성이라는것을 알수있음.

    }
}

class OuterClass1{
    void a(){
        System.out.println("method a");
    }
    void b(){}
}