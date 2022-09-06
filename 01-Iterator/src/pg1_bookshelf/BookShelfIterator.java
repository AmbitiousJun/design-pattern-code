package pg1_bookshelf;

/**
 * 书架的迭代器实现类
 * @author Ambitious
 * @date 2022/9/2 16:01
 */
public class BookShelfIterator implements Iterator {

    /**
     * 要遍历的书架实例
     */
    private final BookShelf bookShelf;

    /**
     * 当前遍历到哪一个位置
     */
    private int index = 0;

    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
    }

    @Override
    public boolean hasNext() {
        return index < bookShelf.getLength();
    }

    @Override
    public Object next() {
        if (!hasNext()) {
            return null;
        }
        return bookShelf.getBookAt(index++);
    }
}
