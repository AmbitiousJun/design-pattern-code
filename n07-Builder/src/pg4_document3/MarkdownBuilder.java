package pg4_document3;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Markdown 文档构建器
 * @author ambitious
 * @date 2022/10/9 下午5:46
 */
public class MarkdownBuilder extends Builder{

    private String fileName;
    private PrintWriter writer;

    @Override
    public void makeTitle(String title) {
        fileName = title + ".md";
        try {
            writer = new PrintWriter(new FileWriter(fileName));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        writer.println("# " + title);
        writer.println();
    }

    @Override
    public void makeString(String str) {
        writer.println(str);
        writer.println();
    }

    @Override
    public void makeItems(String[] items) {
        if (items == null || items.length == 0) {
            return;
        }
        for (String item : items) {
            writer.println("- " + item);
        }
        writer.println();
    }

    @Override
    public void close() {
        writer.close();
    }

    public String getResult() {
        return fileName;
    }
}
