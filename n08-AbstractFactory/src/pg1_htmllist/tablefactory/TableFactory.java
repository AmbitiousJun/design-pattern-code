package pg1_htmllist.tablefactory;

import pg1_htmllist.factory.Factory;
import pg1_htmllist.factory.Link;
import pg1_htmllist.factory.Page;
import pg1_htmllist.factory.Tray;

/**
 * @author ambitious
 * @date 2022/10/13 下午4:03
 */
@SuppressWarnings("all")
public class TableFactory extends Factory {

    @Override
    public Link createLink(String caption, String url) {
        return new TableLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new TableTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new TablePage(title, author);
    }
}
