package proxies;

import model.Comment;
import repositories.EmailCommentRepository;

public class EmailNotificationProxy implements NotificationProxy {

    private Comment comment;

    public EmailNotificationProxy(Comment comment){
        this.comment = comment;
    }

    @Override
    public void sendNotfication(Comment comment){
        System.out.println("Comment: " + this.comment.getText() + " by: " + this.comment.getAuthor());
    }
}
