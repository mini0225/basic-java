package j19_컬렉션;


import java.util.*;

public class UserMap {
    public static void main(String[] args) {
        Map<String, String> userMap = new HashMap<String, String>();

        userMap.put("username", "min");
        userMap.put("password", "1234");
        userMap.put("email", "abc@abc.com");
        userMap.put("name", "경민");

        Set<String> keySet = userMap.keySet();
        List<String> keyList = new ArrayList<String>();
        keyList.addAll(keySet);

        String keyName1 = keyList.get(0); //"username";
        String keyName2 = keyList.get(1); //"password";
        String keyName3 = keyList.get(2); //"email";
        String keyName4 = keyList.get(3); //"name";

        String value1 = userMap.get(keyName1); //"min";
        String value2 = userMap.get(keyName2); //"1234";
        String value3 = userMap.get(keyList.get(3));//"abc@abc.com";
        String value4 = userMap.get(keyName4); //"경민";

        System.out.println(keyName1 + ">>>>" + value1);
        System.out.println(keyName2 + ">>>>" + value2);
        System.out.println(keyName3 + ">>>>" + value3);
        System.out.println(keyName4 + ">>>>" + value4);


        }



}
