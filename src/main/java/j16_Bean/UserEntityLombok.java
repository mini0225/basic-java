package j16_Bean;


import lombok.*;

import java.util.Objects;

//정보를 담는 객체를 Entity Class 라고 한다.
// @NoArgsConstructor, @AllArgsConstructor, @Data 기본 Annotation

/*  <<<<<기본구성>>>>>
    멤버 변수 선언
    생성자 정의 - 기본(NoArgsConstructor), 전체(AllArgsConstruct)
    Getter and Setter 정의 - Getter , Setter
    Equals and HashCode 정의 - Equals and HashCode
    toString 정의 - ToString
    => Data : Getter, Setter, Equals, HashCode, ToString 합친거

 */

@NoArgsConstructor
@AllArgsConstructor
//@Getter
//@Setter
//@EqualsAndHashCode
//@ToString
@Data
public class UserEntityLombok {

    private String username;
    private String password;
    private String email;
    private String name;

}
