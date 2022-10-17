package pg2_yahoopage.listfactory;

import pg2_yahoopage.factory.Item;
import pg2_yahoopage.factory.Tray;

import java.util.Iterator;

/**
 * @author ambitious
 * @date 2022/10/12 下午4:17
 */
@SuppressWarnings("all")
public class ListTray extends Tray {

    public ListTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHTML() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("<li>\n");
        buffer.append(caption + "\n");
        buffer.append("<ul>\n");
        Iterator<Item> iter = items.iterator();
        while (iter.hasNext()) {
            Item item = iter.next();
            buffer.append(item.makeHTML());
        }
        buffer.append("</ul>\n");
        buffer.append("</li>\n");
        return buffer.toString();
    }
}
