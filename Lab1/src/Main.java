import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Basket basket1 = new Basket();
        Product product1 = new Product("paper", 34, new Date(3,2,2022) ,new Date(3,2,2040) );
        Product product2 = new Product("pencils", 24, new Date(23,5,2022) ,new Date(23,5,2050) );
        basket1.addProduct(product1);
        basket1.addProduct(product2);
        basket1.showProducts();
        basket1.removeProduct(product1);
        basket1.showProducts();


        Product product3 = new Product("mousepad", 10, new Date(24,1,2022) ,new Date(24,1,2030) );
        Product product4 = new Product("airpods", 300, new Date(17,4,2022) ,new Date(17,4,2070) );
        List<Product> list1 = new ArrayList<>();
        list1.add(product3);
        list1.add(product4);
        list1.add(product1);
        Basket basket2 = new Basket(list1);
        basket2.showProducts();
    }
}
