package pg2_idcard_number.idcard;

import pg2_idcard_number.framework.Product;

/**
 * @author Ambitious
 * @date 2022/9/14 10:07
 */
public class IdCard extends Product {

    /**
     * 身份证所有者
     */
    private final String owner;
    /**
     * 身份证编号
     */
    private final String number;

    IdCard(String owner, String number) {
        System.out.println("制作 " + owner + " 的身份证, 编号为: " + number);
        this.owner = owner;
        this.number = number;
    }

    @Override
    public void use() {
        System.out.println("使用了 " + owner + " 的身份证, 编号为: " + number);
    }

    public String getOwner() {
        return owner;
    }

    public String getNumber() {
        return number;
    }
}
