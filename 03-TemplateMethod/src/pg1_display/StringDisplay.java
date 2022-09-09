package pg1_display;

import java.nio.charset.StandardCharsets;

/**
 * 打印字符串
 * @author Ambitious
 * @date 2022/9/9 17:09
 */
public class StringDisplay extends AbstractDisplay {

    /**
     * 要打印的核心字符串
     */
    private final String string;

    /**
     * 字符串的长度（按字节数计算）
     */
    private final int length;

    public StringDisplay(String string) {
        this.string = string;
        this.length = string.getBytes().length;
    }

    @Override
    public void open() {
        this.printLine();
    }

    @Override
    public void print() {
        System.out.println("|" + string + "|");
    }

    @Override
    public void close() {
        this.printLine();
    }

    /**
     * 打印横向的分割线
     */
    private void printLine() {
        System.out.print("+");
        for (int i = 0; i < length; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}
