package class1.ex;

import java.util.ArrayList;
import java.util.List;

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder productOrder1;
        ProductOrder productOrder2;
        productOrder1 = new ProductOrder("피규어",89000,2);
        productOrder2 = new ProductOrder("아크릴 스탠드", 30000, 9);
        List<ProductOrder> productOrderList = new ArrayList<>();
        productOrderList.add(productOrder1);
        productOrderList.add(productOrder2);
        int[] totalPrices = new int[2];
//
//        System.out.println("상품명\u0009가격\u0009수량\u0009총");
//        System.out.print(productOrder1.getProductName() + "\u0009"
//                + productOrder1.getPrice() + "\u0009"
//                + productOrder1.getQuantity() + "\u0009");
//        totalPrices[0] = productOrder1.getPrice() * productOrder1.getQuantity();
//        System.out.println(totalPrices[0]);
//
//        System.out.print(productOrder2.getProductName() + "\u0009"
//                + productOrder2.getPrice() + "\u0009"
//                + productOrder2.getQuantity() + "\u0009");
//        totalPrices[1] = productOrder2.getPrice() * productOrder2.getQuantity();
//        System.out.println(totalPrices[1]);
//
        for (int i=0; i<2; i++) {
            System.out.print(productOrderList.get(i).getProductName() + "\u0009"
                    + productOrderList.get(i).getPrice() + "\u0009"
                    + productOrderList.get(i).getQuantity() + "\u0009");
            totalPrices[i] = productOrderList.get(i).getPrice() * productOrderList.get(i).getQuantity();
            System.out.println(totalPrices[i]);
        }

        System.out.println("\u0009\u0009\u0009\u0009" + (totalPrices[0]+totalPrices[1]) );

    }
}
