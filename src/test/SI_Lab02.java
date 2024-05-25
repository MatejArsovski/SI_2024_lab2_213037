import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {

    @Test
    void checkCartWithNullItems() {
        List<Item> items = null;
        assertThrows(RuntimeException.class, () -> SILab2.checkCart(items, 100));
    }

    @Test
    void barcodeIsEmptyString() {
        List<Item> items = Collections.singletonList(new Item("Product1", "", 10, 0));
        assertFalse(SILab2.checkCart(items, 10), "Expected false because the barcode length is zero.");
    }

    @Test
    void barcodeBeginsWithZero() {
        List<Item> items = Collections.singletonList(new Item("Product1", "00123456789", 200, 0.1f));
        assertTrue(SILab2.checkCart(items, 230), "Expected true because the barcode starts with zero and there's a discount.");
    }

    @Test
    void itemNameIsNull() {
        List<Item> items = Collections.singletonList(new Item(null, "1234567890", 300, 0.2f));
        assertTrue(SILab2.checkCart(items, 360), "Expected true because the name is null, but other conditions are met.");
    }

    @Test
    void priceExceeds300WithDiscount() {
        List<Item> items = Collections.singletonList(new Item("Product1", "1234567890", 350, 0.2f));
        assertTrue(SILab2.checkCart(items, 380), "Expected true because the price is over 300 and there's a discount.");
    }
}
