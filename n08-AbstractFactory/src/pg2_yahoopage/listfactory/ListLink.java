package pg2_yahoopage.listfactory;

import pg2_yahoopage.factory.Link;

/**
 * @author ambitious
 * @date 2022/10/12 下午4:13
 */
@SuppressWarnings("all")
public class ListLink extends Link {

    public ListLink(String caption, String url) {
        super(caption, url);
    }

    @Override
    public String makeHTML() {
        return "  <li><a href=\"" + url + "\">" + caption + "</a></li>\n";
    }
}
