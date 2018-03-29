public class Client implements Subscriber {
    private final String name;

    public Client(String name){
        this.name = name;
    }

    public void handleNewPost(Post post){
        System.out.printf("Client %s gets %s \n",
                            this.name,
                            post.getContent());
    }
}
