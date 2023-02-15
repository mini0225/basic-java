package j17_스태틱.싱글톤;


import lombok.Getter;


public class Samsung { //삼성이란 회사는 하나의 회사니까 싱글톤

    /*
    private Samsung(){}

    public static Samsung getSamsung(){
        return new Samsung();
    }
    => 이렇게 하면 Samsung.getSamsung(); 호출시에 new Samsung 으로 매번 새롭게 생성
       public 으로 풀어주는거랑 같음
     */

    @Getter //company 만
    private String company;
    private int serialNumber;

    //if 내에서 써야할 변수(instance)를 설정해 주고
    //그 변수를 끌어와야(getter필요) 하니까 getInstance 사용함.
    private static Samsung instance = null;

    private Samsung() {
        company = getClass().getSimpleName(); //->클래스 명을 들고온다.
        serialNumber = 20220000; // 그냥 고정ㅎㅎ 어차피 한번생성.
    }

    public static Samsung getInstance() {
        if(instance == null){
            instance = new Samsung();
        }
        return instance;
    }

    public String createSerialNumber(String model){
        return model + "_" + ++serialNumber;
    }

}

//초기 Instance생성 해버려서 오류 줄임.
//public class Samsung {
//    private static Samsung instance = new Samsung();
//
//    private Samsung() {}
//
//    public static Samsung getInstance() {
//        return instance;
//    }
//}