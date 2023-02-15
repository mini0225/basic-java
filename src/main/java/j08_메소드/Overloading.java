package j08_메소드;

/*
* Method OverLoading
* => 매개변수의 형태가 다르면 동일한 메소드 명을 가지더라도 정의할 수 있다.
*  ex) add() // add(10)
*
* */

public class Overloading {

    public static void add(){
        System.out.println("add()");
    }

    public static void add(int a){
        System.out.println("add(int a)");
    }

    public static void add(String s){
        System.out.println("add(String s)");
    }

    public static void add(int a, int b){
        System.out.println("add(int a, int b)");
    }

    public static void add(int a, String b){
        System.out.println("add(int a, String b)");
    }

    public static void add(String b, int a){
        System.out.println("add(String b, int a)");
    }



    public static void main(String[] args) {
        //메소드 overloading
        add();
        add(10);
        add("10");
        add(10,20);
        add(10,"20");
        add("10",20);
    }
}
