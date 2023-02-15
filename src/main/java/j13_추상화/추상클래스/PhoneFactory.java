package j13_추상화.추상클래스;

/*
    추상클래스를 extends 했을때는 구현부가 없기 때문에 강제성을 띄고 설계를 한다.
    '클래스끼리' 또는 '인터페이스끼리'는 extends 상속 한다 라고 한다.
    클래스-인터페이스는 implements 구현한다 라고 한다.

 */
public class PhoneFactory extends Factory{

    public PhoneFactory(String name) {
        super(name);
    }

    @Override
    public void produce(String model){
        System.out.println("[ "+model + " ]모델 스파트폰을 생산합니다.");
    }

    @Override
    public void management() {
        System.out.println("스마트폰 공장을 관리합니다.");

    }
}
