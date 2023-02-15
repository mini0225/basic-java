package j11_배열.StudentManagement;

public class StudentRepository { //repository = 저장소
    private Student[] students;

    public StudentRepository(Student[] students) {
        students = new Student[0]; // 배열이 0 이니까 애초에 공간이 없음.
    }

    public void addStudent(Student student) { //만들어진 공간을 오버해서 추가가 되면 저장이 안됨(?)
        int index = indexOfEmpty();

        if(index == -1 ){ //공간이없다는 의미
            index = increaseArray(); //비어있는 위치 = index
        }

        students[index] = student; //비어있는 위치에 학생추가
    }

    private int indexOfEmpty(){ //공간이 없으면 생성하겠다.

        for(int i =0 ; i< students.length ; i++){
            if(students[i] ==null){
                return i; //비어있는공간(null) 이 나오면 그 공간을 출력 => 우리가 알수있음.
            }

        }
        return -1; //공간이 없음.


    }

    private int increaseArray(){
        Student[] tempArray = new Student[students.length + 1];
        for (int i =0 ; i<students.length ; i++){
            tempArray[i] = students[i]; //기존 index정보를 그대로 옮긴다.
        }

        students = tempArray; //대입이 다된 tempArray를 students로 새로 대입시킨다.

        return tempArray.length -1 ;
    }
}
