public class Tweet implements Post{
    private final String content;

    public Tweet(String content){
        this.content = content;
    }

    public String getContent(){
        return this.content;
    }
}
