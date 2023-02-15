package j13_추상화.인터페이스;

public class PowerButton extends Button {
//쌍방향작용 하기 때문에 extends 를 통한 상속관계가 되어야한다.
    private boolean status; //false 로 초기화

    @Override
    public void onPressed() {
        if(status){
            status = false;
            System.out.println("전원을 끕니다.");
        }else{
            status = true;
            System.out.println("전원을 켭니다.");
        }

    }
}
