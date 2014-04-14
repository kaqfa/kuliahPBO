import java.util.*;

public class SocMed
{
    ArrayList<Post> posts;
    
    public SocMed(){   
        posts = new ArrayList<Post>();
    }
    
    public void addPost(String username, String status){
        posts.add(new Post(username, status));
    }
    
    public void addImagePost(String username, String status, String imageURL){
        posts.add(new ImagePost(username, status, imageURL));
    }
    
    public void addLinkPost(String username, String status, String linkURL){
        posts.add(new LinkPost(username, status, linkURL));
    }
    
    public void newsFeed(){
        for(int i = 0; i < posts.size(); i++){
            posts.get(i).display();
        }
    }
    
    public void addComment(int postIndex, String comment){
        posts.get(postIndex).addComment(comment);
    }
    
    public void likePost(int postIndex){
        posts.get(postIndex).likeThis();
    }
}
