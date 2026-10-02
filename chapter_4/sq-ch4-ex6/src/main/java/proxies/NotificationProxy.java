package proxies;

import model.Comment;

public interface NotificationProxy {


    void sendMessage(Comment comment);
}
