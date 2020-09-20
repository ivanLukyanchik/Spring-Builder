package net.idt.learning;

@Singleton
@Deprecated
public class RecommendatorImpl implements Recommendator {

    @InjectProperty("whiskey")
    private String alcohol;

    @Override
    public void recommend() {
        System.out.println("To protect yourself, Drink " + alcohol);
    }

}
