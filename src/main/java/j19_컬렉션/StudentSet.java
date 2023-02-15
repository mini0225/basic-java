package j19_컬렉션;

import java.util.HashSet;
import java.util.Set;

/*
    1. 혜진 학생의 학번을 출력하세요
    2. 20220004 학번을 가진 학생의 이름을 민수로 변경하세요.
    3. 20220001 학번이 존재하면 해당 학생을 삭제 하세요.

    set->List 변환, 해당 List 를 학번순으로 정렬.
*/

public class StudentSet {
    public static void main(String[] args) {

        Set<Student> students = new HashSet<Student>();
        students.add(new Student(20220001,"경민"));
        students.add(new Student(20220002,"창우"));
        students.add(new Student(20220003,"혜민"));
        students.add(new Student(20220004,"시영"));
        students.add(new Student(20220005,"혜진"));
        students.add(new Student(20220006,"지향"));

        System.out.println(students);

        String searchName = "혜진";
        for(Student student : students) {
            if(student.getName().equals(searchName)){
                System.out.println(searchName + " 학생의 학번 : " + student.getId());
                break;
            }
        }
        System.out.println("-----------------");
        int searchId = 20220004;
        System.out.println(students);
        for(Student student : students) {
            if(student.getId() == searchId){
                student.setName("민수");
                System.out.println(students);
                break;
            }
        }
        System.out.println("-----------------");

        searchId = 20220001;
        for(Student student : students){
            if(student.getId() == searchId){
                students.remove(student);
                break;
            }
        }
        System.out.println(students);
        System.out.println("-----------------");

    }
}
