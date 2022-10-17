package pg2_yahoopage;

import pg2_yahoopage.factory.Factory;
import pg2_yahoopage.factory.Page;

/**
 * @author ambitious
 * @date 2022/10/12 下午4:48
 */
@SuppressWarnings("all")
public class Main {

    public static final String FACTORY_NAME = "pg2_yahoopage.listfactory.ListFactory";

    public static void main(String[] args) {
        Factory factory = Factory.getInstance(FACTORY_NAME);
        Page page = factory.createYahooPage();
        page.output();
    }
}