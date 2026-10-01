package proxies;

import model.Comment;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class PushNotificationProxy implements NotficationProxy {

    @Override
    public void sendComment(Comment comment) {
        System.out.println("Comment: "  + comment.getText() + " Author: "  + comment.getAuthor());
    }
}
