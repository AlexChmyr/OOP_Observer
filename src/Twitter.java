
public class Twitter implements NewsFeed {
    private static int feedNumber = 0;
    private static int feedsPushed = 0;

    @Override
    public Post getNext() {
        String content = "Tweet №"+feedNumber;
        return new Tweet(content);
    }

    @Override
    public boolean hasNext() {
        feedNumber++;

        if(feedsPushed < 3){
            feedsPushed++;
            return true;
        }
        else {
            feedsPushed = 0;
            return false;
        }
    }
}
