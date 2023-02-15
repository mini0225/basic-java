package j19_컬렉션;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class StringList {
    public static void main(String[] args) {
        //인터페이스는 생성불가능하므로 그 인터페이스로 생성된(implements) 객체인 arraylist 사용
//        ArrayList<String> list = new ArrayList<String>();
//        add를 하게 되면 제일 뒤에 자동으로 배열
//        list.add("김");
//        list.add("경");
//        list.add("민");
//        System.out.println(list.get(2));

        //ArrayList - 클래스 , <> 있으니까 제네릭임.
        ArrayList<String> list = new ArrayList<String>();
        printCollection(list);

        //값 추가.
        list.add("문자열1");
        list.add("문자열2");
        list.add("문자열3");
        list.add("문자열4");

        printCollection(list);

        list.add(1,"문자열5");
        printCollection(list);
        //->해당 index에 들어감으로써 원래 있던 배열은 한칸씩 뒤로 밀림.
        System.out.println("--------1-----------");
        //addAllList라는 새로운 List에 기존의 list배열을 그대로 옮긴다.
        ArrayList<String> addAllList = new ArrayList<String>();
        addAllList.addAll(list);
        printCollection(addAllList);
        System.out.println("--------2-----------");
        addAllList.addAll(2,list);
        printCollection(addAllList);
        System.out.println("----------3---------");

        //값조회
        String str1 = list.get(0); //0 : index 위치
        System.out.println("str1 : "+str1);
        System.out.println("-------4------------");


        //forEach, 반복을 사용한 값조회(forEach or for)
        for(int i =0; i<list.size(); i++){
            System.out.println("일반 for - str : " +list.get(i));
        }
        System.out.println("---------5----------");

        for(String str : list){
            System.out.println("forEach - str : " + str);
        }
        System.out.println("--------6-----------");

        Iterator<String> iterator = list.iterator();
        // -> list를 iterator로 변경
        System.out.println("iterator 첫 생성시 : "+ iterator.next());
        System.out.println("-------------------");
        //첫번째 문자열1 이 나와서 아래의 while에서는 문자열1이 빠진거 부터 반복이 일어난다.
        while(iterator.hasNext()){
            //iterator.hasNext() 가 true 면 반복시작, hasNext : 다음이 있니?
            System.out.println("iterator - str : " + iterator.next());
            //iterator.next() 다음 값을 불러오면서 그 index를 비운다.
            //반복이 끝나고 나면 iterator는 비어있음.
        }
        System.out.println("-------------------");
//        System.out.println("iterator 반복 후 : "+ iterator.next());
//        위에서 다 뺐기 때문에 오류가 뜨면서 프로그램이 종료가 되어 버림.
//        그래서 hasNext 랑 같이 써야 함.

        //값 수정
        printCollection(list);
        list.set(1,"문자열6");
        printCollection(list);
        System.out.println("-------------------");

        //값 삭제
        list.remove("문자열4"); //지정삭제
        printCollection(list);
        list.remove(0); //해당 index위치에 있는거 삭제
        printCollection(list);

        for(int i = 0; i < list.size(); i++){
//            System.out.println(list.get(i));
            if(list.get(i).equals("문자열3")){
                list.remove(i);
                break;
            }//문자열3 이 나오는 순간 지우고 반복종료
            // break가 없으면 오류가 남, 해당 index지우고나면 list는 앞으로 당기기 때문에 오류 발생.
        }
        printCollection(list);

        //값의 위치 찾기, 여러개인 경우 앞쪽껄 가져온다.
        list.add("문자열7");
        list.add("문자열8");
        list.add("문자열2");
        printCollection(list);

        int index = list.indexOf("문자열2");
        System.out.println("문자열2 의 위치 : " + index);

        int lastIndex = list.lastIndexOf("문자열2");
        System.out.println("뒤에서 부터 찾은 문자열2 의 위치 : " + lastIndex);
        System.out.println("-------------------");

        //값을 포함하고 있는지 여부 조회
        boolean isTrue2 = list.contains("문자열2");
        System.out.println("list에 문자열2가 포함되어 있는거 ? " + isTrue2);
        boolean isTrue1 = list.contains("문자열1");
        System.out.println("list에 문자열1가 포함되어 있는거 ? " + isTrue1);
        System.out.println("-------------------");

        //리스트를 배열로 변환
        //list안에 어떤 값이 들어 있을지 모르니까 object로 리턴.
        Object[] objects = list.toArray();
        System.out.println(objects[0]);
        System.out.println("-------------------");

        for(Object object : objects){
            System.out.println(object);
        }


    }

    public static void printCollection(Collection collection){
        System.out.println(collection);
        System.out.println();
    }

}
