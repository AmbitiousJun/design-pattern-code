package pg1_product.framework;

/**
 * @author ambitious
 * @description 抽象出来的产品接口，可克隆
 * @date 2022/10/3 下午6:01
 */
public interface Product extends Cloneable {

    /**
     * 产品具体如何使用
     * @param s 用于展示的核心字符串
     */
    void use(String s);

    /**
     * 创建出当前实例的克隆实例
     * @return 创建出来的实例
     */
    Product createClone();
}
