package pg3_document2;

/**
 * @author ambitious
 * @description 使用文本的形式编写文档
 * @date 2022/10/7 上午10:49
 */
@SuppressWarnings("all")
public class TextBuilder extends Builder {

    private final StringBuffer buffer = new StringBuffer();

    @Override
    public void buildTitle(String title) {
        buffer.append("====================\n")
            .append("『" + title + "』\n")
            .append('\n');
    }

    @Override
    public void buildString(String str) {
        buffer.append("■ " + str + "\n");
        buffer.append('\n');
    }

    @Override
    public void buildItems(String[] items) {
        for (String item : items) {
            buffer.append("  ○ " + item + "\n");
        }
        buffer.append('\n');
    }

    @Override
    public void executeClose() {
        buffer.append("====================\n");
    }

    public String getResult() {
        return buffer.toString();
    }
}
