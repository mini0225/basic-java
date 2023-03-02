package 문자열클래스;

//StringTokenizer

import java.util.StringTokenizer;

public class StringEx3 {
    public static void main(String[] args) {
        String str = "min : 010-8968-3970";
        String delim = ":";
        StringTokenizer st = new StringTokenizer(str, delim);
        //nextToken : 구문문자열 기준으로 token을 차례대로 들고옴.
        //countTokens : 가져올 수 있는 token 갯수
        //hasMoreTokens : 가져올 token 유무 확인
        System.out.println(st.countTokens());
        System.out.println(st.nextToken());
        System.out.println(st.hasMoreTokens());

        System.out.println(st.countTokens());
        System.out.println(st.nextToken());
        System.out.println(st.countTokens());
        System.out.println(st.hasMoreTokens());

    }
}
