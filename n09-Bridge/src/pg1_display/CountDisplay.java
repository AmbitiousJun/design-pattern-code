package pg1_display;

/**
 * 功能二级层次，可以打印多次的显示类
 * @author ambitious
 * @date 2022/10/17
 */
public class CountDisplay extends Display {

    public CountDisplay(DisplayImpl display) {
        super(display);
    }

    public void multiDisplay(int times) {
        super.open();
        while (times-- > 0) {
            super.print();
        }
        super.close();
    }
}
