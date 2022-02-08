public class Morgenstund {
    static void run() {
        var thread = new Thread(() -> {
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new RuntimeException("Someone interrupted us", e);
            }
        });
        thread.start();
        thread.interrupt();
    }
}
