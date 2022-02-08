public class Schwarzmarkt {
    static void run() {
        otherMethod(-3);
    }

    private static void otherMethod(int positiveInteger) {
        if (positiveInteger < 1) {
            throw new IllegalArgumentException(positiveInteger + " is not a positive integer");
        }
    }
}
