package pg1_display;

/**
 * 功能层次，负责 “显示” 某些东西
 * @author ambitious
 * @date 2022/10/17
 */
public class Display {

    private final DisplayImpl display;

    public Display(DisplayImpl display) {
        this.display = display;
    }

    public void open() {
        display.rawOpen();
    }

    public void print() {
        display.rawPrint();
    }

    public void close() {
        display.rawClose();
    }

    public void display() {
        this.open();
        this.print();
        this.close();
    }
}
