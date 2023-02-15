package j19_컬렉션;


import java.util.*;

public class StringSet {
    public static void main(String[] args) {

        Set<String> strSet = new HashSet<String>();
        List<String> strList = new ArrayList<String>();

        //값추가
        strList.add("경민");
        strList.add("창우");
        strList.add("혜민");
        strList.add("시영");
        strList.add("민영");
        strList.add("김경민");

        strSet.add("김경민");
        strSet.add("박창우");
        strSet.add("정혜민");
        strSet.add("김시영");
        strSet.add("김민영");

        System.out.println(strSet); //Hash자료구조를 따라서 순서없이 들어감.
        System.out.println((strList)); //List라서 순서있음
        System.out.println("-----------");
        strSet.addAll(strList); //set으로 넣는순간 Hash의 자료구조를 따라서 순서 흐트러짐.
        System.out.println(strSet);//set 중복허용x, List안의 중복을 제거할때 사용

        //값 조회
//        strSet.get(); => get은 인덱스로 값을 조회하는데 set에서는 인덱스(순서)가 없다.
        String searchName = "김경민";

        /*
            strSet에서 searchName이 있으면 true 없으면 false
         */
        boolean isTrue = false;
        for(String name : strSet){
            if(name.equals(searchName)){
                isTrue = true;
                break;
            }
        }
        System.out.println(isTrue);

        /* 값 수정
          김경민 -> 남강석
         */
        //set은 수정이 아니라 지우고 추가하는것 밖에 안됨.

        searchName = "김경민";
        for(String name : strSet){
            if(name.equals(searchName)){
                strSet.remove(searchName);
                strSet.add("남강석");
                break;
            }
        }
        System.out.println(strSet);

        System.out.println(strSet.contains("남강석")); // 포함하고있는지???? true or false
//        boolean isTrue = false;
//        for(String name : strSet){
//            if(name.equals(searchName)){
//                isTrue = true;
//                break;
//            }
//        }
        System.out.println("-----------");
        searchName = "남강석";
        if(strSet.contains(searchName)){
            strSet.remove(searchName);
            strSet.add("김개미");

        }
        System.out.println(strSet);

    }
}
