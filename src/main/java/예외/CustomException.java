package 예외;

public class CustomException {
    public static void main(String[] args) {
        int age = -19;
        try{
            ticketing(age);
        }catch(AgeException e){
            e.printStackTrace(); //e가 갖고있는 오류를 출력하겠다.
        }
    }
    public static void ticketing(int age) throws AgeException {
        if(age<0){
            throw new AgeException("나이 입력이 잘못되었습니다.");
        }
    }
}

class AgeException extends Exception{ //CustomException 은 exception을 상속받으면 웬만한거 다됨.
    public AgeException() {}
    public AgeException(String message){ //매개변수 생성자
        super(message);//message를 부모에게 보낸다
    }
}
