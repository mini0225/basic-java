package j19_컬렉션;

import java.util.*;

public class StudentList {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<Student>(); //업캐스팅
        students.add(new Student(20220001,"경민"));
        students.add(new Student(20220002,"창우"));
        students.add(new Student(20220003,"혜민"));
        students.add(new Student(20220004,"시영"));
        students.add(new Student(20220005,"혜진"));
        students.add(new Student(20220006,"지향"));

        String searchName = "시영";
        //forEach
        for(Student student : students){
            if(student.getName().equals(searchName)){
                System.out.println(searchName + "의 학번 : " +student.getId());
                break;
            }
        }
        System.out.println("----------------");

        //일반 for문
        for(int i = 0; i < students.size(); i++){

            Student student = students.get(i);

            if(student.getName().equals(searchName)){
                System.out.println(searchName + "의 학번 : " +student.getId());
                break;
            }
        }
        System.out.println("----------------");

        int searchId = 20220002;
        //foreach
        for(Student student : students){
            if(student.getId() == searchId){
                students.remove(students.indexOf(student));
                //remove안에는 index값이 와야함.
                break;
            }
        }
        System.out.println(students);
        System.out.println("----------------");
        //일반for
        for(int i = 0; i < students.size(); i++){
            Student student = students.get(i);
            if(student.getId() == searchId){
                students.remove(i);
            }
        }
        System.out.println(students);
        System.out.println("----------------");

        /*
            id=20220003 학생을 찾아서 그 학생의 이름이 혜민이면 민영으로 바꿔라.
         */

        searchId = 20220003;

        for(Student student : students){
            if(student.getId() == searchId &&student.getName().equals("혜민")){
                student.setName("민영");
                break;
            }
        }
        System.out.println(students);

        System.out.println("----------------");
        searchId = 20220004;
        /*
            iterator 를 사용해서 시영이를 경효로 변경
         */
        Iterator<Student> iterator = students.iterator();

        while(iterator.hasNext()){
            Student student = iterator.next();
            //꺼내서 학생변수에 담아라.
            if(student.getId() == searchId){
                student.setName("경효");
                break;
            }

        }
        System.out.println(students);
        System.out.println("----------------");
        //순서 뒤집기.
        List<Student> reverseStudents = new ArrayList<Student>();
        System.out.println("------순서바꾸기1----------");
        for(int i=0; i<students.size(); i++){
            reverseStudents.add(students.get(students.size()-1-i));
        }
        System.out.println(reverseStudents);
        System.out.println("------순서바꾸기2----------");
        for(Student student : students){
            reverseStudents.add(0,student); //원래 순서로 들어감.

        }

        System.out.println(reverseStudents);
        System.out.println("------순서바꾸기3----------");
        Collections.reverse(reverseStudents);
        System.out.println(reverseStudents);
        System.out.println("----------------");


        /*
            idList
            nameList
         */
        List<Integer> idList = new ArrayList<Integer>();
        List<String> nameList = new ArrayList<String>();

        for(Student student : students){
            idList.add(student.getId());
            nameList.add(student.getName());
        }

        System.out.println(idList);
        System.out.println(nameList);
        System.out.println("----------------");

        students.clear();

        System.out.println(students);
        System.out.println("----------------");

        for (int i = 0; i<idList.size(); i++){

            Student student = new Student(idList.get(i), nameList.get(i));
            students.add(student);
            }

        System.out.println(students);




    }
}
