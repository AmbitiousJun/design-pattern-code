package pg1_bookshelf;

/**
 * 表示能进行迭代的集合的接口
 * @author Ambitious
 * @date 2022/9/2 15:46
 */
public interface Aggregate {

    /**
     * 通过调用该方法生成一个可以遍历集合的迭代器
     * @return 迭代器对象
     */
    Iterator iterator();
}
