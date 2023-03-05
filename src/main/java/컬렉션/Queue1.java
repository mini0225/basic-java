package 컬렉션;

//Queue - FIFO 선입선출

import java.util.LinkedList;
import java.util.Queue;

public class Queue1 {
    public static void main(String[] args) {

        Queue<String> q = new LinkedList<>();

        //1. add
        q.add("apple");
        q.add("banana");
        q.add("cherry");
        q.add("tomato");
        System.out.println(q);
        System.out.println();

        //2.E element :프론트에 위치한 data 를 반환한다.
        System.out.println("element : " + q.element());
        System.out.println();

        //3.remove : front 값을 반환하고 삭제한다.
        System.out.println("remove : " + q.remove());
        System.out.println(q);
        System.out.println();

        //4.offer(e) : 추가를 하면 제일 뒤로 붙는다.
        q.offer("peach");
        System.out.println("offer : " + q);
        System.out.println(q);
        System.out.println();

        //5.peek() : front 값을 반환하지만 삭제는 하지 않는다.
        System.out.println("peek : " +q.peek());
        System.out.println(q);
        System.out.println(

        );
        //6.poll() : front 값을 반환하고 삭제 한다.
        System.out.println("poll : " + q.poll());
        System.out.println(q);

    }
}
