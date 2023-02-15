package j17_스태틱.빌더;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {
    private String username;
    private String password;
    private String email;
    private String name;

//   매개변수는 다르지만 자료형이 같기 떄문에 overloading이 안됨.
//   NoArgsConstructor 로 비우고 하나씩 일일이 Setter 해줘야함.
//    public User(String username){
//        this.username = username;
//    }
//
//    public User(String email){
//        this. email = email;
//    }

//    private User(UserBuilder userBuilder){ //User객체를 만들때 userBuilder를 받아 온다.
//        this.username = userBuilder.username;
//        this.password = userBuilder.password;
//        this.email = userBuilder.email;
//        this.name = userBuilder.name;
//
//    }

    public static class UserBuilder{ //User Class안에서 생성된 클래스이기 때문에 Uesr안에서만 사용가능.
        private String username;
        private String password;
        private String email;
        private String name;

        public UserBuilder username(String username){
            this.username = username;
            return this;
        }

        public UserBuilder password(String password){
            this.password = password;
            return this;
        }

        public UserBuilder email(String email){
            this.email = email;
            return this;
        }

        public UserBuilder name(String name){
            this.name = name;
            return this;
        }

        public User build(){
            return new User(username, password, email, name);
        }
    }

    public static UserBuilder builder(){
        return new UserBuilder();

    }

}
