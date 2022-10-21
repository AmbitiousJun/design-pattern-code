package pg1_display;

/**
 * @author ambitious
 * @date 2022/10/17
 */
public class Main {

    public static void main(String[] args) {
        exercise3();
    }

    public static void exercise3() {
        IncreaseDisplay d = new IncreaseDisplay(new CharDisplayImpl('<', '*', '>'), 2);
        d.increaseDisplay(5);
        IncreaseDisplay d1 = new IncreaseDisplay(new CharDisplayImpl('|', '#', '-'), 3);
        d1.increaseDisplay(6);
    }

    public static void exercise2() {
        RandomDisplay d = new RandomDisplay(new FileDisplayImpl("star.txt"));
        d.randomDisplay(20);
    }

    public static void exercise1() {
        RandomDisplay d = new RandomDisplay(new StringDisplayImpl("Hello, Ambitious."));
        d.randomDisplay(20);
    }

    public static void chapterExample() {
        Display d1 = new Display(new StringDisplayImpl("Hello, China."));
        Display d2 = new CountDisplay(new StringDisplayImpl("Hello, World."));
        CountDisplay d3 = new CountDisplay(new StringDisplayImpl("Hello, Universe."));
        d1.display();
        d2.display();
        d3.display();
        d3.multiDisplay(5);
    }
}
