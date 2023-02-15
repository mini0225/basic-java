package j13_추상화.인터페이스;


/*
    추상클래스와 동일하게 생성불가능

    Interface
    1. 기본적으로 모든 메소드가 추상메소드로 정의된다.
        ->일반 메소드 정의불가능.
    2. default 키워드 추가해줌으로서 일반 메소드로 정의 가능.
    3. 생성자 정의 불가능 -> 생성불가능
    4. 일반 변수 선언 불가능
    5. 상수는 선언 가능. (접근지정자 public 만 사용).
 */
public interface Press {

    public final String NAME = "button"; //[상수선언, 초기화]

    public void onPressed(); //<-추상메소드랑 유사 public abstract void push();

//    private String name; [변수선언]

//    public Button(){ [생성자]
//
//    }


//    public default void pop() { [일반메소드]
//
//    }

}
