package proxies;

import model.Comment;
import org.springframework.stereotype.Component;
import repositories.EmailCommentRepository;



public class EmailNotificationProxy implements NotificationProxy {


    @Override
    public void sendNotfication(Comment comment){
        System.out.println("Comment: " + comment.getText() + " by: " + comment.getAuthor());
    }
}
