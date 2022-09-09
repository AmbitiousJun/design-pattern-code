package pg1_display;

/**
 * @author Ambitious
 * @date 2022/9/9 17:13
 */
public class Main {

    public static void main(String[] args) {
        AbstractDisplay d1 = new CharDisplay('H');
        d1.display(3);
        AbstractDisplay d2 = new StringDisplay("Hello World!");
        d2.display(4);
        AbstractDisplay d3 = new StringDisplay("你好，中国！");
        d3.display(5);
    }
}
