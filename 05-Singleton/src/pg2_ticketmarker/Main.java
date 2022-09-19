package pg2_ticketmarker;

/**
 * @author Ambitious
 * @date 2022/9/18 20:31
 */
public class Main {

    public static void main(String[] args) {
        TicketMarker marker1 = TicketMarker.getInstance();
        System.out.println(marker1.getNextTicketNumber());
        TicketMarker marker2 = TicketMarker.getInstance();
        System.out.println(marker2.getNextTicketNumber());
    }
}
