package j12_상속;

public class Tiger extends Animal {
    public Tiger(String name) {
        super(name);
    }
    @Override
    public void move(){//Main 실행시에 여기가 뜬다. => method overriding
        System.out.println("네 발로 뜁니다.");

    }
}
