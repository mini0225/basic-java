package j16_Bean;


import java.util.Objects;

//정보를 담는 객체를 Entity Class 라고 한다.

/*  <<<<<기본구성>>>>>
    멤버 변수 선언
    생성자 정의
    Getter and Setter 정의
    Equals and HashCode 정의
    toString 정의

    변수명이 바뀌면 밑에 다 바꿔줘야 하지만 Lombok 을 사용해 Annotation을 걸어줌으로써
    번거로움이 사라진다.
 */
public class UserEntity {

    private String username;
    private String password;
    private String email;
    private String name;

    //생성자는 기본생성자와 전체 생성자 같이 적어준다.

    //기본생성자
    public UserEntity(){}

    //전체생성자
    public UserEntity(String username, String password, String email, String name) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserEntity that = (UserEntity) o;
        return Objects.equals(username, that.username) && Objects.equals(password, that.password) && Objects.equals(email, that.email) && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, password, email, name);
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
