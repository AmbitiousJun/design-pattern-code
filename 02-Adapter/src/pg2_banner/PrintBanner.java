package pg2_banner;

/**
 * @author Ambitious
 * @date 2022/9/8 16:13
 */
public class PrintBanner extends Print{

    private final Banner banner;

    public PrintBanner(String string) {
        this.banner = new Banner(string);
    }

    @Override
    public void printWeek() {
        banner.showWithParen();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }
}
