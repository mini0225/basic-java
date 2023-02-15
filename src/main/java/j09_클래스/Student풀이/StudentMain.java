package j09_클래스.Student풀이;

public class StudentMain {
    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();

        s1.name = "김경민";
        s1.studentCode = 20221001;
        s1.schoolName = "부경대학교";
        s1.studentYear = 1;

        s2.name = "박창우";
        s2.studentCode = 20221002;
        s2.schoolName = "부경대학교";
        s2.studentYear = 2;

        s1.showStudentInfo();
        s2.showStudentInfo();


//        System.out.println("<<<<<<<<학년증가반복>>>>>>");
//        for (int i = 0 ; i<10 ; i++){
//            s1.increaseStudentYear();
//
//        }
        s1.increaseStudentYear(2);
        s1.increaseStudentYear(2);
        s1.increaseStudentYear(2);
        System.out.println("------------");
        s1.showStudentInfo();

        s2.showStudentInfo();
        s2.increaseStudentYear(2);
        s2.increaseStudentYear(5);

    }
}
