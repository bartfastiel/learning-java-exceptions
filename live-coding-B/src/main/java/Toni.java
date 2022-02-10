public class Toni {
    public String lieferePizza() {
        System.out.println("Toni: Ich fahre zu Bella");
        Bella bella = new Bella();
        String pizza;
        try {
            pizza = bella.backePizza();
        } catch (RuntimeException e) {
            pizza = "Pizza von Avanti";
        }
        System.out.println("Toni: Ich schneide die Pizza "+pizza+"von Bella in Stücke");
        return pizza;
    }
}
