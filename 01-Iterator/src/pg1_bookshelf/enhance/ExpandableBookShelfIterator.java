package pg1_bookshelf.enhance;

import pg1_bookshelf.Book;
import pg1_bookshelf.Iterator;

/**
 * @author Ambitious
 * @date 2022/9/6 16:36
 */
@SuppressWarnings("all")
public class ExpandableBookShelfIterator implements Iterator {

    private final ExpandableBookShelf bookShelf;

    /**
     * 记录当前遍历到哪一个位置
     */
    private int index = 0;

    public ExpandableBookShelfIterator(ExpandableBookShelf bookShelf) {
        this.bookShelf = bookShelf;
    }

    @Override
    public boolean hasNext() {
        int size = bookShelf.getLength();
        return index < size;
    }

    @Override
    public Object next() {
        if (!hasNext()) {
            return null;
        }
        Book book = bookShelf.getBookAt(this.index);
        index++;
        return book;
    }
}
