package j20_JSON;

/*
    json 은 속성-값 쌍을 이룬다, ex) "name":"경민","age":33 // Map ex)name=경민, age=33
    객체는 key와 value를 갖고있다. key - 변수명 , value - 값
    ajax를 위해 또는 xml을 대체하는 데이터포맷

    {
    "" : "",
    "" : "",
    "나이" : 33,
    "" : [배열],
    "" : { "" : "", "" : "", "" : ""}
    }json 안에 문자열, 배열, json 가능  // method 는 불가능

 */


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

public class JSON1 {
    public static void main(String[] args) {

        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("username", "min");
        jsonObject.addProperty("password", "1234");
        jsonObject.addProperty("email", "abc@abc.com");
        jsonObject.addProperty("name", "경민");
        jsonObject.addProperty("age", 33);

        System.out.println(jsonObject);
        System.out.println("----------------");

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(jsonObject);
        System.out.println(json);

    }
}
