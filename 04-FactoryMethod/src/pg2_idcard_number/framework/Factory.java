package pg2_idcard_number.framework;

/**
 * @author Ambitious
 * @date 2022/9/14 10:05
 */
public abstract class Factory {

    /**
     * 创建产品实例
     * @param owner 产品所有者
     * @return 产品实例
     */
    protected abstract Product createProduct(String owner);

    /**
     * 注册产品
     * @param product 注册产品
     */
    protected abstract void registerProduct(Product product);

    public Product create(String owner) {
        Product p = createProduct(owner);
        registerProduct(p);
        return p;
    }
}
