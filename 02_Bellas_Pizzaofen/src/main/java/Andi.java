class Andi {
    static String lieferPizza() {
        System.out.println("Andi: Ich fahre zu Toni");
        String pizza = Bella.machPizza();
        System.out.println("Andi: Ich schneide die Pizza");
        return pizza;
    }
}
