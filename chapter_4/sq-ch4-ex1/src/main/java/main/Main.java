package main;

import model.Comment;
import proxies.EmailNotificationProxy;
import repositories.EmailCommentRepository;
import services.CommentService;

public class Main {


    public static void main(String[] args) {
        Comment comment = new Comment("Varun", "Hello World!");

        EmailCommentRepository emailCommentRepository = new EmailCommentRepository(comment);
        EmailNotificationProxy emailNotificationProxy = new EmailNotificationProxy(comment);

        CommentService commentService = new CommentService(emailNotificationProxy, emailCommentRepository);

        commentService.publishComment(comment);
    }

}
