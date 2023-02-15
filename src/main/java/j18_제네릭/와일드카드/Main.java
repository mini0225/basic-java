package j18_제네릭.와일드카드;


public class Main {
//제네릭에서 <?>를 쓰는것은 어떠한 데이터가 올지 모르기 ㄸㅐ문에 써준다.
//<? extends Animal> 위에 추가적으로 Animal 클래스를 상속받은 객체만 가능.
//extends 는 하위로, super는 상위로 상속
    public AnimalData<? extends Animal> getAnimal(int flag){

        if(flag == 1) {

            AnimalData<Human> animalData = new AnimalData<Human>(new Human());
            return animalData;

        }else if(flag == 2) {

            AnimalData<Tiger> animalData = new AnimalData<Tiger>(new Tiger());
            return animalData;

        }
//        else if(flag == 3) {
//            AnimalData<Car> animalData = new AnimalData<Car>(new Car("k8"));
//            return animalData;
//        }
            return null;
        }



    public static void main(String[] args) {
        Main main = new Main();

        main.getAnimal(2).printData();
        System.out.println("------------------");

        System.out.println(main.getAnimal(2));
    }
}
