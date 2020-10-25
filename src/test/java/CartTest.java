import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CartTest {

    @Test
    public void testAddToCartSuccess() {
        Item apple = new Item("apple", 50);
        Item orange = new Item("orange", 100);

        Cart cart = new Cart();
        HashMap<Item, Integer> expected = new HashMap<>();
        cart.add(apple);
        cart.add(orange);
        expected.put(apple, 1);
        expected.put(orange, 1);
        assertEquals(expected, cart.getItems());
    }

    @Test
    public void testDuplicateItem() {
        Item apple = new Item("apple", 50);

        Cart cart = new Cart();
        HashMap<Item, Integer> expected = new HashMap<>();
        cart.add(apple);
        cart.add(apple);
        expected.put(apple, 2);
        assertEquals(expected, cart.getItems());
    }


}
