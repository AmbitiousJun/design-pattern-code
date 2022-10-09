package pg2_document1;

/**
 * @author ambitious
 * @date 2022/10/9 下午4:57
 */
public class Director {

    /**
     * 使用抽象类来构建文档，具体的构建由子类决定
     */
    private final Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    /**
     * 决定文档的生成步骤以及文档的内容
     */
    public void construct() {
        builder.makeTitle("Greeting");
        builder.makeString("从早上到下午");
        builder.makeItems(new String[] {
                "早上好",
                "下午好"
        });
        builder.makeString("晚上");
        builder.makeItems(new String[] {
                "晚上好",
                "晚安",
                "再见"
        });
        builder.close();
    }
}
