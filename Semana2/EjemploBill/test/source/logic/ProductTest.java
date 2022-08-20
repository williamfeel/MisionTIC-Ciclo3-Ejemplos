package logic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    @Test
    void getIVA() {
        Product jabon = new Product("2342", "Jabon Rey", 2500, 300, (byte)5, TypeProduct.VIVERES);
        assertEquals(300, jabon.getIVA());
    }
}