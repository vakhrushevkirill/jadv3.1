public class Main {
    public static void main(String[] args) throws InterruptedException {
        Box box = new Box();
        Thread threadJoke = new Thread(() -> {
            try {
                box.closeBox();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        threadJoke.start();
        Thread threadUser = new Thread(() -> {
            try {
                box.closeBox();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        threadUser.start();
        threadJoke.join();
        threadUser.join();
    }
}
