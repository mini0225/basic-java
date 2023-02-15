package j23_예외;

import lombok.Getter;

import java.util.Map;

public class CustomException extends RuntimeException{ //예외 클래스

    @Getter //외부로 갖고갈수있게
    private Map<String, String> errorMap;

    //alt + insert 생성자 생성
    //에러 메세지랑 errorMap 이 공존, errorMap 만 잡아줟됨.
    public CustomException(String message, Map<String, String> errorMap) {
        super(message);
        this.errorMap = errorMap;
    }
}
