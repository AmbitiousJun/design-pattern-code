package pg1_bookshelf;

/**
 * 书架类，可以存放一定数量的图书
 * @author Ambitious
 * @date 2022/9/2 15:51
 */
@SuppressWarnings("all")
public class BookShelf implements Aggregate {

    /**
     * 书架中的图书，容量由构造方法决定
     */
    private final Book[] books;

    /**
     * 如果书架要新增一本书，应该存放在书架的哪个索引上
     */
    private int last = 0;

    public BookShelf(int maxSize) {
        this.books = new Book[maxSize];
    }

    public Book getBookAt(int index) {
        if (index < 0 || index >= getLength()) {
            return null;
        }
        return this.books[index];
    }

    public int getLength() {
        return last;
    }

    public boolean appendBook(Book book) {
        if (getLength() == this.books.length) {
            return false;
        }
        this.books[this.last] = book;
        this.last++;
        return true;
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
