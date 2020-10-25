import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BillTest {

    @Test
    public void billTest() {
        Bill bill = new Bill();
        bill.append("apple 50");
        bill.append("orange 50");
        assertEquals("apple 50\norange 50\n", bill.generate());
    }
}
