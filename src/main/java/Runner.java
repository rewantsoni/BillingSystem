public class Runner {

    public static void main(String[] args) {
        Item apple = new Item("apple",50);
        Item orange = new Item("orange",100);
        Item potatoOne = new Item("potato",60);
        Item potatoTwo = new Item("potato",60);
        Item potatoOld = new Item("potato",30);

        Cart cart = new Cart();
        cart.add(apple);
        cart.add(apple);
        cart.add(orange);
        cart.add(potatoOld);
        cart.add(potatoOne);
        cart.add(potatoTwo);

        BillingSystem billingSystem = new BillingSystem(new IndianTaxCalculator());
        System.out.println(billingSystem.generate(cart).generate());
    }
}
