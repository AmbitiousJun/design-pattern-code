package pg1_banner;

/**
 * 具体的适配器，用于适配 “实际情况”（Banner），使得 Print 接口能正常运作
 * @author Ambitious
 * @date 2022/9/8 11:18
 */
public class PrintBanner extends Banner implements Print {

    public PrintBanner(String string) {
        super(string);
    }

    @Override
    public void printWeek() {
        super.showWithParen();
    }

    @Override
    public void printStrong() {
        super.showWithAster();
    }
}
