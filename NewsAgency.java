package ObserverPattern;
import java.util.ArrayList;
import java.util.List;
public class NewsAgency implements NewsAgencySubject{

    public List<Subscriber> subscriberList = new ArrayList<>();

    @Override
    public void subscribe(Subscriber subscriber) {
        subscriberList.add(subscriber);
    }

    @Override
    public void unSubscribe(Subscriber subscriber) {
        subscriberList.remove(subscriber);
    }

    @Override
    public String notifySubscriber() {
        String NewsRelease = new String();
        for (Subscriber subscriber : subscriberList) {
           subscriber.UpdateSubscriber();
    }
        return NewsRelease;
    }
}
