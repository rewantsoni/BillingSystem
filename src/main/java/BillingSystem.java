import java.util.HashMap;
import java.util.Map;

public class BillingSystem {
    TaxCalculator taxCalculator;

    BillingSystem(TaxCalculator taxCalculator) {
        this.taxCalculator = taxCalculator;
    }

    public String generate(Cart cart) {
        Bill bill = new Bill();
        double total = 0.0;
        for (Map.Entry<Item, Integer> item : cart.getItems().entrySet()) {
            bill.append(item.getKey().toString() + ", quantity: " + item.getValue());
            total += item.getKey().getPrice() * item.getValue();
        }
        double tax = taxCalculator.calculateTax(total);
        bill.append("Total: " + total);
        bill.append("Tax: " + tax);
        bill.append("Total+tax: " + (tax + total));
        return bill.generate();
    }

}
