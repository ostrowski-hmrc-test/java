package org.jo.hmrc.test;

import java.math.BigDecimal;

public class Checkout {

    public BigDecimal calculateTotalCost(Basket basket) {
        // would be more maintainable with Map<productId, State>, but with int[] is shorter
        int[] offersState = { 0, 0 };
        return basket.getProducts().stream().
                map(product -> {
                    switch (product.getId()) {
                        case Shop.PRODUCT_ID_APPLE:
                            if (++offersState[0] == 2) {
                                offersState[0] = 0;
                                return BigDecimal.ZERO;
                            }
                            break;
                        case Shop.PRODUCT_ID_ORANGE:
                            if (++offersState[1] == 3) {
                                offersState[1] = 0;
                                return BigDecimal.ZERO;
                            }
                    }
                    System.out.println("adding" + product.getPrice());
                    return product.getPrice();
                }).
                reduce(BigDecimal.ZERO, BigDecimal::add);
    }
}
