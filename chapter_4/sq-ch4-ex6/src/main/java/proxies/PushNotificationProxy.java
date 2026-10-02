package proxies;

import model.Comment;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("PUSH")
public class PushNotificationProxy implements NotificationProxy {

    @Override
    public void sendMessage(Comment comment) {
        System.out.println("Sending push comment: " + comment.getText() + " by " + comment.getAuthor());
    }
}
