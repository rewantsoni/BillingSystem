import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaxCalculatorTest {

    @Test
    public void testIndianTaxCalculator() {
        TaxCalculator taxCalculator = new IndianTaxCalculator();
        double total = 50;

        assertEquals(total * 0.2, taxCalculator.calculateTax(total));
    }


    @Test
    public void testEuropeTaxCalculator() {
        TaxCalculator taxCalculator = new EuropeTaxCalculator();
        double total = 50;

        assertEquals(total * 0.3, taxCalculator.calculateTax(total));
    }
}
