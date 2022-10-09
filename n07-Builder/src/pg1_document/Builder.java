package pg1_document;

/**
 * @author ambitious
 * @description 抽象 Builder，定义编写文档的方法
 * @date 2022/10/7 上午10:34
 */
public abstract class Builder {

    /**
     * 编写文档的标题
     * @param title 文档标题
     */
    public abstract void makeTitle(String title);

    /**
     * 编写文档正文
     * @param str 一行文本
     */
    public abstract void makeString(String str);

    /**
     * 编写文档条目
     * @param items 所有的条目
     */
    public abstract void makeItems(String[] items);

    /**
     * 关闭文档编写
     */
    public abstract void close();
}
