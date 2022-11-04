package Problems.Streams.ProblemSet001;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsProblem013 {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        //Adding Products
        products.add(new Product(1, "HP Laptop", 25000f));
        products.add(new Product(2, "Dell Laptop", 30000f));
        products.add(new Product(3, "Lenevo Laptop", 28000f));
        products.add(new Product(4, "Sony Laptop", 28000f));
        products.add(new Product(5, "Apple Laptop", 90000f));
        List<Float> prices = products.stream()
                .filter(p -> p.price < 30000)//filter
                .map(p -> p.price)//fetching price
                .collect(Collectors.toList());//collecting as a list
        System.out.println(prices);
    }

    static class Product {
        private Integer sno;
        private String productName;
        private float price;

        public Product(Integer sno, String productName, float price) {
            this.sno = sno;
            this.productName = productName;
            this.price = price;
        }
    }
}

