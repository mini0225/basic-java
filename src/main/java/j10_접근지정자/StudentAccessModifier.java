package j10_접근지정자;

public class StudentAccessModifier {

    private int code; //앞에 public, private 같은 거 없으면 그냥  default임
    private String name; //private는 같은 class 내에서만 가능, 변수는 private,,,그냥받아들이기..

    public StudentAccessModifier(int code, String name){ //값을넣는방법 1. setter, 2.생성자를 통해서->생성자는 class와 이름이 같다.
        //위의 생성자 (StudentAccessModifier)도 마찬가지로 앞에 접근지정자가 없기 때문에 default임. 그래서 public을 붙여준다.
        this.code = code;
        this.name = name;
    } //생성자가 생성될때 값입력 가능, 외부로부터 입력되어 private 로 전달된다.
    //같은 class 내에 있기 때문에 위의 변수(code, name)에 접근가능
    //=>private 에 값 입력 가능.

    //setter 만들기 - 생성자는 생성될때만 값 세팅 가능, but setter는 주소지정만 해놓으면 언제든 가능
    public void setCode(int code){ //이름지을때 특징, 앞에 무조건 set 뒤에는 변수명인데 camel표기법으로 나타낸다 무조건.
        this.code = code;
    }

    public int getCode(){ //안에 있는 녀석을 밖으로 들고간다. => 'return' =값 출력
        return code;
    }

    public void setName(String name){
        this.name = name;
    }

    public String name(){
        return name;
    }

    //alr + insert 눌러서 getter setter 선택하면 all clear ㅎㅎ

    public void showInfo(){ //method는 웬만하면 public
        System.out.println("학번: " + code);
        System.out.println("이름: " + name);
    }
}
