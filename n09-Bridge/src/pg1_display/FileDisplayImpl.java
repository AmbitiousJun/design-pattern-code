package pg1_display;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * 显示文件中的文本
 * @author ambitious
 * @date 2022/10/20
 */
@SuppressWarnings("all")
public class FileDisplayImpl extends DisplayImpl {

    private final String FILE_NAME;
    private BufferedReader reader;
    /**
     * 缓存大小限制
     */
    private final int MAX_READ_HEAD_LIMIT = 59;

    public FileDisplayImpl(String fileName) {
        this.FILE_NAME = fileName;
    }

    @Override
    public void rawOpen() {
        try {
            reader = new BufferedReader(new FileReader(this.FILE_NAME));
            reader.mark(this.MAX_READ_HEAD_LIMIT);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=" + FILE_NAME + "-=-=-=-=-=-=-=-=-=-=-=-=");
    }

    @Override
    public void rawPrint() {
        try {
            String line;
            reader.reset();
            while ((line = reader.readLine()) != null) {
                System.out.println("< " + line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void rawClose() {
        System.out.println("=-=-=-=-=-=-=");
        try {
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
