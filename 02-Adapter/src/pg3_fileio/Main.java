package pg3_fileio;

import java.io.IOException;

/**
 * @author Ambitious
 * @date 2022/9/8 17:46
 */
public class Main {

    public static void main(String[] args) throws IOException {
        FileIo f = new FileProperties();
        f.readFromFile("adapter-pg3-files/file.txt");
        f.setValue("year", "2004");
        f.setValue("month", "4");
        f.setValue("day", "21");
        f.writeToFile("adapter-pg3-files/new_file.txt");
    }
}
