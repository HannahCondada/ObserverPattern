package ObserverPattern;

    public interface NewsAgencySubject {

        void subscribe(Subscriber subscriber);
        void unSubscribe(Subscriber subscriber);
        void newSub(Subscriber subscriber);
        void subLeft(Subscriber subscriber);
        String notifySubscriber();

}
