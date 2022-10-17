package pg2_yahoopage.factory;

/**
 * @author ambitious
 * @date 2022/10/17
 */
@SuppressWarnings("all")
public abstract class Factory {

    /**
     * 获取具体工厂实例
     * @param className 具体工厂的类名
     * @return 具体工厂实例
     */
    public static Factory getInstance(String className) {
        try {
            Factory ins = (Factory) Class.forName(className).newInstance();
            return ins;
        } catch (ClassNotFoundException e) {
            System.err.println("找不到类: " + className);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    public abstract Link createLink(String caption, String url);
    public abstract Tray createTray(String caption);
    public abstract Page createPage(String title, String author);

    public Page createYahooPage() {
        Link link = createLink("Yahoo!", "https://www.yahoo.com");
        Page page = createPage("Yahoo!", "Yahoo!");
        page.add(link);
        return page;
    }
}
