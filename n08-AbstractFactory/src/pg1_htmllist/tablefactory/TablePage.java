package pg1_htmllist.tablefactory;

import pg1_htmllist.factory.Item;
import pg1_htmllist.factory.Page;

import java.util.Iterator;

/**
 * @author ambitious
 * @date 2022/10/13 下午3:58
 */
@SuppressWarnings("all")
public class TablePage extends Page {

    public TablePage(String title, String author) {
        super(title, author);
    }

    @Override
    public String makeHTML() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("<html><head><title>" + title + "</title></head>\n");
        buffer.append("<body>\n");
        buffer.append("<h1>" + title + "</h1>\n");
        buffer.append("<table width=\"80%\" border=\"3\">\n");
        Iterator<Item> iter = contents.iterator();
        while (iter.hasNext()) {
            Item item = iter.next();
            buffer.append("<tr>" + item.makeHTML() + "</tr>");
        }
        buffer.append("</table>\n");
        buffer.append("<hr><address>" + author + "</address>");
        buffer.append("</body></html>\n");
        return buffer.toString();
    }
}
