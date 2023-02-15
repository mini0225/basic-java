package j15_Object클래스;

public class ToString {
    public static void main(String[] args) {

        ObjectTest objectTest = new ObjectTest("name1", "address1");

        //동일한 값을 가지고 온다.
        System.out.println(objectTest);
        System.out.println(objectTest.toString());
        System.out.println("---------------------");


        //objectTest는 객체임, string이 아님으로 변수설정 불가능
        //toString을 붙여 줌으로써 변수설정가능.
        String str = objectTest.toString();
        System.out.println(str);
        System.out.println("---------------------");
        System.out.println(objectTest.showInfo());
        //objectTest.showInfo();

        System.out.println("---------------------");

        Teacher teacher1 = new Teacher("김경민", "부산");
        Teacher teacher2 = new Teacher("박창우", "창원");

        System.out.println(teacher1);
        System.out.println(teacher2);

    }
}
