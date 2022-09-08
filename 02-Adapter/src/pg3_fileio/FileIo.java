package pg3_fileio;

import java.io.IOException;

/**
 * Target 角色，定义了操作 Properties 的方法
 * @author Ambitious
 * @date 2022/9/8 17:35
 */
public interface FileIo {

    /**
     * 从文件中读取 Properties 列表
     * @param filename 要读取的文件
     * @throws IOException 文件操作异常
     */
    void readFromFile(String filename) throws IOException;

    /**
     * 将 Properties 列表写入到文件中
     * @param filename 要写到哪一个文件中
     * @throws IOException 文件操作异常
     */
    void writeToFile(String filename) throws IOException;

    /**
     * 设置键值对属性值
     * @param key key
     * @param value value
     */
    void setValue(String key, String value);

    /**
     * 获取属性值
     * @param key 属性的 key
     * @return 属性的 value
     */
    String getValue(String key);
}
