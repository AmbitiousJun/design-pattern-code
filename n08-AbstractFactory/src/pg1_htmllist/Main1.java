package pg1_htmllist;

import pg1_htmllist.factory.Factory;
import pg1_htmllist.factory.Link;
import pg1_htmllist.factory.Page;
import pg1_htmllist.factory.Tray;

/**
 * @author ambitious
 * @date 2022/10/12 下午4:48
 */
@SuppressWarnings("all")
public class Main1 {

    public static final String FACTORY_NAME = "pg1_htmllist.tablefactory.TableFactory";

    public static void main(String[] args) {
        Factory factory = Factory.getInstance(FACTORY_NAME);

        Page page = factory.createPage("LinkPage", "Ambitious");

        Tray trayNews = factory.createTray("日报");
        Link people = factory.createLink("人民日报", "https://www.people.com.cn");
        Link gmw = factory.createLink("光明日报", "https://www.gmw.cn/");
        trayNews.add(people);
        trayNews.add(gmw);

        Tray traySearch = factory.createTray("检索引擎");
        Tray yahoo = factory.createTray("Yahoo!");
        Link yahooUs = factory.createLink("yahoo_us", "http://www.yahoo.com/");
        Link yahooJapan = factory.createLink("yahoo_japan", "http://www.yahoo.co.jp/");
        yahoo.add(yahooUs);
        yahoo.add(yahooJapan);
        Link google = factory.createLink("Google", "https://www.google.com/");
        Link baidu = factory.createLink("Baidu", "https://www.baidu.com/");
        traySearch.add(yahoo);
        traySearch.add(google);
        traySearch.add(baidu);

        page.add(trayNews);
        page.add(traySearch);

        page.output();
    }
}
