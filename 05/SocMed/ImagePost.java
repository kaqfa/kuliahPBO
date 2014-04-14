
public class ImagePost extends Post
{
    private String imageURL;
    
    public ImagePost(String username, String status, String imageURL){
        imagePost(username,status, imageURL);
    }
    
    public void imagePost(String username, String status, String imageURL){
        postStatus(username, status);
        this.imageURL = imageURL;
    }
}
