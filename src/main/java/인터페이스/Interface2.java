package 인터페이스;

public class Interface2 {
    public static void main(String[] args) {
        TourGuide guide = new TourGuide();
        guide.leisureSports();
        guide.sightseeing();
        guide.food();
    }
}

interface Providable{
    void leisureSports();
    void sightseeing();
    void food();

}

class KoreaTour implements Providable{
    @Override
    public void leisureSports() {
        System.out.println("한강에서 수상스키 투어");
    }

    @Override
    public void sightseeing() {
        System.out.println("경복궁 관람 투어");
    }

    @Override
    public void food() {
        System.out.println("전주 비빔밥 투어");
    }
}

class TourGuide {
    private Providable tour = new KoreaTour();//인터페이스 내로 업캐스팅
    public void leisureSports() {
        tour.leisureSports();
    }
    public void sightseeing() {
        tour.sightseeing();
    }
    public void food() {
        tour.food();
    }
}