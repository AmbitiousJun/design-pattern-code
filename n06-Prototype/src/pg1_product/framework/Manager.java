package pg1_product.framework;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ambitious
 * @description 用于生成实例
 * @date 2022/10/3 下午5:44
 */
@SuppressWarnings("all")
public class Manager {

    /**
     * 存放已注册的原型实例
     */
    private final Map<String, Product> showcase = new HashMap<>();

    public void register(String name, Product proto) {
        showcase.put(name, proto);
    }

    /**
     * 创建一个克隆实例
     * @param name 要克隆的原型实例名称
     * @return 克隆完成的实例对象
     */
    public Product create(String name) {
        Product p = showcase.get(name);
        if (p == null) {
            throw new RuntimeException("实例 [" + name + "] 不存在!");
        }
        return p.createClone();
    }
}
