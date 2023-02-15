package j13_추상화.추상클래스;

/*
    생산을 하는 개념 자체는 phoneFactory TabletFactory 동일.
    추상화는 just 선언하기 위한 용도
    abstract = 추상적인

    method 정의 = 선언부 + 구현부
    선언부 = [ public void produce(String model) ]
    구현부 = [ {System.out.println("[ "+model + " ]모델 스파트폰을 생산합니다.");} ]

    1. abstract '추상메소드'가 클래스 내에 하나라도 존재하면
       클래스 전체는 '추상클래스'로 정의되어야 한다.
    2. 추상클래스는 생성할 수 없다.
        -> 추상메소드는 구현부가 없기 때문에 실행 불가능 함으로 당연히 생성불가능.
    3. 그 외의 다른 특징은 일반 클래스와 동일.
 */

public abstract class Factory {

    private String name;

    public Factory(String name){
        this.name = name;
    }

    public abstract void produce(String model); //구현부 없이 선언만 함.
    public abstract void management();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printInfo(){
        System.out.println("공장의 정보를 출력합니다.");
        System.out.println("공장이름 : " + name);
    }

}
