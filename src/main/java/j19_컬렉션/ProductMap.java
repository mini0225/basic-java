package j19_컬렉션;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.*;

@AllArgsConstructor
@Data
class ProductImg{
    private int imgCode;
    private String imgName;
}

public class ProductMap {
    public static void main(String[] args) {

        Map<String, Object> product = new HashMap<String, Object>();

        product.put("productCode", 1);
        product.put("productName", "스타벅스 텀블러");
        product.put("productColor", "Black");
        product.put("productSize", "Venti");

        List<ProductImg> productImgs = new ArrayList<ProductImg>();
        productImgs.add(new ProductImg(1,"starbucks_black_tumbler1.png"));
        productImgs.add(new ProductImg(2,"starbucks_black_tumbler2.png"));
        productImgs.add(new ProductImg(3,"starbucks_black_tumbler3.png"));
        productImgs.add(new ProductImg(4,"starbucks_black_tumbler4.png"));

        product.put("productImg", productImgs); //Map<String,Object> 에서 object 자리에 아무거나 다 올수 있음.
        System.out.println(product);
        System.out.println("------------");
        /*
            텀블러이미지1 : starbucks_black_tumbler1.png
            텀블러이미지2 : starbucks_black_tumbler2.png
            텀블러이미지3 : starbucks_black_tumbler3.png
            텀블러이미지4 : starbucks_black_tumbler4.png
         */


        List<ProductImg> productImgList = (List<ProductImg>)product.get("productImg");
        /*
        product.get("productImg") 로 List를 가지고옴.
        object 로 업캐스팅 되었기 떄문에 '다운캐스팅' 필요....
         */
        for(ProductImg img : productImgList){
            System.out.println("텀블러 이미지 "+ img.getImgCode() + ": " + img.getImgName());
        }

    }
}