package pg1_banner;

/**
 * “实际情况” - 当前已经实现好了的状态，可以被适配
 * @author Ambitious
 * @date 2022/9/8 11:16
 */
public class Banner {

    private final String string;

    public Banner(String string) {
        this.string = string;
    }

    public void showWithParen() {
        System.out.println("(" + string + ")");
    }

    public void showWithAster() {
        System.out.println("*" + string + "*");
    }
}
