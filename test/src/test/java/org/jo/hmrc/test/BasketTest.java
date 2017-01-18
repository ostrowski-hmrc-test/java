package org.jo.hmrc.test;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class BasketTest {

    @Test
    public void maintainsProducts() {
        Shop shop = new Shop();
        Basket basket = new Basket();
        Assert.assertNotNull(basket.getProducts());
        Assert.assertEquals(0, basket.getProducts().size());
        basket.add(shop.getProduct(Shop.PRODUCT_ID_APPLE));
        basket.add(shop.getProduct(Shop.PRODUCT_ID_ORANGE));
        List<Product> products = basket.getProducts();
        Assert.assertTrue(products.contains(shop.getProduct(Shop.PRODUCT_ID_APPLE)));
        Assert.assertTrue(products.contains(shop.getProduct(Shop.PRODUCT_ID_ORANGE)));
    }
}
