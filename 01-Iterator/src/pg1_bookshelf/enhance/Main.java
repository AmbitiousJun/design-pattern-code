package pg1_bookshelf.enhance;

import pg1_bookshelf.Book;
import pg1_bookshelf.BookShelf;
import pg1_bookshelf.Iterator;

/**
 * @author Ambitious
 * @date 2022/9/6 16:40
 */
@SuppressWarnings("all")
public class Main {

    public static void main(String[] args) {
        ExpandableBookShelf bookShelf = new ExpandableBookShelf();
        bookShelf.appendBook(new Book("Around the World in 80 Days"));
        bookShelf.appendBook(new Book("Bible"));
        bookShelf.appendBook(new Book("Cinderella"));
        bookShelf.appendBook(new Book("Daddy Long Legs"));
        // 使用迭代器遍历书架
        Iterator iterator = bookShelf.iterator();
        while (iterator.hasNext()) {
            Book book = (Book) iterator.next();
            System.out.println(book.getName());
        }
    }
}
