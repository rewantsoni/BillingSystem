public class Bill {

    private final StringBuilder bill;

    Bill() {
        bill = new StringBuilder();
    }

    public String generate() {
        return bill.toString();
    }

    public void append(String item) {
        bill.append(item).append("\n");
    }
}
