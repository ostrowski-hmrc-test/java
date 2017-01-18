package org.jo.hmrc.test;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class Shop {

    public static final int PRODUCT_ID_APPLE = 1;

    public static final int PRODUCT_ID_ORANGE = 2;

    private final Map<Integer, Product> products = new HashMap<>();

    public Shop() {
        products.put(PRODUCT_ID_APPLE, new Product(PRODUCT_ID_APPLE, "Apple", new BigDecimal("0.60")));
        products.put(PRODUCT_ID_ORANGE, new Product(PRODUCT_ID_ORANGE, "Orange", new BigDecimal("0.25")));
    }

    public Product getProduct(final Integer productId) {
        return products.get(productId);
    }
}
