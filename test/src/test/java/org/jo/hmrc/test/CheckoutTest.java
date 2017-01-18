package org.jo.hmrc.test;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;

public class CheckoutTest {

    @Test
    public void checkoutCalculatesTotalCost() {
        Shop shop = new Shop();
        Basket basket = new Basket();
        Checkout checkout = new Checkout();
        basket.add(shop.getProduct(Shop.PRODUCT_ID_APPLE));
        basket.add(shop.getProduct(Shop.PRODUCT_ID_APPLE));
        basket.add(shop.getProduct(Shop.PRODUCT_ID_ORANGE));
        basket.add(shop.getProduct(Shop.PRODUCT_ID_APPLE));
        BigDecimal totalCost = checkout.calculateTotalCost(basket);
        Assert.assertEquals(new BigDecimal("2.05"), totalCost);
    }
}
