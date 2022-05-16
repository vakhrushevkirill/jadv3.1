import java.util.concurrent.atomic.AtomicBoolean;

public class Box {
    private AtomicBoolean openBox = new AtomicBoolean(false);

    public void closeBox() throws InterruptedException {
        for (int i = 0; i < 10; i++){
            Thread.sleep(1000);
            if (openBox.get() == true){
                openBox.set(false);
                System.out.println("Закрыл коробку");
            }
            if (openBox.get() == false) {
                System.out.println("Открыл коробку");
                openBox.set(true);
            }
            Thread.sleep(1000);
        }
    }
}
