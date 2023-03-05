package 컬렉션;


/*
<전화 번호부 기능>
1. 고객 저장
2. 고객 검색
3. 전체 보기
4. 끝내기
 */

import java.util.*;
import java.util.HashMap;
import java.util.Scanner;

public class PhoneBookMain {
    static HashMap<String, String> hm =new HashMap<String, String>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice = 0;

        while(true){
            System.out.println("<<<<전화번호부>>>>");
            System.out.println("1. 고객 정보 저장");
            System.out.println("2. 고객 정보 검색");
            System.out.println("3. 고객 정보 출력");
            System.out.println("4. 끝내기");

            System.out.print("번호입력 : ");
            choice = sc.nextInt();

            if(choice ==1) {
                System.out.println("------------고객 정보 저장------------");
                insert();
            }
            else if(choice ==2){
                System.out.println("------------고객 정보 검색------------");
                search();
            }
            else if(choice ==3){
                System.out.println("------------고객 정보 출력------------");
                show();
            }
            else if(choice ==4){
                System.out.println("------------프로그램 종료------------");
                break;
            }
            else{
                System.out.println("잘못 입력 하셨습니다.");
            }
        }
    }
    public static void insert(){
        String name, phone = null;
        System.out.print("저장할 고객의 이름을 입력하세요 : ");
        name = sc.next();

        //name 이 key 이므로 중복허용불가!
        if(hm.containsKey(name)){
            System.out.println("이미 존재하는 이름입니다.");
            return;
        }else{
            System.out.print("저장할 고객의 번호 : ");
            phone = sc.next();
            hm.put(name, phone);
            System.out.println("저장 완료.");
        }
    }
    public static void search(){
        String searchName =null;
        System.out.print("검색할 이름 : ");
        searchName = sc.next();
        //searchName이 hm 에 존재해야 검색가능

        if(hm.containsKey(searchName)){
            System.out.println("검색 완료");
            System.out.println(searchName +"의 전화번호 : " + hm.get(searchName));
        }else {
            System.out.println("존재하지 않는 이름입니다.");
        }
    }
    public static void show(){
//        Set<String> keySet = hm.keySet();
//        Iterator<String> i = keySet.iterator();
        Iterator<String> i = hm.keySet().iterator();
        while(i.hasNext()){
            String curName = (String)i.next();
            System.out.println("name : "+curName+", phone : "+hm.get(curName));
        }

    }
}
