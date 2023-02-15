package j14_참조자료형캐스팅.동물;

public class AnimalMain {

    public static void main(String[] args) {

        Human human = new Human();
        Tiger tiger = new Tiger();

        Animal animal1 = null;
        Animal animal2 = null;

        System.out.println("[캐스팅 전]");
        human.move();
        human.readBooks();

        tiger.move();
        tiger.hunting();


        System.out.println("[캐스팅]");


        System.out.println("<업 캐스팅>");
        animal1 = human;
        animal2 = tiger;
        //extend Animal => animal을 상속받은거기 떄문에 animal이 상위 클래스
        //업캐스팅이 되면 자식요소만 가지고 있는 method 나 변수는 사용할수 없음.

        //상위클래스에서도 존재하는 method 이기 때문에 업캐스팅이되어도 사용가능
        animal1.move(); //human 의 move
        animal2.move(); //tiger 의 move

        System.out.println("<다운 캐스팅>");//상위객체가 하위객체로 형변환
        //Animal 클래스는 추상 클래스 이기 떄문에 생성불가능
        //위에서 animal1,2를 업캐스팅 시켜놓은 상태임.=animal 객체
        Human d_human = (Human) animal1;
        Tiger d_tiger = (Tiger) animal2;
        d_human.readBooks();
        d_tiger.hunting();

        System.out.println("--------------------");
        System.out.println();

        Animal a = new Animal();
        Human h = (Human) a;
        h.readBooks(); // 메모리 구조로 인한 오류 발생.




    }
}
