package pg1_display;

import java.util.Random;

/**
 * 可以打印若干次用户传递的字符串
 * @author ambitious
 * @date 2022/10/18
 */
public class RandomDisplay extends Display{

    private final Random random;

    public RandomDisplay(DisplayImpl display) {
        super(display);
        random = new Random();
    }

    public void randomDisplay(int times) {
        int t = random.nextInt(times);
        super.open();
        while (t-- > 0) {
            super.print();
        }
        super.close();
    }
}
