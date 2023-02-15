package j20_JSON;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@AllArgsConstructor
@Data
class User {
    private String username;
    private String password;
    private String email;
    private String name;
}
// ↑ 보통은 따로 만듦.

public class JSON2 {
    public static void main(String[] args) {

        /*
            Gson 으로 변환 할 수 있는 객체의 종류
            JsonObject, Object, Map
         */

        //Object(객체) -> JSON 변화
        //두개 같은말
        Gson gsonBuilder = new GsonBuilder().setPrettyPrinting().create();
        Gson gson = new Gson();

        String userJson = null;
        String studentJson = null;
        String productJson = null;

        User user = new User("min",
                        "1234",
                        "abc@abc.com",
                        "경민");

        System.out.println(gsonBuilder.toJson(user));
        System.out.println(gson.toJson(user));
        userJson = gsonBuilder.toJson(user);
        System.out.println("---------------");

        //JsonObject -> JSON
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("studentCode", "20220001");
        jsonObject.addProperty("studentName", "김경민");
        jsonObject.addProperty("studentYear", "2");

        System.out.println(gsonBuilder.toJson(jsonObject));
        studentJson = gsonBuilder.toJson(jsonObject);
        System.out.println("---------------");

        //Map -> JSON
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("productCode","P-20220001");
        map.put("productName","삼성노트북");
        System.out.println(gsonBuilder.toJson(map));
        productJson = gsonBuilder.toJson(map);
        System.out.println("---------------");

        //JSON -> Map
        Map<String, Object> jsonData = convertJsonToMap(userJson);
        System.out.println(jsonData);

        jsonData = convertJsonToMap(studentJson);
        System.out.println(jsonData);

        jsonData = convertJsonToMap(productJson);
        System.out.println(jsonData);
        System.out.println("---------------");

        //JSON -> JsonObject
        JsonObject jsonObj = convertJsonToJsonObject(userJson);
        System.out.println(jsonObj);

        jsonObj = convertJsonToJsonObject(studentJson);
        System.out.println(jsonObj);

        jsonObj = convertJsonToJsonObject(productJson);
        System.out.println(jsonObj);
        System.out.println("---------------");

        //JSON -> User
        User userObj = convertJsonToUser(userJson);
        System.out.println(userObj);
    }

    public static Map convertJsonToMap(String json){
        Gson gson = new Gson();
        return gson.fromJson(json, Map.class);
    }

    public static JsonObject convertJsonToJsonObject(String json){
        Gson gson = new Gson();
        return gson.fromJson(json, JsonObject.class);
    }

    public static User convertJsonToUser(String json){
        Gson gson = new Gson();
        return gson.fromJson(json, User.class);
    }

}
