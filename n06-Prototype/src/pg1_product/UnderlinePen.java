package pg1_product;

import pg1_product.framework.Product;

/**
 * @author ambitious
 * @description 使用下划线的方式打印字符串
 * @date 2022/10/3 下午6:05
 */
public class UnderlinePen implements Product {

    private final char UNDERLINE_CHAR;

    public UnderlinePen(char underlineChar) {
        this.UNDERLINE_CHAR = underlineChar;
    }

    @Override
    public void use(String s) {
        if (s == null || s.length() == 0) {
            return;
        }
        int length = s.getBytes().length;
        // 1 打印字符串，带引号
        System.out.println("\"" + s + "\"");
        // 2 打印特殊字符
        System.out.print(" ");
        for (int i = 0; i < length; i++) {
            System.out.print(UNDERLINE_CHAR);
        }
        System.out.println("");
    }

    @Override
    public Product createClone() {
        Product p = null;
        try {
            p = (Product) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }
}
