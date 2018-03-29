import java.util.ArrayList;
import java.util.List;

public class Publisher implements NewsAggregator {
    private final NewsFeed feed;
    private List<Subscriber> subscribers = new ArrayList<Subscriber>();

    public Publisher(NewsFeed feed){
        this.feed = feed;
    }


    @Override
    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void checkForPosts() {
        while (feed.hasNext()){
            Post newpost = feed.getNext();
            for (Subscriber s : subscribers){
                s.handleNewPost(newpost);
            }
        }
    }
}
