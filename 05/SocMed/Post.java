import java.util.*;

public class Post
{
    String username;
    String status;
    int like;
    ArrayList<String> comments;
    
    public Post(){
        like = 0;
        comments = new ArrayList<String>();
    }
    
    public Post(String username, String status){
        like = 0;
        comments = new ArrayList<String>();
        postStatus(username, status);
    }
    
    public void postStatus(String username, String status){
        this.username = username;
        this.status = status;
    }
    
    public void likeThis(){
        this.like++;
    }
    
    public void addComment(String comment){
        comments.add(comment);
    }
    
    public void display(){
        System.out.println(username);
        System.out.println(status);
        if(like > 0) {
            System.out.println("  -  " + like + " people like this.");
        } else {
            System.out.println();
        }
        
        if(comments.isEmpty()) {
            System.out.println("   No comments.");
        } else {
            System.out.println("   " + comments.size() + " comment(s).");
        }
    }
}