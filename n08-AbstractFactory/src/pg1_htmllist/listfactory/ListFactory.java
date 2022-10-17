package pg1_htmllist.listfactory;

import pg1_htmllist.factory.Factory;
import pg1_htmllist.factory.Link;
import pg1_htmllist.factory.Page;
import pg1_htmllist.factory.Tray;

/**
 * 具体工厂
 * @author ambitious
 * @date 2022/10/12 下午4:46
 */
public class ListFactory extends Factory {

    @Override
    public Link createLink(String caption, String url) {
        return new ListLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new ListTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new ListPage(title, author);
    }
}