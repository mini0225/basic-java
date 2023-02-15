package j10_접근지정자;

public class AccessModifierMain {
    public static void main(String[] args) {

        StudentAccessModifier sam = new StudentAccessModifier(1,"경민");

        sam.showInfo();

        sam.setCode(3);
        sam.setName("창우");
        sam.showInfo();

        System.out.println(sam.getCode());
    }
}
