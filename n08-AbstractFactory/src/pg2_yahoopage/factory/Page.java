package pg2_yahoopage.factory;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

/**
 * 用于填充 HTML 代码的页面
 * @author ambitious
 * @date 2022/10/12 下午3:59
 */
@SuppressWarnings("all")
public abstract class Page {

    /**
     * 页面标题
     */
    protected final String title;
    /**
     * 页面作者
     */
    protected final String author;
    /**
     * 存放页面的核心元素
     */
    protected final List<Item> contents = new ArrayList<>();

    public Page(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void add(Item item) {
        contents.add(item);
    }

    /**
     * 将 HTML 页面代码输出到文本文件中
     * 此方法也是一个简易的 Template Method 模式的模板方法
     */
    public void output() {
        try {
            String fileName = title + ".html";
            Writer writer = new FileWriter(fileName);
            writer.write(this.makeHTML());
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public abstract String makeHTML();
}