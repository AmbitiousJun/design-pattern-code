package pg1_display;

/**
 * 打印单个字符
 * @author Ambitious
 * @date 2022/9/9 17:08
 */
public class CharDisplay extends AbstractDisplay {

    private final char c;

    public CharDisplay(char c) {
        this.c = c;
    }

    @Override
    public void open() {
        System.out.print("<<");
    }

    @Override
    public void print() {
        System.out.print(c);
    }

    @Override
    public void close() {
        System.out.println(">>");
    }
}
