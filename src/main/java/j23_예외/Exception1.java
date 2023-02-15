package j23_예외;

/*
    예외란 사용자의 잘못된 조작이나 개발자의 코딩실수로 인해 발생하는 프로그램 오류를 뜻한다.
    에러와 동일하나 예외처리를 통해 프로그램의 정상실행상태 유지 가능.
    일반예외(checked Exception) - 컴파일 전  // 실행예외 (UnChecked(Runtime) Exception) - 컴파일 후 프로그램 실행중 발생하는 예외
    일반예외는 개발자가 반드시 예외처리를 직접해야한다.
    Checked Exception - 오타, 세미콜론 누락 등 기본적인거
    java.lang.Exception 상속을받는다.
 */

public class Exception1 {

    public static void main(String[] args) {

        int[] numbers = new int[]{1,2,3,4,5,6,7};

        try{ //예외가 일어날 부분을 안으로 넣어준다.

            //2.
            String a = null;
            a.toLowerCase();
            //null 이므로 NullPointerException 발생
            //여기서 예외가 발생했기 때문에 for 문은 실행이 안됨.

            //1.
            for(int i = 0; i<8; i++) {
                System.out.println(numbers[i]);
            }

        }
        //1.
        catch(ArrayIndexOutOfBoundsException e){
            //위 반복문을 실행했을때 발생하는 예외를 작성한다.
            //exception을 받는애만 올수있음.
            System.out.println("예외를 처리하였습니다.");
        }
        //2.
        catch (NullPointerException e){
            System.out.println("null pointer to exception");
        }

        //3.
        finally{
            System.out.println("항상 실행되어야 하는 서비스");
        }
        System.out.println("프로그램 정상 종료");
//        1-1.자기한테 맞는 예외처리 필요, NullPointerException 쓰면 예외처리 못함.
//        catch(NullPointerException e){
//            //위 반복문을 실행했을때 발생하는 예외를 작성한다.
//            //exception을 받는애만 올수있음.
//            System.out.println("예외를 처리하였습니다.");
//        }


//-> index를 넘어섰다는 예외를 처리하고 반복을 마무리 짓는다.

//        for(int i = 0; i<8; i++) {
//            System.out.println(numbers[i]);
//        }

    }
}
