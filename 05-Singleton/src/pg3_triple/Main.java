package pg3_triple;

/**
 * @author Ambitious
 * @date 2022/9/18 20:56
 */
public class Main {

    public static void main(String[] args) {
        Triple triple1 = Triple.getInstance(1);
        System.out.println(triple1.getInstanceName());

        Triple triple2 = Triple.getInstance(2);
        System.out.println(triple2.getInstanceName());

        Triple triple3 = Triple.getInstance(3);
        System.out.println(triple3.getInstanceName());

        Triple triple4 = Triple.getInstance(4);
        System.out.println(triple4.getInstanceName());
    }
}
