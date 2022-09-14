package pg1_idcard;

import pg1_idcard.framework.Factory;
import pg1_idcard.framework.Product;
import pg1_idcard.idcard.IdCard;
import pg1_idcard.idcard.IdCardFactory;

/**
 * @author Ambitious
 * @date 2022/9/12 16:05
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
