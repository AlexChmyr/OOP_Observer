public class Main {
    public static void main(String[] args){

        NewsFeed twitter = new Twitter();
        NewsAggregator publisher = new Publisher(twitter);

        Subscriber client1 = new Client("Leonardo");
        publisher.addSubscriber(client1);
        publisher.checkForPosts();

        System.out.println("_____________________________\n");

        Subscriber client2 = new Client("Donatello");
        Subscriber client3 = new Client("Raphael");
        publisher.addSubscriber(client2);
        publisher.addSubscriber(client3);
        publisher.checkForPosts();

        System.out.println("_____________________________\n");

        publisher.removeSubscriber(client2);
        publisher.checkForPosts();
    }
}
