package j18_제네릭;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ResponseData <T>{ //T에 들어가는 변수에 따라 다름 : 제네릭

    private String message;
    private T data;

}
