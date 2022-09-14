package pg2_idcard_number;

import pg2_idcard_number.framework.Factory;
import pg2_idcard_number.framework.Product;
import pg2_idcard_number.idcard.IdCardFactory;

/**
 * @author Ambitious
 * @date 2022/9/14 10:15
 */
@SuppressWarnings("all")
public class Main {

    public static void main(String[] args) {
        Factory factory = new IdCardFactory();
        Product card1 = factory.create("张三");
        Product card2 = factory.create("李四");
        Product card3 = factory.create("王五");
        card1.use();
        card2.use();
        card3.use();
    }
}
