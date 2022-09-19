package pg4_multithread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Ambitious
 * @date 2022/9/19 10:24
 */
@SuppressWarnings("all")
public class Main {

    public static void main(String[] args) {
        // 运行 10 个线程，测试单例模式
        ExecutorService service = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 10; i++) {
            service.execute(() -> {
                Singleton instance = Singleton.getInstance();
                int number = instance.getNextNumber();
                System.out.println("线程: " + Thread.currentThread().getName() + "获取到 number: " + number);
            });
        }
    }
}
