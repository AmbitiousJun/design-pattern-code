package pg1_singleton;

/**
 * 单例模式类，该类只能生成一个实例对象
 * @author Ambitious
 * @date 2022/9/18 19:51
 */
@SuppressWarnings("all")
public class Singleton {

    /**
     * 将唯一的实例通过静态变量的形式保存在本类中
     */
    public static final Singleton SINGLETON = new Singleton();

    /**
     * 私有化构造器，避免外界手动实例化对象
     */
    private Singleton() {
        System.out.println("实例化了一个对象");
    }

    /**
     * 外界只能通过这个方法来获取全局唯一的实例
     * @return Singleton 实例对象
     */
    public static Singleton getInstance() {
        return SINGLETON;
    }
}
