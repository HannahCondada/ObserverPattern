package ObserverPattern;

    public interface NewsAgencySubject {
        void subscribe(Subscriber subscriber);
        void unSubscribe(Subscriber subscriber);
        String notifySubscriber();
}
