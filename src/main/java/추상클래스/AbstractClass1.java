package 추상클래스;

public class AbstractClass1 {
    public static void main(String[] args) {
        Pokemon pokemon1 = new Pikachu();
        System.out.println("이 포켓몬 : "+ pokemon1.getName());
        pokemon1.attack();
        pokemon1.sound();

        Pokemon pokemon2 = new Squirtle();
        System.out.println("이 포켓몬 : "+ pokemon2.getName());
        pokemon2.attack();
        pokemon2.sound();
    }
}

abstract class Pokemon{
    String name;
    abstract void attack();
    abstract void sound();
    public String getName() {
        return this.name;
    }

}

class Pikachu extends Pokemon{
    Pikachu(){
        this.name = "피카츄";
    }

    @Override
    void attack() {
        System.out.println("전기공격");
    }

    @Override
    void sound() {
        System.out.println("피카피카");
    }
}

class Squirtle extends Pokemon{
    Squirtle(){
        this.name = "꼬부기";
    }

    @Override
    void attack() {
        System.out.println("물공격");
    }

    @Override
    void sound() {
        System.out.println("꼬북꼬북");
    }
}