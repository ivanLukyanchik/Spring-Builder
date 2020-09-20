package net.idt.learning;

@Deprecated
public class CoronaDesinfector {

//    private final Announcer announcer = ObjectFactory.getInstance().createObject(Announcer.class);
//
//    private final Policeman policeman = ObjectFactory.getInstance().createObject(Policeman.class);

    @InjectByType
    private Announcer announcer;

    @InjectByType
    private Policeman policeman;

    public void start(Room room) {
        announcer.announce("Начинаем дезинфекцию!");
        policeman.makePeopleLeaveRoom();
        desinfect(room);
        announcer.announce("Заходим обратно!");

    }

    private void desinfect(Room room) {
        System.out.println("Комната дезинфецируется");
    }

}
