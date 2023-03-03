package 컬렉션;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Set {
    public static void main(String[] args) {

        HashSet hs = new HashSet(); //순서없음
        hs.add("demon");
        hs.add("banana");
        hs.add("tomato");
        hs.add("apple");
        hs.add("cargo");

        TreeSet ts = new TreeSet(); //알바벳순
        ts.add("demon");
        ts.add("banana");
        ts.add("tomato");
        ts.add("apple");
        ts.add("cargo");

        Iterator it1 = hs.iterator();
        System.out.println("<<HashSet 출력>>");
        while(it1.hasNext()) {
            System.out.print(" " + it1.next());
        }
        System.out.println();

        Iterator it2 = ts.iterator();
        System.out.println("<<TreeSet 출력>>");
        while(it2.hasNext()) {
            System.out.print(" " + it2.next());
        }

        System.out.println();
        System.out.println("현재 TreeSet의 크기 : "+ ts.size());
    }
}
