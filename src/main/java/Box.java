import java.util.concurrent.atomic.AtomicBoolean;

public class Box {
    private volatile boolean openBox = false;
    private volatile boolean stopGame = false;
    public boolean isOpenBox() {
        return openBox;
    }

    public boolean endGame(){
        if (this.stopGame){
            return true;
        } else{
            return false;
        }
    }

    public boolean endGame(boolean stopGame){
        this.stopGame = stopGame;
        return stopGame;
    }

    public void setOpenBox(boolean openBox) {
        this.openBox = openBox;
    }

    public void closeOpenBox(){
        if (openBox){
            openBox = false;
            System.out.println("Закрыл коробку");
        }
    }

    public void openOpenBox(){
        if (!openBox){
            openBox = true;
            System.out.println("Открыл коробку");
        }
    }

    public void statusBox() throws InterruptedException {

        if (openBox){
            System.out.println("Закрыл коробку");
        }
        else {
            System.out.println("Открыл коробку");
        }
    }
}
