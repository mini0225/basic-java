package j17_스태틱;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

//@AllArgsConstructor
@Data

public class Product {
    public static int autoIncrement = 20220000;
    /*
    static 변수 일때는 증가가 일어나지만 일반상수변수일때는 증가가 일어나지 않는다.
    static이 붙으면 ++이 일어남, 증가된 값이 유지가 되어 ++이 일어나 점점 증가하게 된다.
    =>static은 공유 영역이다. 메모리 주소가 동일하다.

     */
    private int serialNumber;
    private String productName;

    public Product(String productName) {
        serialNumber = ++autoIncrement;
        this.productName = productName;
    }

    public static int getAutoIncrement(){
        return autoIncrement;
    }

    public static void printInfo(){
        //System.out.println(productName); 맴버변수는 스태틱 메소드에서 사용할수 없음.
        //멤버변수란 클래스 밖에서 설정된 변수
        /*
        생성이 안되어도 사용가능한(static)이 생성이되지않으면 사용못하는 애를 변수로 쓰려니까 오류 발생
        productName - 스태틱 메소드 안에서는 스태틱 변수만 사용가능.
                      non static field, 현재 메모리 할당이 된것이아니라
                      생성이 되어야 메모리 할당이됨.
         */
        //멤버 변수 자기자신을 생성하여 사용가능
        Product product = new Product("product");
        System.out.println(product.productName);

        System.out.println(autoIncrement);
    }

}
