package j12_상속;

public class Human extends Animal {  // 'extends Animal' 상속받고 싶은 클래스 명을 쓴다.

    public Human(String name){
        super(name);
        //부모의 주소를 가리킨다, 항상 생략

        System.out.println("Human 생성");
    }

//    public void runMove(){
//        move(); //animal 클래스의 move method 호출가능
//    }

    //상속받은 클래스에서 이미 move 정의가 되어 있기 때문에 쓰면안될거같지만 사용가능

    @Override
    //=>해당 메소드가 상위 객체로 부터 '재정의 된 메소드' 라는 것을 just표기
    //중복되는 메소드가 너무 많아 져서 구분하기 위해서
    public void move(){ //Main 실행시에 여기가 뜬다. => method overriding
        super.move();
        System.out.println("-------------------");
        System.out.println("두발로 걷습니다. ");
    }

}

/*
*       메소드 오버라이딩(오버라이드)
*       =>[재정의]
*       상위 객체(animal)의 메소드를 하위 객체(human,tiger)에서 다시 정의하는 행위
* */
