package services;

import model.Comment;
import proxies.EmailNotificationProxy;
import repositories.EmailCommentRepository;

public class CommentService {

    private EmailCommentRepository emailCommentRepository;
    private EmailNotificationProxy emailNotitificationProxy;

    public CommentService(EmailNotificationProxy emailNotificationProxy, EmailCommentRepository emailCommentRepository){
        this.emailNotitificationProxy = emailNotificationProxy;
        this.emailCommentRepository = emailCommentRepository;
    }

    public void publishComment(Comment comment){
        this.emailCommentRepository.storeComment(comment);
        this.emailNotitificationProxy.sendNotfication(comment);
    }
}
