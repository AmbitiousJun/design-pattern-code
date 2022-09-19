package pg2_ticketmarker;

/**
 * 门票标记器，单例模式
 * @author Ambitious
 * @date 2022/9/18 20:28
 */
public class TicketMarker {

    /**
     * 唯一实例
     */
    private static final TicketMarker MARKER = new TicketMarker();

    /**
     * 当前门票编号
     */
    private int ticket = 1000;

    /**
     * 私有化构造器
     */
    private TicketMarker() {}

    /**
     * 获取全局唯一实例
     * @return 唯一实例
     */
    public static TicketMarker getInstance() {
        return MARKER;
    }

    /**
     * 获取下一个门票编号
     * @return 门票编号
     */
    public int getNextTicketNumber() {
        return ticket++;
    }
}
