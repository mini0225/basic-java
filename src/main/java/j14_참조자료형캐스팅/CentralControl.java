package j14_참조자료형캐스팅;

/* 중앙제어 */
public class CentralControl {

    // version 1
//    private Power computerPower;
//    private Power ledPower;
//    private Power speakerPower;

//    public CentralControl(Power computerPower, Power ledPower, Power speakerPower) {
//        this.computerPower = computerPower;
//        this.ledPower = ledPower;
//        this.speakerPower = speakerPower;
//    }
//    public void powerOn(){
//        computerPower.on();
//        ledPower.on();
//        speakerPower.on();
//    }
//
//    public void powerOff(){
//        computerPower.off();
//        ledPower.off();
//        speakerPower.off();
//    }

    //version 2
    //private 에는 power를 implements 한 객체만 들어오면 된다.
//    private Power device1;
//    private Power device2;
//    private Power device3;

//
//    //3구짜리 멀티탭이라고 생각,, private 늘리면 더 늘어남.
//    public CentralControl(Power device1, Power device2, Power device3) {
//        this.device1 = device1;
//        this.device2 = device2;
//        this.device3 = device3;
//    }
//
//    public void powerOn(){
//        device1.on();
//        device2.on();
//        device3.on();
//    }
//
//    public void powerOff(){
//        device1.off();
//        device2.off();
//        device3.off();
//    }

    //version 3
    private Power[] deviceArray;

    public CentralControl(Power[] deviceArrays){
        this.deviceArray = deviceArrays;
    }

    public void addDevice(Power device){
        int emptyIndex = checkEmpty();
        if(emptyIndex == -1){
            System.out.println("더 이상 장치를 추가할 수 없습니다.");
            System.out.println();
            return;
        }
        deviceArray[emptyIndex] = device;
        System.out.println(device.getClass().getSimpleName()+ "장치가 연결 되었습니다.");
        System.out.println();
    }
    private int checkEmpty(){
        for(int i =0; i<deviceArray.length;i++){
            if (deviceArray [i]==null){
                return i;
            }
        }
        return -1;
    }

    public void powerOn(){
        for(int i = 0; i< deviceArray.length; i++){
            if(deviceArray[i] == null) continue; //-> 하나의 명령이면 중괄호 생략가능
            deviceArray[i].on();
        }
    }
    public void powerOff(){
        for(int i = 0; i< deviceArray.length; i++){
            if(deviceArray[i] == null) continue;
            deviceArray[i].off();
        }
    }




}
