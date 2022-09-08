package pg3_fileio;

import java.io.*;
import java.util.Properties;

/**
 * @author Ambitious
 * @date 2022/9/8 17:39
 */
public class FileProperties implements FileIo{

    /**
     * 用于保存键值对类型的字符串属性
     */
    private final Properties properties;

    public FileProperties() {
        this.properties = new Properties();
    }

    @Override
    public void readFromFile(String filename) throws IOException {
        // 1 将文件读成输入流
        InputStream is = new FileInputStream(filename);
        // 2 加载到 properties 中
        properties.load(is);
    }

    @Override
    public void writeToFile(String filename) throws IOException {
        // 1 将文件读取成输出流
        OutputStream os = new FileOutputStream(filename);
        // 2 输出到文件中
        String comment = "written by FileProperties";
        properties.store(os, comment);
    }

    @Override
    public void setValue(String key, String value) {
        properties.setProperty(key, value);
    }

    @Override
    public String getValue(String key) {
        return properties.getProperty(key);
    }
}
