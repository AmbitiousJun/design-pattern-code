package pg1_bookshelf;

/**
 * 迭代器接口
 * @author Ambitious
 * @date 2022/9/2 15:48
 */
public interface Iterator {

    /**
     * 判断集合中是否还有下一个元素
     * @return 存在则 true, 不存在返回 false
     */
    boolean hasNext();

    /**
     * 获取集合中的下一个元素，并将迭代器指向集合中的下一个元素
     * @return 集合中的元素
     */
    Object next();
}
