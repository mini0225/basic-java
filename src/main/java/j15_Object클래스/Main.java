package j15_Object클래스;

public class Main {
    public static void main(String[] args) {

        ObjectTest objectTest = new ObjectTest();

        int hashCode = objectTest.hashCode();
        System.out.println(hashCode);
        // hashcode 란 해당 객체의 실제 주소값
        System.out.println(Integer.toHexString(hashCode));
        //toHexString : 16진수로 바꿔라.

        //=>함수(메소드)를 정의되지 않았는데 실행되는것(호출해서 쓴다는것)은 어딘가에 정의되어져 있다는말.

        System.out.println(objectTest);
        System.out.println("---------------------");

        objectTest.showInfo();

    }
}
