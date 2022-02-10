



public class Regina {

    public static void main(String[] args) {
        Regina regina = new Regina();
        regina.macheMittag();
    }
    public void macheMittag() {
        System.out.println("Regina: Ich habe Hunger!");
        Toni toni = new Toni();
        String pizza = toni.lieferePizza();
        System.out.println("Regina: Ich esse "+pizza);
    }
}
