package j14_참조자료형캐스팅.동물;

/*
*   업캐스팅을 하는 이유
*   1. 반복
*   2. 부품조립?? <-interface의 실질적인 이유
* */

public class AnimalArrayMain {
    public static void main(String[] args) {
//        Animal animal1 = new Human(); //업캐스팅
//        Animal animal2 = new Tiger(); //업캐스팅
//        Animal animal3 = new Human(); //업캐스팅
//        Animal animal4 = new Tiger(); //업캐스팅

        Animal[] animals = new Animal[4];

        animals[0] = new Human();
        animals[1] = new Tiger();
        animals[2] = new Human();
        animals[3] = new Tiger();

        for(int i=0; i< animals.length; i++){
            animals[i].move();
        }
        System.out.println("-------------------------------");

        /*
            1. instanceof : 실제로 존재하는 것. 생성된거
            2. class :
            3. object :
        */
        for(int i=0; i< animals.length; i++){
            if(animals[i] instanceof Human){ //<-animals반복으로 나온애가 Human이냐
//                이렇게 다운캐스팅 먼저 하고 밑에 해도됨.
//                Human h = (Human)animals[i];
//                h.readBooks();
                ((Human) animals[i]).readBooks();
                //() 를 해줌으로써 다운캐스팅범위 지정가능
                // 안하면 animals[i].readBooks의 결과를 다운캐스팅하게 됨.
            }else if(animals[i] instanceof Tiger) {
                ((Tiger)animals[i]).hunting();
            }
        }

    }
}
