package j17_스태틱.싱글톤;

public class ViewMain {

    public static void main(String[] args) {
        //ProductView product = new ProductView(); //생성자가 private라 오류뜸.
        ProductView productView = ProductView.getInstance();
        productView.showMainView();
        productView.showOrderView();

//        ProductView.getInstance().showMainView();
//        ProductView.getInstance().showOrderView();

    }
}
