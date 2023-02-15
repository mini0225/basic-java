package j22_람다;


@FunctionalInterface //없어도 됨. 기능은 추상메소드를 두개이상 만들수 없게끔 방지함.+'람다'용 인걸 인지시킴.
public interface Operation {
    public int calc(int x, int y);

    public default String resultToString(int result){
        return "결과 : "+ result;
    }
}

