package j11_배열.StudentManagement;

public class Student { //정보를 담는 객체 = Entity 라고 한다.
    private String name;
    private int kor;
    private int eng;
    private int math;
    private int totalScore;
    private int avgScore;
    private char grade;

    public Student(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;

        calculation();
    }

    private void calculation() {
        setTotalScore();
        setAvgScore();
        setGrade();
    }
    private void setTotalScore(){
        totalScore = kor + eng + math;
    }

    private void setAvgScore(){
        avgScore = totalScore/3;
    }

    private void setGrade(){
        if(avgScore>89) {
            grade = 'A';
        }else if(avgScore>79){
            grade = 'B';
        }else if(avgScore>69){
            grade = 'C';
        }else if(avgScore>59){
            grade = 'D';
        }else{
            grade = 'F';
        }

    }


    public void showStudentInfo(){
        System.out.println("[학생 정보 출력]");
        System.out.println("이름 : " + name);
        System.out.println("국, 영, 수 : " + kor + ", " + eng + ", " + math);
        System.out.println("총점 : " + totalScore);
        System.out.println("평균 : " + avgScore);
        System.out.println("학점 : " + grade);

    }
}
