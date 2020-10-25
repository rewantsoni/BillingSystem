import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class itemTest {
    @Test
    public void ItemTest() {
        Item apple = new Item("apple", 50);
        Item appleNew = new Item("apple", 50);
        assertTrue(apple.equals(apple));
        assertTrue(apple.equals(appleNew));
        assertEquals("name:'apple', price: 50.0", apple.toString());
        assertEquals(50.0,apple.getPrice());
    }
}
