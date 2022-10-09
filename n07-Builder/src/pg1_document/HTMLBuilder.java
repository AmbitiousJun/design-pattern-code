package pg1_document;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author ambitious
 * @description 使用 HTML 的形式编写文档
 * @date 2022/10/7 下午4:26
 */
@SuppressWarnings("all")
public class HTMLBuilder extends Builder{

    private String fileName;
    private PrintWriter writer;

    @Override
    public void makeTitle(String title) {
        this.fileName = title + ".html";
        try {
            writer = new PrintWriter(new FileWriter(this.fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
        writer.println("<html><head><title>" + title + "</title></head><body>");
        writer.println("<h1>" + title + "</h1>");
    }

    @Override
    public void makeString(String str) {
        writer.println("<p>" + str + "</p>");
    }

    @Override
    public void makeItems(String[] items) {
        writer.println("<ul>");
        for (String item : items) {
            writer.println("<li>" + item + "</li>");
        }
        writer.println("</ul>");
    }

    @Override
    public void close() {
        writer.println("</body></html>");
        writer.close();
    }

    public String getResult() {
        return fileName;
    }
}
