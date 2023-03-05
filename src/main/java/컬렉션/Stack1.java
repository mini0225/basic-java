package 컬렉션;

import java.util.Stack;

public class Stack1 {
    public static void main(String[] args) {

        Stack<String> s = new Stack();

        //1. push : 데이터 삽입
        s.push("apple");
        s.push("banana");
        s.push("cherry");
        System.out.println(s);
        System.out.println();

        //2. pop : top 데이터 삭제, 후입선출
        System.out.println(s.pop());
        System.out.println(s);
        System.out.println();

        //3. Peek : top 데이터 보기
        System.out.println(s.peek());
        System.out.println(s);
        System.out.println();

        //4. search() : 데이터 위치 찾기, top 기준으로 top 이 1번
        System.out.println(s);
        System.out.println(s.search("apple"));
        System.out.println(s.search("banana"));

    }
}
