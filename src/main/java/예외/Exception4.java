package 예외;


//throw? 일부러 예외를 만듦(던짐)
public class Exception4 {
    public static void main(String[] args) {
        try{
            Exception e = new Exception("고의 예외");
            throw e; //고의로 예외를 던지겠다.
        }catch(Exception e){
            System.out.println("예외발생");
            System.out.println(e.getMessage()); //내부적으로 저장된 "고의예외"출력됨.
        }
    }
}
