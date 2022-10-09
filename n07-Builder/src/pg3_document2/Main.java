package pg3_document2;

import java.util.Scanner;

/**
 * @author ambitious
 * @description 主类
 * @date 2022/10/7 下午4:33
 */
@SuppressWarnings("all")
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入选项：[1] 编写纯文本文档 [2] 编写 HTML 文档");
        int choice = scanner.nextInt();
        if (choice == 1) {
            TextBuilder builder = new TextBuilder();
            Director director = new Director(builder);
            director.construct();
            String content = builder.getResult();
            System.out.println("文档编写完成：");
            System.out.println(content);
        } else if (choice == 2) {
            HTMLBuilder builder = new HTMLBuilder();
            Director director = new Director(builder);
            director.construct();
            String filename = builder.getResult();
            System.out.println("文档编写完成：");
            System.out.println("文件名称：" + filename);
        } else {
            System.out.println("请输入正确的命令!");
            System.exit(0);
        }
    }
}
