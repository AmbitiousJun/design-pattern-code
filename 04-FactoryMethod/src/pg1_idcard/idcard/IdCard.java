package pg1_idcard.idcard;

import pg1_idcard.framework.Product;

/**
 * 具体的产品类，身份证
 * @author Ambitious
 * @date 2022/9/12 16:01
 */
public class IdCard extends Product {

    private final String owner;

    IdCard(String owner) {
        System.out.println("制作 " + owner + " 的身份证");
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println("使用 " + owner + " 的身份证");
    }

    public String getOwner() {
        return this.owner;
    }
}
