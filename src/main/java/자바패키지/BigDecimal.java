package 자바패키지;

//BigDecimal - 정확한 소수점 연산시
public class BigDecimal {
    public static void main(String[] args) {
        double a = 24.3953;
        double b = 50.343998;
        System.out.println(a+b);
        System.out.println("------------------------------");

        java.math.BigDecimal number1 = new java.math.BigDecimal(String.valueOf(a));
        java.math.BigDecimal number2 = new java.math.BigDecimal(String.valueOf(b));
        System.out.println(number1.add(number2));


    }
}
