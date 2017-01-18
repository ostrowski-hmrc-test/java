package org.jo.hmrc.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Basket {

    private final List<Product> products = new ArrayList<>();

    public void add(Product product) {
        products.add(product);
    }

    public List<Product> getProducts() {
        return Collections.unmodifiableList(products);
    }
}
