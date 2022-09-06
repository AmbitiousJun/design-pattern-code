package pg1_bookshelf;

/**
 * 图书实体类
 * @author Ambitious
 * @date 2022/9/2 15:50
 */
public class Book {

    private String name;

    public Book(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
