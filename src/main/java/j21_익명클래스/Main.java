package j21_익명클래스;

/*  1회용 클래스!!!
    반복적으로 쓸거면 클래스 파일로 빼라
    한번쓰고 말꺼면 그냥 한번생성하고 말아라.
    interface말고 추상클래스도 가능
 */

public class Main {
    public static void main(String[] args) {

        Interface1 interface1 = new Class1();
        Interface1 interface2 = new Class1();
        Interface1 interface3 = new Class1();
        Interface1 interface4 = new Class1();
        Interface1 interface5 = new Class1();
        //Class1 이 존재 하기 때문에 다른 클래스 에서도 사용가능.

        interface1.methodName();
        interface2.methodName();
        interface3.methodName();
        interface4.methodName();
        interface5.methodName();
        System.out.println("-------------------");

        Interface1 interface6 = new Interface1(){
            @Override
            public void methodName(){
                System.out.println("익명클래스로 정의한 메소드");
            };
        }; //Class 파일이 없어도 사용가능 1회성.임시구현 + 생성
        System.out.println("-------------------");
        interface6.methodName();
        System.out.println("-------------------");
        Interface1 interface7 = new Interface1() {
            @Override
            public void methodName() {
                System.out.println("익명클래스로 정의한 메소드");
            }
        };
        System.out.println("-------------------");
        interface7.methodName();
        System.out.println("-------------------");
        //반복적으로 쓸거면 클래스 파일로 빼라
        //한번쓰고 말꺼면 그냥 한번생성하고 말아라.
    }
}
