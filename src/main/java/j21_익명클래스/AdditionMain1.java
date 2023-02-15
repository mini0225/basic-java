package j21_익명클래스;

public class AdditionMain1  {
    public static void main(String[] args) {
        Addition<String> stringAddition = new AdditionImpl<String>();
        //interface는 생성할수 없으니까 새 클래스로 implements해서 구현해준다.
        //AdditionImpl 을 업캐스팅해서 Addition 에 넣어준다

        String str = stringAddition.add("문자열");
        System.out.println(str);

        Addition<Integer> integerAddition = new Addition<Integer>() {

            @Override
            public Integer add(Integer values) {
                return null;
            }
        };
        //임시클래스를 정의함과 동시에 생성해서 integerAddition 에 그 주소를 담음.
        //1회성. 재상용 불가능.

    }
}
