package j19_컬렉션;

import javax.swing.text.html.parser.Entity;
import java.util.*;

public class StringMap {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<String,String>();
        List<String> list = new ArrayList<String>();

        list.add("김경민");
        list.add("박창우");
        list.add("정혜민");
        list.add("김시영");
        list.add("김경민");

        System.out.println(list);
        System.out.println(list.get(3));

        map.put("kor2022000-j","김경민");
        map.put("kor2022000-l","박창우");
        map.put("kor2022000-d","정혜민");
        map.put("kor2022000-c","김시영");
        map.put("kor2022000-j2","김경민");
        //key값도 string이 들어가야해서 ""필요
        //원하는 키값 가능.
        //키값으로 문자 가능. 배치는 set과 동일.
        System.out.println(map);
        //System.out.println(map.get("5"));
        // =>해당 key값으로 검색가능.

        /*
            kor2022000-c 학번의 학생의 이름을 김완준으로 바꿔라(2가지)
         */

        String searchId = "kor2022000-c";
        //put 을 통한 단순 값변경
        map.put(searchId, "김완준");
        System.out.println(map);
        System.out.println("-------------------");
        //replace 를 통한 값변경(list.set()과 동일)
        map.replace(searchId, "이성욱");
        System.out.println(map);
        System.out.println("-------------------");
        //remove 를 통한 값 삭제
        map.remove(searchId);
        System.out.println(map);
        System.out.println("-------------------");

        boolean searchSuccessflag1 = map.containsKey(searchId); //들어있는지 유무확인.
        boolean searchSuccessflag2 = map.containsKey("kor2022000-j"); //들어있는지 유무확인.
        System.out.println(searchSuccessflag1);
        System.out.println(searchSuccessflag2);
        System.out.println("-------------------");

        searchSuccessflag1 = map.containsValue("김경민");
        System.out.println(searchSuccessflag1);
        System.out.println("-------------------");

        Set<Map.Entry<String, String>> entry = map.entrySet();
        List<Map.Entry<String, String>> entries = new ArrayList<Map.Entry<String,String>>();
        entries.addAll(entry);
        System.out.println("entry 리스트 : " + entries);
        System.out.println("-------------------");

        Iterator<Map.Entry<String, String>> iterator = entry.iterator();
        while(iterator.hasNext()){
            Map.Entry<String, String> e = iterator.next();
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
        System.out.println("-------------------");

        Set<String> keySet = map.keySet();
        System.out.println("keySet>>>>" + keySet);

        System.out.println("-------------------");

        Collection<String> values = map.values();
        System.out.println("values >>>>" + values);

        System.out.println("-------------------");

        System.out.println("-------------------");



    }
}
