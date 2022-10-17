package pg1_htmllist.factory;

/**
 * @author ambitious
 * @date 2022/10/17
 */
@SuppressWarnings("all")
public abstract class Item {

    /**
     * 项目标题
     */
    protected final String caption;

    public Item(String caption) {
        this.caption = caption;
    }

    /**
     * 将项目转换成 HTML 代码，具体实现由子类决定
     * @return 转换完成的 HTML 代码
     */
    public abstract String makeHTML();
}