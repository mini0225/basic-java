package j24_forEach;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class CollectionForEach {
    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();

        list.add("김경민");
        list.add("박창우");
        list.add("장혜민");
        list.add("김시영");
        list.add("김민영");

        for(String name :list) {
            System.out.println(name);
        }
        System.out.println("-----------------");
        list.forEach(name-> {
           System.out.println(name);
        });

        System.out.println("-----------------");

        Set<Integer> numbers = new HashSet<Integer>();
        for(int i = 0; i < 100; i++) {
            numbers.add(i+1);
        }
        AtomicInteger result = new AtomicInteger();

        numbers.forEach(num ->{
            result.addAndGet(num); //가지고와서 더해라
        });
        System.out.println(result.get());

        System.out.println("-----------------");

        Map<Integer,String> students = new TreeMap<Integer,String>(); //Integer 가 키값이라 treemap 사용가능, 순서대로 정렬됨.
        for(int i = 0; i<10 ;i++){
            students.put(20220001 +i , "경민"+(i+1));

        }
        students.forEach((key, value) ->{
            System.out.println("학번 :" + key + ", 이름 : " + value);
        });
    }
}
