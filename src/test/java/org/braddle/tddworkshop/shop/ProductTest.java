package org.braddle.tddworkshop.shop;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ProductTest {

    @Test
    public void testGetters() {
        Product product = new Product("123456", "A Thing", 199);

        assertEquals("123456", product.getEan());
        assertEquals("A Thing", product.getName());
        assertEquals(199, product.getPrice());
    }
}
