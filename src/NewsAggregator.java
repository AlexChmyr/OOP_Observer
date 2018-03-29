public interface NewsAggregator {
    public void addSubscriber(Subscriber subscriber);
    public void removeSubscriber(Subscriber subscriber);
    public void checkForPosts();
}
