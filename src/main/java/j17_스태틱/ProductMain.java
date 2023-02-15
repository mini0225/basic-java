package j17_스태틱;

/*
    시리얼넘버 자동 증가
    1. serialNumber = 20220001, productName = "스타벅스 텀블러1"
    2. serialNumber = 20220002, productName = "스타벅스 텀블러2"
    3. serialNumber = 20220003, productName = "스타벅스 텀블러3"
    4. serialNumber = 20220004, productName = "스타벅스 텀블러4"
    5. serialNumber = 20220005, productName = "스타벅스 텀블러5"

 */

import j08_메소드.Method1;
import lombok.Data;

@Data
public class ProductMain {
    private String name;

    public static void main(String[] args) {
//        Product[] products = new Product[5];
//
//        for(int i = 0; i < products.length; i++){
//            products[i] = new Product("스타벅스 텀블러" + (i+1));
//        }
//
//        for(int i = 0; i < products.length; i++){
//            System.out.println();
//            System.out.println(products[i]);
//        }

        int autoIncrement = Product.getAutoIncrement();
        System.out.println(autoIncrement);
        System.out.println();
        System.out.println(Product.autoIncrement);
        Product.autoIncrement++;
        System.out.println();
        System.out.println(Product.getAutoIncrement());
        System.out.println();

        Product p1 = new Product("p1");
        System.out.println(p1.getAutoIncrement());
        Product p2 = new Product("p1");
        System.out.println(p2.getAutoIncrement());
        Product p3 = new Product("p1");
        System.out.println(p3.getAutoIncrement());
        Product p4 = new Product("p1");
        System.out.println(p4.getAutoIncrement());
        Product p5 = new Product("p1");
        System.out.println(p5.getAutoIncrement());
        System.out.println();
        Product p6 = new Product("p5");
        System.out.println(p5.getAutoIncrement());
        System.out.println();
        System.out.println(Product.getAutoIncrement());

        //static을 걸어놨기 때문에 생성하지않고 사용가능
        //interface 가 아니어도 상관없지만 보통 interface 에서 사용
        System.out.println("------------------------------");
        System.out.println(PathRepository.PRODUCT_IMG_PATH);
        System.out.println(PathRepository.PROFILE_IMG_PATH);
        System.out.println(PathRepository.MAIN_IMG_PATH);


        System.out.println("------------------------------");
        Product.printInfo(); //메소드도 스태틱이면 생성없이 사용가능.

        ProductMain productMain = new ProductMain();
        productMain.setName("테스트");
        System.out.println(productMain.getName());
        Method1.main(new String[] {});
        Method1.call1();
    }
}
