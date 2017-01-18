package org.jo.hmrc.test;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class ShopTest {

    private Shop shop = new Shop();

    @Test
    public void stocksApplesAndOranges() {
        // skipping testing prices and names for brevity
        assertNotNull(shop.getProduct(Shop.PRODUCT_ID_APPLE));
        assertNotNull(shop.getProduct(Shop.PRODUCT_ID_ORANGE));
    }
}
