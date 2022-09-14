package pg1_idcard.framework;

/**
 * 抽象工厂，使用 Template Method 模式定义创建 Product 的流程
 * @author Ambitious
 * @date 2022/9/12 15:55
 */
public abstract class Factory {

    /**
     * 创建产品
     * @param owner 产品的所有者
     * @return 创建完成的产品
     */
    protected abstract Product createProduct(String owner);

    /**
     * 注册产品
     * @param product 需要进行注册的产品
     */
    protected abstract void registerProduct(Product product);

    /**
     * 模板方法，指定 Product 的生产流程
     * @param owner Product 的所有者
     * @return 生产完成的产品
     */
    public final Product create(String owner) {
        Product p = createProduct(owner);
        registerProduct(p);
        return p;
    }
}
