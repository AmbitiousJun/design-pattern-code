package pg1_product;

import pg1_product.framework.Manager;
import pg1_product.framework.Product;

/**
 * @author Ambitious
 * @date 2022/9/19 16:07
 */
public class Main {

    public static void main(String[] args) {
        // 准备
        Manager manager = new Manager();
        UnderlinePen pen = new UnderlinePen('~');
        MessageBox warningBox = new MessageBox('*');
        MessageBox slashBox = new MessageBox('/');
        manager.register("strong message", pen);
        manager.register("warning box", warningBox);
        manager.register("slash box", slashBox);
        // 生成克隆实例
        Product p1 = manager.create("strong message");
        p1.use("Hello, world.");
        Product p2 = manager.create("warning box");
        p2.use("Hello, world.");
        Product p3 = manager.create("slash box");
        p3.use("Hello, world.");
    }
}