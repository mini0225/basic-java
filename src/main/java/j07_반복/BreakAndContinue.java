package j07_반복;

public class BreakAndContinue {
    public static void main(String[] args) {

        int i = 0 ;

        while(true){ // while 에 true면 무한 반복, 밑의 if 에서 i>9 만 확인해서 break할지 go 할지 결정.
            if( i >9 ) {
                break;
            }
            System.out.println(i);
            i++;
        }

        for (int j = 0; j<10; j++){

            if (j ==7 ){
                System.out.println("7을 만났습니다.");
                break;
            }
            System.out.println(j);

        }
        System.out.println("<<<<<<<<<<<<<Continue>>>>>>>>>>>>>>");

        for(int j= 0 ; j<100 ; j++) {
            if(j %5 != 0 || j==0 ){ //5로 나눳을때
                continue; //밑으로 가서 출력이 아니라 for문으로 가서 다음 반복을 실행하라....
            }//5의배수가 나오면 break(?) 니까 밑으로 가서 출력해라.
            System.out.println(j);

        }

    }
}
