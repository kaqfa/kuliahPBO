
public class LinkPost extends Post
{
    String linkURL;

    public LinkPost(String username, String status, String linkURL){
    	linkPost(username, status, linkURL);
    }

    public void linkPost(String username, String status, String linkURL){
    	postStatus(username, status);
    	this.linkURL = linkURL;
    }
}
