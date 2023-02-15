package j15_Object클래스;

/*
    모든 클래스는 object 클래스를 상속받는다.
    External Libraries -> jdk -> java.base -> java -> lang 안에 있는건 상속받지않는다.
 */

public class ObjectTest extends Object {

    private String name;
    private String address;

    public ObjectTest(){}

    public ObjectTest(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String showInfo() {
        return "name: " + name +", " + "address: " + address;
    }
//    public void showInfo(){
//        System.out.println("name : " +name);
//        System.out.println("address : " +address);
//    }


    //재정의
    @Override
    public String toString() {
        return"name: " + name +", " + "address: " + address;
    }
}
