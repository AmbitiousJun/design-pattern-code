package pg1_htmllist.tablefactory;

import pg1_htmllist.factory.Link;

/**
 * @author ambitious
 * @date 2022/10/17
 */
@SuppressWarnings("all")
public class TableLink extends Link {

    public TableLink(String caption, String url) {
        super(caption, url);
    }

    @Override
    public String makeHTML() {
        return "<td><a href=\"" + url + "\">" + caption + "</a></td>\n";
    }
}
