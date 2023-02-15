package j16_Bean;
/*
    생성자에 관한.....
 */


public class Person {
//
//    private String name;
//    private int age;
//
//
//    public Person(String name){
//        this.name = name;
//    }
//    //=> 이런식으로 하면 변수가 리셋이 안되는 경우가 발생할 수도 잇음.
//
//    public Person(String name, int age){
//        this.name = name;
//        this.age = age;
//    }

    private final String name;
    private int age;
//final을 써줌으로써 상수 처리, 상수선언은 초기화가 꼭 필요=>생성자 필수 => noArgsConstructor 는 있을수가 없음.
//위 final name 는 필수값, 아래의 name 는 필수생성자(requiredConstructor)

//    public Person(){} 생성불가   <- NoArgsConstructor 는 RequiredConstructor와 함께 쓸수 없다.

    public Person(String name){    //<-RequiredConstructor
        this.name = name;
    }



    public Person(String name, int age) { //<-AllArgsConstructor
        this.name = name;
        this.age = age;
    }


}
