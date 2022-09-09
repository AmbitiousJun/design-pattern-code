package pg1_display;

/**
 * 模板方法类，定义模板抽象方法，制定算法流程
 * @author Ambitious
 * @date 2022/9/9 17:04
 */
public abstract class AbstractDisplay {

    /**
     * 打印起始字符
     */
    public abstract void open();

    /**
     * 打印核心字符（串）
     */
    public abstract void print();

    /**
     * 打印结束字符
     */
    public abstract void close();

    /**
     * 打印指定次数的核心字符（串）
     * @param printNum 打印次数
     */
    public final void display(int printNum) {
        open();
        for (int i = 0; i < printNum; i++) {
            print();
        }
        close();
    }
}
