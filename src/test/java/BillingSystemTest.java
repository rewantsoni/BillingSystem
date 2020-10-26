import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BillingSystemTest {

    @Test
    public void testBillingSystem() {
        TaxCalculator indianTaxCalculator = new IndianTaxCalculator();
        TaxCalculator europeTaxCalculator = new EuropeTaxCalculator();

        BillingSystem indianBillingSystem = new BillingSystem(indianTaxCalculator);
        BillingSystem europeBillingSystem = new BillingSystem(europeTaxCalculator);
        Cart cart = new Cart();
        cart.add(new Item("apple", 50));
        cart.add(new Item("orange", 100));
        cart.add(new Item("orange", 100));

        String expectedIndianBill = "name:'apple', price: 50.0, quantity: 1\n" +
                "name:'orange', price: 100.0, quantity: 2\n" +
                "Total: 250.0\n" +
                "Tax: 50.0\n" +
                "Total+tax: 300.0\n";

        String expectedEuropeanBill = "name:'apple', price: 50.0, quantity: 1\n" +
                "name:'orange', price: 100.0, quantity: 2\n" +
                "Total: 250.0\n" +
                "Tax: 75.0\n" +
                "Total+tax: 325.0\n";

        assertEquals(expectedIndianBill, indianBillingSystem.generate(cart).generate());
        assertEquals(expectedEuropeanBill, europeBillingSystem.generate(cart).generate());
    }
}
