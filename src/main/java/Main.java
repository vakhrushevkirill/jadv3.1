public class Main {
    public static void main(String[] args) throws InterruptedException {
        Box box = new Box();
        int tackt = 10;
        int timeout = 1000;
        Thread threadJoke = new Thread(() -> {
            while (!box.endGame()){
                box.closeOpenBox();
            }

        });
        threadJoke.start();
        Thread threadUser = new Thread(() -> {
            for (int i = 0; i < tackt; i++){
                try {
                    Thread.sleep(timeout);
                    box.openOpenBox();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            box.endGame(true);
        });

        threadUser.start();
        threadJoke.join();
        threadUser.join();
    }
}
