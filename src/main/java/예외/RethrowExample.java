package 예외;

public class RethrowExample {
    public static void main(String[] args) {
        try{
            System.out.println("외부try");
            try{
                System.out.println("내부try");
                Exception e = new Exception();
                throw e;
            }catch(Exception e){
                System.out.println("(내부try-catch) exception: " + e );
                System.out.println("예외 던지기 한번더 :");

                throw e;
            }finally {
                System.out.println("finally 구문 출력");
            }

        }catch(Exception e){
            System.out.println("(외부try-catch) exception: " + e);

        }
        System.out.println("종료");
    }
}
