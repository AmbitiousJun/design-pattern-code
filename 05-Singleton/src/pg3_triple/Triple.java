package pg3_triple;

/**
 * 该类可以且只能生成 3 个实例，并且可以通过 id 获取相应的实例
 * @author Ambitious
 * @date 2022/9/18 20:44
 */
@SuppressWarnings("all")
public class Triple {

    /**
     * 定长数组，只能存 3 个实例
     */
    private static final Triple[] TRIPLES = new Triple[3];

    /**
     * 在静态代码块中将 3 个实例创建出来
     */
    static {
        TRIPLES[0] = new Triple(1, "实例1");
        TRIPLES[1] = new Triple(2, "实例2");
        TRIPLES[2] = new Triple(3, "实例3");
    }

    /**
     * 实例 id
     */
    private final int id;

    /**
     * 实例名称
     */
    private final String name;

    private Triple(int id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * 根据 id 获取当前类的实例
     * @param id id, 范围 [1,3]
     * @return 相应 id 的实例，如果 id 不合法，返回 null
     */
    public static Triple getInstance(int id) {
        if (id < 1 || id > 3) {
            throw new IndexOutOfBoundsException("id 取值范围是 [1,3]");
        }
        return TRIPLES[id-1];
    }

    /**
     * 获取当前实例的名称
     * @return 实例名称
     */
    public String getInstanceName() {
        return this.name;
    }
}
