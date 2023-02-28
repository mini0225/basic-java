package 내부클래스;

public class InnerClass1 {
    public static void main(String[] args) {

    }
}

class A {
    static class StaticInner{}
    class InstanceInner{}

    //객체생성
    StaticInner st1 = new StaticInner();
    InstanceInner ii1 = new InstanceInner();

    static void StaticMethod(){
        StaticInner st2 = new StaticInner();
//        InstanceInner ii2 = new InstanceInner();
//        =>스태틱 메서드는 인스턴스 멤버에 접근불가능
//        =>static 키워드가 붙는 순간 메모리에 저장되는 영역이 달라진다
//          + 객체 생성되기전에 만들어짐
//        instance는 생성될때 만들어짐으로 생성시기가 달라 접근 불가능

    }

    void InstanceMethod(){
        StaticInner st3 = new StaticInner();
        InstanceInner ii3 = new InstanceInner();
    }
}
