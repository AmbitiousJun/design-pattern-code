package pg1_singleton;

/**
 * @author Ambitious
 * @date 2022/9/18 19:55
 */
@SuppressWarnings("all")
public class Main {

    public static void main(String[] args) {
        System.out.println("start .");
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        if (obj1 == obj2) {
            System.out.println("生成的是两个一样的对象");
        } else {
            System.out.println("生成的是不同的对象");
        }
    }
}
