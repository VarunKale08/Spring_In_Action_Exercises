package proxies;

import model.Comment;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("MAIL")
public class EmailNotificationProxy implements NotificationProxy{

    @Override
    public void sendMessage(Comment comment) {
        System.out.println("Sending comment as a mail: " + comment.getText() + " by " + comment.getAuthor());
    }
}
