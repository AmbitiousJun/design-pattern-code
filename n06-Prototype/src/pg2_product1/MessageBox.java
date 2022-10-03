package pg2_product1;

import pg2_product1.framework.Product;

/**
 * @author ambitious
 * @description 使用消息盒子的方式打印字符串
 * @date 2022/10/3 下午6:03
 */
@SuppressWarnings("all")
public class MessageBox extends Product {

    private final char DECORATE_CHAR;

    public MessageBox(char decorateChar) {
        this.DECORATE_CHAR = decorateChar;
    }

    @Override
    public void use(String s) {
        if (s == null || s.length() == 0) {
            return;
        }
        // 1 获取字符串的长度
        int length = s.getBytes().length;
        // 2 打印一行包裹字符
        for (int i = 0; i < length + 4; i++) {
            System.out.print(DECORATE_CHAR);
        }
        // 3 打印字符串
        System.out.println("");
        System.out.println(DECORATE_CHAR + " " + s + " " + DECORATE_CHAR);
        // 4 再打印一行包裹字符
        for (int i = 0; i < length + 4; i++) {
            System.out.print(DECORATE_CHAR);
        }
        System.out.println("");
    }
}
