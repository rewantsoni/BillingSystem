import java.util.HashMap;

public class Cart {
    private final HashMap<Item, Integer> items;

    Cart() {
        items = new HashMap<>();
    }

    public void add(Item item) {
        if (items.containsKey(item)) {
            items.put(item, items.get(item) + 1);
            return;
        }
        items.put(item, 1);
    }

    public HashMap<Item, Integer> getItems() {
        return items;
    }
}
