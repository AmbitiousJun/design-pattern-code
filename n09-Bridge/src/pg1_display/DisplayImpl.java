package pg1_display;

/**
 * 实现层次，具体实现方法的功能
 * @author ambitious
 * @date 2022/10/17
 */
public abstract class DisplayImpl {

    /**
     * 显示起始部分
     */
    public abstract void rawOpen();

    /**
     * 显示核心部分
     */
    public abstract void rawPrint();

    /**
     * 显示结束部分
     */
    public abstract void rawClose();
}
