package pg1_bookshelf.enhance;

import pg1_bookshelf.Aggregate;
import pg1_bookshelf.Book;
import pg1_bookshelf.Iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 可扩容的书架类
 * @author Ambitious
 * @date 2022/9/6 16:29
 */
@SuppressWarnings("all")
public class ExpandableBookShelf implements Aggregate {

    /**
     * 使用 ArrayList 代替数组，使得书架变得可扩容
     */
    private final List<Book> books;

    public ExpandableBookShelf() {
        this.books = new ArrayList<>();
    }

    /**
     * 获取书架上某一索引上的书
     * @param index
     * @return 如果 index 有效，返回书架上对应位置的书，无效则返回 null
     */
    public Book getBookAt(int index) {
        if (index < 0 || index >= getLength()) {
            return null;
        }
        return this.books.get(index);
    }

    /**
     * 获取当前书架中书的数量
     * @return 书的数量
     */
    public int getLength() {
        return this.books.size();
    }

    /**
     * 将书插入到书架的末尾
     * @param book 要插入的书
     */
    public void appendBook(Book book) {
        this.books.add(book);
    }

    @Override
    public Iterator iterator() {
        return new ExpandableBookShelfIterator(this);
    }
}
