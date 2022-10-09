package pg4_document3;

/**
 * @author ambitious
 * @description 指挥类，控制 Builder 构建出具体的文档
 * @date 2022/10/7 上午10:39
 */
public class Director{

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
