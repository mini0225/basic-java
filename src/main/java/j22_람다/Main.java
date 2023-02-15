package j22_람다;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/*
    자주쓰이는 람다 정리
 */
public class Main {
    public static void main(String[] args) {

        //Runnable : 매개변수 x , return x, 스레드에서 많이쓰임.
        Runnable runnable1 = () ->{ //return 이 없으니까 중괄호필수
            System.out.println("첫번째 프로그램을 실행합니다.");
        };
        Runnable runnable2 = () ->{ //return 이 없으니까 중괄호필수
            System.out.println("두번째 프로그램을 실행합니다.");
        };

        runnable1.run();
        runnable2.run();

//        Thread thread1 = new Thread(runnable1); 아래로 바로정의 가능
        Thread thread1 = new Thread(()->{
            for(int i = 0; i<100; i++){
                try {
                    Thread.sleep(100);
                    System.out.println("쓰레드1 : " + i);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread thread2 = new Thread(()->{
            for(int i = 0; i<100; i++){
                try {
                    Thread.sleep(100);
                    System.out.println("쓰레드2 : " + i);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

//        thread1.start();
//        thread2.start();
        //99까지 올라감. thread1,2 순서관계없이 올라감 => thread는 동시에 돌아감.
        System.out.println("--------------");
        //Supplier : get 메소드
        Supplier<String> supplier = ()-> "공급";
        System.out.println(supplier.get());
        System.out.println("--------------");

        //Consumer , 매개변수 한개일 때는 괄호도 생략가능 (name) -> name
        Consumer<String> consumer = (name) ->{
            System.out.println("이름 : " + name);
        };
        consumer.accept("경민");
        System.out.println("--------------");

        //function
        Function<Integer, String> function = age -> "나이 :" + age;
        System.out.println(function.apply(33));
        System.out.println("--------------");

        //Predicate
        Predicate<Integer> leapMonth = year
                -> year % 4 ==0 && year%100 !=0 || year %400 ==0;
        System.out.println(leapMonth.test(2000));

        //BiConsumer , BiFunction , BiPredicate 는 매개변수 2개

    }
}
