package pg2_document1;

/**
 * @author ambitious
 * @description 使用文本的形式编写文档
 * @date 2022/10/7 上午10:49
 */
@SuppressWarnings("all")
public class TextBuilder implements Builder {

    private final StringBuffer buffer = new StringBuffer();

    @Override
    public void makeTitle(String title) {
        buffer.append("====================\n")
            .append("『" + title + "』\n")
            .append('\n');
    }

    @Override
    public void makeString(String str) {
        buffer.append("■ " + str + "\n");
        buffer.append('\n');
    }

    @Override
    public void makeItems(String[] items) {
        for (String item : items) {
            buffer.append("  ○ " + item + "\n");
        }
        buffer.append('\n');
    }

    @Override
    public void close() {
        buffer.append("====================\n");
    }

    public String getResult() {
        return buffer.toString();
    }
}
