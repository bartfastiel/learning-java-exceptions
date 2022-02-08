class Toni {
    static String machPizza() {
        System.out.println("Toni: Ich belege die Pizza");
        String pizza = "Boden";
        String gebackenePizza = SuperOfen2000.backe(pizza);
        String fertigePizza = gebackenePizza + " im Karton";
        return fertigePizza;
    }
}
