package pg1_htmllist.factory;

import java.util.ArrayList;
import java.util.List;

/**
 * 托盘类，用来聚合 Item
 * @author ambitious
 * @date 2022/10/12 下午3:53
 */
@SuppressWarnings("all")
public abstract class Tray extends Item {

    /**
     * Tray 是一个 Item，同时自身也可以用来存放多个 Item
     */
    protected final List<Item> items = new ArrayList<>();

    public Tray(String caption) {
        super(caption);
    }

    public void add(Item item) {
        items.add(item);
    }
}