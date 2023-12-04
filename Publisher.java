package ObserverPattern;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Publisher {
    public static void main(String[] args) {
        //Subscribers!
        Subscriber Hannah = new Subscriber();
        Hannah.setSubscriberName("Hannah");
        Subscriber Cali = new Subscriber();
        Cali.setSubscriberName("Cali");
        Subscriber Shiro = new Subscriber();
        Shiro.setSubscriberName("Shiro");

        //Notify the subscribers
        NewsAgency newsAgency = new NewsAgency();

        //Add the subscribers to the subscriber's list
        newsAgency.subscribe(Hannah);
        newsAgency.subscribe(Cali);
        newsAgency.subscribe(Shiro);

        //News Updates!
        System.out.print("\n📰 NEWS UPDATE! 📰");
        newsAgency.notifySubscriber();

        //Subscribers cancelled subscription 😢
        newsAgency.unSubscribe(Cali);
        newsAgency.unSubscribe(Shiro);

        //New subscriber arrived!
        Subscriber Haru = new Subscriber();
        Haru.setSubscriberName("Haru");
        newsAgency.subscribe(Haru);

        //Notify subscribers again, but this time with the updated subscribers
        newsAgency.notifySubscriber();
    }
}
