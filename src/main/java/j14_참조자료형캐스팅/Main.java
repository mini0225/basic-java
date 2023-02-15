package j14_참조자료형캐스팅;

public class Main {

    public static void main(String[] args) {

        //version1
//        Computer computer1 = new Computer();
//        Computer computer2 = new Computer();
//        Computer computer3 = new Computer();
//        LED led = new LED();
//        Speaker speaker = new Speaker();
//
//        CentralControl centralControl = new CentralControl(computer3, computer1, computer2);
//        //원래 (Power)computer, (Power)led, (Power)speaker 가 들어와야 하지만 upcasting은 묵시적 형변환이 가능하기 떄문에 이렇게 가능.
//
//        centralControl.powerOn();
//        System.out.println("-------------------");
//        centralControl.powerOff();

        //version2
        Computer computer1 = new Computer();
        Computer computer2 = new Computer();
        Computer computer3 = new Computer();
        LED led = new LED();
        Speaker speaker = new Speaker();

        CentralControl centralControl = new CentralControl(new Power[5]);

        centralControl.addDevice(computer1);
        centralControl.addDevice(speaker);
        centralControl.addDevice(computer2);
        centralControl.addDevice(led);
        centralControl.addDevice(computer3);
        centralControl.addDevice(led);


        System.out.println("-------------------");
        centralControl.powerOn();
        System.out.println("-------------------");
        centralControl.powerOff();



    }

}
