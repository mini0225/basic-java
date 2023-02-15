package j17_스태틱.빌더;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class User2 {
    private String username;
    private String password;
    private String email;
    private String name;

    //User2에서 User 변환.
    public User to(){
        return User.builder()
                .username(username)
                .password(password)
                .email(email)
                .name(name)
                .build();
    }
}
