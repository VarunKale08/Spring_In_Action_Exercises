package main;

import config.ProjectConfig;
import model.Comment;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import proxies.EmailNotificationProxy;
import repositories.EmailCommentRepository;
import services.CommentService;

public class Main {


    public static void main(String[] args) {
        var comment = new Comment("Varun", "Hello World!");


        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var commentService = context.getBean(CommentService.class);

        commentService.publishComment(comment);
    }

}
