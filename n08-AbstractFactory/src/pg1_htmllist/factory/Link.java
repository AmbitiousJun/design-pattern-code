package pg1_htmllist.factory;

/**
 * @author ambitious
 * @date 2022/10/17
 */
@SuppressWarnings("all")
public abstract class Link extends Item {

    /**
     * 超链接地址
     */
    protected final String url;

    public Link(String caption, String url) {
        super(caption);
        this.url = url;
    }
}
