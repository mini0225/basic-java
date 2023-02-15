package j23_예외;

public class Exception2 {
//    ver1.
//    public static void printArray(int[] numbers){
//
//        try {
//            for (int i = 0; i < numbers.length + 1; i++) {
//                System.out.println("/" + numbers[i]);
//            }
//        }catch(ArrayIndexOutOfBoundsException e){
//            e.printStackTrace();
//            //프로그램을 정상종료 시키되 어떤 예외가 발생했는지 보여줌.
//        }
//    }
//
//    public static void main(String[] args) {
//        printArray(new int[] {1,2,3,4,5,6,7});
//
//        System.out.println("에외처리 완료");
//
//    }

//    ver2 printArray 안에서 예외가 발생한 거니까 이렇게도 가능
//    public static void printArray(int[] numbers){
//
//        for (int i = 0; i < numbers.length + 1; i++) {
//            System.out.println("/" + numbers[i]);
//        }
//}
//
//    public static void main(String[] args) {
//
//        try {
//            printArray(new int[] {1,2,3,4,5,6,7});
//
//        }catch(ArrayIndexOutOfBoundsException e){
//            e.printStackTrace();
//            //프로그램을 정상종료 시키되 어떤 예외가 발생했는지 보여줌.
//        }
//        System.out.println("에외처리 완료");
//    }

//    ver3 예외가 발생할지 안할지 모르니까 throws Exception 달아준다.
    public static void printArray(int[] numbers) throws Exception {
//throws 는 예외를 메소드를 호출한 지점으로 미루겠다.
        for (int i = 0; i < numbers.length + 1; i++) {
            System.out.println("/" + numbers[i]);
        }
    }

    public static void main(String[] args) {/*throws Exception 쓰면 printArray 빨간줄(예외) 없앨수있음+실행가능*/

        if(1==1){
            try {
                throw new RuntimeException("예외 강제 생성");
            }catch(RuntimeException e){
                System.out.println("런타임 예외 처리");
            }finally{
                System.out.println("예외가 발생 하든 하지 않든 실행.");
            }
        }
        System.out.println("프로그램 정상 정료");
        System.out.println("--------1-------");

        if(1==1){
            try {
                throw new RuntimeException("예외 강제 생성");
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("런타임 예외 처리");
            }finally{
                System.out.println("예외가 발생 하든 하지 않든 실행.");
            }
        }
        System.out.println("프로그램 정상 정료");
        System.out.println("-------2--------");

        if(1==1){
            try {
                throw new RuntimeException("예외 강제 생성");
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("런타임 예외 처리");
            }catch(Exception e){ //모든 예외를 받을수 없으니까 이렇게 함.
                e.printStackTrace();
            }
            finally{
                System.out.println("예외가 발생 하든 하지 않든 실행.");
            }
        }
        System.out.println("프로그램 정상 정료");
    }
//        try {
//            printArray(new int[]{1, 2, 3, 4, 5, 6, 7});
////alt + enter 누르면 surround with try,catch 하면 자동으로 걸어줌.
//        }catch(ArrayIndexOutOfBoundsException e) {
//            e.printStackTrace();
//        }
//        catch (Exception e) {
//            throw new RuntimeException(e);
//            //throw - 없던 예외도 강제로 만든다
//        }
//        System.out.println("에외처리 완료");
//    }

//throw - 예외를 강제적으로 생성  / throws -
//finally 에 임시저장파일 넣는달까... 무조건 실행되니까


}
