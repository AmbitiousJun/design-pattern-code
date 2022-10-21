package pg1_display;

/**
 * 显示 字符 的实现类
 * @author ambitious
 * @date 2022/10/20
 */
public class CharDisplayImpl extends DisplayImpl{

    private final char start;
    private final char decorate;
    private final char end;

    public CharDisplayImpl(char start, char decorate, char end) {
        this.start = start;
        this.decorate = decorate;
        this.end = end;
    }

    @Override
    public void rawOpen() {
        System.out.print(start);
    }

    @Override
    public void rawPrint() {
        System.out.print(decorate);
    }

    @Override
    public void rawClose() {
        System.out.println(end);
    }
}
