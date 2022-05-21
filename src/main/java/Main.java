public class Main {
    public static void main(String[] args) throws InterruptedException {
        Box box = new Box();
        int tackt = 10;
        Thread threadJoke = new Thread(() -> {
            for (int i = 0; i < tackt; i++) {
                try {
                    Thread.sleep(1500);
                    if (box.isOpenBox()) {
                        box.setOpenBox(false);
                        box.statusBox();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }

        });
        threadJoke.start();
        Thread threadUser = new Thread(() -> {
            for (int i = 0; i < tackt; i++){
                try {
                    Thread.sleep(1000);
                    if (!box.isOpenBox()) {
                        box.setOpenBox(true);
                        box.statusBox();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        });

        threadUser.start();
        threadJoke.join();
        threadUser.join();
    }
}
