package org.jo.hmrc.test;

import java.math.BigDecimal;

public class Product {

    private final Integer id;

    private final String name;

    private final BigDecimal price;

    public Product(Integer id, String name, BigDecimal price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }
}
