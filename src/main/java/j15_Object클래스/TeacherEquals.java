package j15_Object클래스;

public class TeacherEquals {
    public static void main(String[] args) {

        Teacher teacher1 = new Teacher("김경민", "부산");
        j15_Object클래스.equals.Teacher teacher2
                = new j15_Object클래스.equals.Teacher("김경민", "부산");

        //System.out.println(teacher1==teacher2);
        //↑자료형 자체가 다르기 때문에 비교자체불가능.
        System.out.println();
        System.out.println(teacher1.equals(teacher2));
        //object클래스는 기본적으로 주소비교임
        //equals는 둘중 하나만 달라도 다른걸로 봄. 패키지가 달라도 마찬가지.
        //equals는 어떠한 자료형도 허용.
        System.out.println("------------------");
        System.out.println(teacher1.hashCode()==teacher2.hashCode());
        //hashcode는 안의 갑만 같으면 true, teacher가 아니라 student가 와도 마찬가지


    }
}
