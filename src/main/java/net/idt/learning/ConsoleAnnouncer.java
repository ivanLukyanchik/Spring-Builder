package net.idt.learning;

public class ConsoleAnnouncer implements Announcer {

    @InjectByType
    private Recommendator recommendator;

    public void announce(String message) {
        System.out.println(message);
        recommendator.recommend();
    }

}
