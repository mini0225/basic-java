package j08_메소드;

/*
    메소드란?  함수이다.
    함수란 ? 일련의 동작을 묶어 정의한 것.
    특징 : 입력과 출력을 가질 수 있다.( 필수 x : 입력이 없거나 출력이 없거나)
    왜 메소드 라고 불리는가?
    -> class 안에 함수를 정의하면 메소드 라고 부른다.  객체 지향언어에만 class 존재.
    -> class = {} 라는 묶음 안에 함수를 정의 하면 전부 메소드 라고 지칭.
    JAVA는 CLASS밖이 없다. -> 그래서 모든 함수=메소드
    함수를 실행하는 것을 우리는 호출(call)이라고 한다.
    함수를 쓸 수 있게끔 작성하는 것을 정의 라고 하고, 가져다 쓰는 행위를 호출이라 한다.

 */

public class Method1 {

    //1.[x | x] = 입력(매개변수) | 출력(반환)
    public static void call1(){ //()매개변수 위치, void : 반환을 하지않는다.
        System.out.println("[ x | x ]");
    }

    //2. [o|x]
    public static void call2(String str){
        System.out.println("[ o | x ]");
        System.out.println("수업과목 :" + str);
    }

    //3. [x|o]
    public static String call3(){ //얘는 void 가 없으니까 값임.
        System.out.println("[ x | o ]");

        String result = "";
        for (int i=0 ; i< 5; i++){
            for(int j = 0; j<i+1; j++){
                result +="*";
            }
            result +="\n";
        }
        return result;
    }

    //4. [o|o]
    public static String call4(int year, int month, int day){ //메소드(함수)는 입력은 여러개가 될 수 있지만 출력(out)은 하나만 가능.
        System.out.println("[ o | o ]");
        return year + "년" + month + "월" + day + "일"; //이렇게 하나의 값이 사용되어질때만 사용가능.
    }

    //psvm 이거도 결국 main 메소드
    public static void main(String[] args) { //main 얘도 JVM에서 호출함.
        call1(); //위에꺼 호출.
        call2("java"); // call2 의 매개변수 위치로 간다.
        String star1 = call3(); //call3 은 값이니까 변수지정 후 sout한다.
        System.out.println(star1);
        String date = call4(2022,10,24); //순서 맞춰야함.
        System.out.println(date);
    }

}
