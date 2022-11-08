package exception.practice;

import java.util.Arrays;

public class ProductMain {
    public static void main(String[] args) {
        Product product1 = new Product("Milk", 7,1);
        Product product2 = new Product("Coffee", 10,2);

        Order order1 = new Order();
        order1.addProduct(product1);
        order1.addProduct(product2);

        System.out.println(order1);

        try {
            Product product4 = order1.searchProductById(5);
            System.out.println(product4);
        } catch (ProductNotFoundException e) {
            //throw new RuntimeException(e);
            e.printStackTrace();
        }

        System.out.println(order1.removeProductById(19));
        System.out.println(order1);
    }
}
