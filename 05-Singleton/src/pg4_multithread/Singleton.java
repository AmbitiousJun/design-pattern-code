package pg4_multithread;

/**
 * 使用双重检查锁的方式保证程序只会生成一个 Singleton 实例
 * @author Ambitious
 * @date 2022/9/19 10:19
 */
@SuppressWarnings("all")
public class Singleton {

    /**
     * 最开始的时候不进行初始化
     */
    private static Singleton singleton = null;

    /**
     * 计数器
     */
    private int number = 1000;

    private Singleton() {
        System.out.println("实例化了一个对象。");
    }

    public static Singleton getInstance() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }

    public int getNextNumber() {
        return number++;
    }
}
