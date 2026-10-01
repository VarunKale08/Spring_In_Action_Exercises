package service;

import model.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import proxies.NotficationProxy;
import repositories.DBRepository;

@Component
public class CommentService {

    private DBRepository dbRepository;
    private NotficationProxy notficationProxy;


    @Autowired
    public CommentService(DBRepository dbRepository, NotficationProxy notficationProxy) {
        this.dbRepository = dbRepository;
        this.notficationProxy = notficationProxy;
    }


    public void publishComment(Comment comment) {
            this.dbRepository.saveComment(comment);
            this.notficationProxy.sendComment(comment);
    }
}
