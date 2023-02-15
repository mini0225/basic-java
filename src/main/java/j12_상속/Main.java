package j12_상속;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("혜민");
        Human human = new Human("경민");
        //Human 클래스가 animal클래스로 확장(상속)되어있는 상태이기 때문에
        //Human 클래스 생성시 Animal클래스 공간만큼 같이 생성된다.
        Tiger tiger = new Tiger("창우");

        animal.move();
        System.out.println("-------------------");
        human.move(); //human과 tiger는 animal 클래스를 상속받았기 때문에
        tiger.move(); //animal.move 와 같은 출력 발생

        //변수를 상속받을떄는 getter setter를 상속받는다
        System.out.println("동물이름 : " + animal.getName());
        System.out.println("사람이름 : " + human.getName());
        System.out.println("호랑이름 : " + tiger.getName());


    }

}
