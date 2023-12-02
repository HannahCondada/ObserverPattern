package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class Subscriber implements SubscriberObserver{

    private String subscriberName;

    public void setSubscriberName(String subscriberName) {
        this.subscriberName = subscriberName;
    }

    @Override
    public void UpdateSubscriber() {
        System.out.print("\n\n🔔 Hey, "+ subscriberName + "! ");
        System.out.print("The latest news has been published!");
    }

    @Override
    public void newSub() {
        System.out.println("\n\n🆕 A new subscriber has landed! Welcome, " + subscriberName + "!");
    }

    @Override
    public void subLeft() {
        System.out.print("\n\n❌" + subscriberName + " has cancelled subscription❌");
    }


}
