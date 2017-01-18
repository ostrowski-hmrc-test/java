package org.jo.hmrc.test;

import java.math.BigDecimal;

public class Checkout {

    public BigDecimal calculateTotalCost(Basket basket) {
        return basket.getProducts().stream().
                map(Product::getPrice).
                reduce(BigDecimal.ZERO, BigDecimal::add);
    }
}
