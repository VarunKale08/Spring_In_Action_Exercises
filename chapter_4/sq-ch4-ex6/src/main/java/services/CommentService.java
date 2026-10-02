package services;


import model.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import proxies.NotificationProxy;
import repositories.StorageRepository;

@Service
public class CommentService {

    private StorageRepository storageRepository;
    private NotificationProxy notificationProxy;


    @Autowired
    public CommentService(StorageRepository storageRepository, @Qualifier("PUSH") NotificationProxy notificationProxy) {
        this.storageRepository = storageRepository;
        this.notificationProxy = notificationProxy;
    }

    public void sendComment(Comment comment) {
        this.storageRepository.publishComment(comment);
        this.notificationProxy.sendMessage(comment);
    }
}
