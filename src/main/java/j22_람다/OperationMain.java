package j22_람다;

/*
    구현할 메소드가 딱 하나만 있어야함.
 */
public class OperationMain {
    public static void main(String[] args) {

        int a = 10, b = 20;

        Operation add = new Operation(){
            @Override
            public int calc(int x, int y) {

                return x+y;
            }
        };

        /*  !!!!!!!!람다식!!!!!!!
            public int calc = '->'
            (int x, int y) = (x,y)
            return x+y = x+y
            Interface(여기서는 Operation)에서 함수가 두개가 정의되면
            람다식으로 바꿨을때 무슨 함수를 표현해야하는지 알수가 없음.
         */
        Operation add2 = (x,y) -> x+y;
        //익명함수의 정의 및 생성
        //Operation interface를 사용하게끔...
        //하나를 생성하게끔..

//        Operation sub = (int x, int y) -> {
//            return x-y;
//        };
//        위를 줄이면 밑!!
        Operation sub = (x,y) -> x-y;

        Operation multi = (x,y) -> x*y;
        Operation div = (x,y) -> x/y;

        System.out.println(multi.resultToString(multi.calc(b,a)));
        System.out.println("--------------");
        System.out.println(div.resultToString(div.calc(b,a)));
        System.out.println("--------------");
        System.out.println(sub.resultToString(sub.calc(b,a)));
        System.out.println("--------------");

        int addResult = add.calc(a,b);
        System.out.println(a +"+"+b+"="+addResult);

        System.out.println("--------------");

        int addResult2 = add2.calc(a,b);
        System.out.println(a +"+"+b+"="+addResult2);


    }
}
