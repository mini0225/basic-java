package j17_스태틱.빌더;

public class UserMain {
    public static void main(String[] args) {
        //build 패턴
        User user = User.builder()
                .email("antcjswo@kakao.com")
                .username("경민")

                .build();

        System.out.println(user);

        User2 user2 = User2.builder()
                .name("창우")
                .build();

        System.out.println(user2);

        User u = user2.to();
        System.out.println(u); //null 값도 다같이 들고감.
    }

}
/*
 AllArgsConstructor 는 순서를 지켜서 넣어줘야하지만
 Builder는 위와같이 무작위로 넣으면 안들어 간 값은 null을 가진다.
 */