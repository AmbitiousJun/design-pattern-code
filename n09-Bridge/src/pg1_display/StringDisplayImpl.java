package pg1_display;

import java.nio.charset.StandardCharsets;

/**
 * 实现二级层次，负责真正实现 “显示” 的逻辑
 * @author ambitious
 * @date 2022/10/17
 */
public class StringDisplayImpl extends DisplayImpl{

    private final String content;
    private final Integer width;

    public StringDisplayImpl(String content) {
        this.content = content;
        this.width = this.content.getBytes(StandardCharsets.UTF_8).length;
    }

    @Override
    public void rawOpen() {
        this.printLine();
    }

    @Override
    public void rawPrint() {
        System.out.println("|" + this.content + "|");
    }

    @Override
    public void rawClose() {
        this.printLine();
    }

    public void printLine() {
        System.out.print("+");
        for (int i = 0; i < this.width; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}
