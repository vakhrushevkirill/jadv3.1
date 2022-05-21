import java.util.concurrent.atomic.AtomicBoolean;

public class Box {
    private volatile boolean openBox = false;

    public boolean isOpenBox() {
        return openBox;
    }

    public void setOpenBox(boolean openBox) {
        this.openBox = openBox;
    }

    public void statusBox() throws InterruptedException {

        if (openBox == true){
            System.out.println("Закрыл коробку");
        }
        if (openBox == false) {
            System.out.println("Открыл коробку");
        }
    }
}
