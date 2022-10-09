package pg3_document2;

/**
 * @author ambitious
 * @description 抽象 Builder，定义编写文档的方法
 * @date 2022/10/7 上午10:34
 */
public abstract class Builder {

    /**
     * 编写文档的时候必须要先调用一次 makeTitle 方法
     * 使用该布尔属性进行控制
     */
    private Boolean initialized = Boolean.FALSE;

    public void makeTitle(String title) {
        if (initialized) {
            return;
        }
        buildTitle(title);
        initialized = Boolean.TRUE;
    }

    public void makeString(String str) {
        if (!initialized) {
            return;
        }
        buildString(str);
    }

    public void makeItems(String[] items) {
        if (!initialized) {
            return;
        }
        buildItems(items);
    }

    public void close() {
        if (!initialized) {
            return;
        }
        executeClose();
        initialized = Boolean.FALSE;
    }

    /**
     * 编写文档的标题
     * @param title 文档标题
     */
    protected abstract void buildTitle(String title);

    /**
     * 编写文档正文
     * @param str 一行文本
     */
    protected abstract void buildString(String str);

    /**
     * 编写文档条目
     * @param items 所有的条目
     */
    protected abstract void buildItems(String[] items);

    /**
     * 关闭文档编写
     */
    protected abstract void executeClose();
}
