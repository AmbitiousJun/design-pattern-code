package pg2_document1;

/**
 * 将 ConcreteBuilder 抽象成接口
 * @author ambitious
 * @date 2022/10/9 下午4:53
 */
public interface Builder {

    /**
     * 编写文档的标题
     * @param title 标题字符串
     */
    void makeTitle(String title);

    /**
     * 编写文档的正文（一行）
     * @param str 正文内容
     */
    void makeString(String str);

    /**
     * 编写文档的列表
     * @param items 列表项数组
     */
    void makeItems(String[] items);

    /**
     * 停止文档编写
     */
    void close();
}
