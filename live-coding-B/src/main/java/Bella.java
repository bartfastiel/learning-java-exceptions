public class Bella {
    public String backePizza() {
        System.out.println("Bella: Ich belege die Pizza");
        String pizza = backePizzaImOfen("Regina");
        System.out.println("Bella: Ich hole die Pizza.");
        return pizza;
    }

    private String backePizzaImOfen(String pizza) {
        throw new RuntimeException("Funken, Rauch, Stromausfall");
    }
}
