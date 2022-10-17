package pg1_htmllist.listfactory;

import pg1_htmllist.factory.Item;
import pg1_htmllist.factory.Page;

import java.util.Iterator;

/**
 * @author ambitious
 * @date 2022/10/12 下午4:36
 */
@SuppressWarnings("all")
public class ListPage extends Page {

    public ListPage(String title, String author) {
        super(title, author);
    }

    @Override
    public String makeHTML() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("<!DOCTYPE html>\n");
        buffer.append("<html>\n");
        buffer.append("<head><title>" + title + "</title></head>\n");
        buffer.append("<body>\n");
        buffer.append("<h1>" + title + "</h1>\n");
        buffer.append("<ul>\n");
        Iterator<Item> iter = contents.iterator();
        while (iter.hasNext()) {
            Item item = iter.next();
            buffer.append(item.makeHTML());
        }
        buffer.append("</ul>\n");
        buffer.append("<hr><address>" + author + "</address>\n");
        buffer.append("</body>\n");
        buffer.append("</html>");
        return buffer.toString();
    }
}