package services;

import model.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import proxies.EmailNotificationProxy;
import repositories.EmailCommentRepository;


public class CommentService {

    @Autowired
    private EmailCommentRepository emailCommentRepository;

    @Autowired
    private EmailNotificationProxy emailNotitificationProxy;




    public void publishComment(Comment comment){
        this.emailCommentRepository.storeComment(comment);
        this.emailNotitificationProxy.sendNotfication(comment);
    }
}
