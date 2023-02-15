package j09_클래스;

public class ClassA {

    //반환자료형 - 메소드 호출시에 어떤 자료형으로 받을것인가.
    int num;
    String name;
    double score;


    //=>생성자 = NoArgsConstructor  그래서 나중에 annotation 처리 할떄 이거 쓰네...
    //매개변수 = arguments
    ClassA(){}
    //다른생성자가 생겨버리면 기존꺼는 밑에처럼 죽는다.

    //모든 클래스는 ClassA(){}가 생략되어있다.
    //생성자 라고 일컫음. 항상 '주소'가 반환이된다.
    //반환자료형이 없음, 생성자 명은 클래스 명이랑 무조건 동일
    ClassA(int a){
        System.out.println("a: " +a);
        System.out.println("ClassA를 생성합니다.");
    }
    //생성되기만 하면 항상 위의 sout 이 실행됨.

    //void는 반환이 일어나지않
    void callName(){
        System.out.println(name + " 을(를) 부릅니다.");
    }
}
