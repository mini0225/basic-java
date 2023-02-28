package 예외;


//throws 내 예외처리 남이 할거야, 메서드가 호출되는 부분에서 처리하도록 함.
public class Exception5 {
    public static void main(String[] args) {
        try{
            methodA();
        }catch(Exception e){
            System.out.println("메인에서 처리");
        }
    }

    public static void methodA() throws Exception{
        methodB();
    }
    public static void methodB() throws Exception{
        methodC();
    }
    public static void methodC() throws Exception{
        Exception e = new Exception();
        throw e; //예외 발생
    }
}
