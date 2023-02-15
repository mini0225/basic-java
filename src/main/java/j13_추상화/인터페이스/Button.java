package j13_추상화.인터페이스;

public abstract class Button implements Press, Up, Down{
    //control + I 를 눌러 interface 들을 override(구현) 시켜준다
    //아무런 동작을 하지않는 형태로 만들어준다.
    //상속받은 Button은 press, up, down을 구현시켜 주어야 한다.
    @Override
    public void onDown() {}

    @Override
    public void onPressed() {}

    @Override
    public void onUp() {}

}
