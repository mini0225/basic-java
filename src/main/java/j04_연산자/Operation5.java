package j04_연산자;

/**
 *  다항연산자
 *  00000 ? 000: 111  -> 00000참이면 000 거짓이면 111
 */


public class Operation5 {
    public static void main(String[] args) {

        int totalCount = 202;
        int maxPage = totalCount % 10 == 0 ? totalCount / 10 : totalCount / 10 + 1;  // 마지막 page 번호



        int page = 202;  //1~5 6~10 11~15 ...


        int startIndex = page % 5 == 0 ? page - 4 : page - (page % 5)+1;
        int endIndex = startIndex +4 <= page ? startIndex +4 : page ;

        System.out.println("page : " + page);
        System.out.println("startIndex:" + startIndex);
        System.out.println("endIndex:" + endIndex);
        System.out.println("maxPage :" + maxPage);


        String isMaxPageStr = page == endIndex ? "마지막 인덱스 입니다."  : "마지막 인덱스가 아닙니다." ;
        System.out.println(isMaxPageStr);

    }


}
