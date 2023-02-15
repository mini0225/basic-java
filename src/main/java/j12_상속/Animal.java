package j12_상속;

public class Animal {

    private String name;
    //변수는 private임 ->getter setter 상속받는다고 생각
    //상속을 해줬다 하더라도 private는 상속안됨 같은 클래스에서만 가능.

    public Animal(String name){
        System.out.println("Animal 생성");
        this.name = name;
    }

    public void move(){
        System.out.println("움직입니다.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
