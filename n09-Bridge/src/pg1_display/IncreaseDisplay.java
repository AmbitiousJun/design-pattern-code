package pg1_display;

/**
 * 多次 “显示” 字符串，并且每次显示时，核心字符串的显示次数会递增
 * @author ambitious
 * @date 2022/10/20
 */
public class IncreaseDisplay extends CountDisplay {

    /**
     * 每次增加显示核心字符串的个数
     */
    private final int step;

    public IncreaseDisplay(DisplayImpl display, int step) {
        super(display);
        this.step = step;
    }

    public void increaseDisplay(int level) {
        int count = 0;
        for (int i = 0; i < level; i++) {
            multiDisplay(count);
            count += step;
        }
    }
}
