package config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import proxies.EmailNotificationProxy;
import repositories.CommentRepository;
import repositories.EmailCommentRepository;
import services.CommentService;

@Configuration
public class ProjectConfig {


    @Bean
    public EmailCommentRepository emailCommentRepository() {
        var x = new EmailCommentRepository();
        return x;
    }

    @Bean
    public EmailNotificationProxy emailNotificationProxy() {
        var x = new EmailNotificationProxy();
        return x;
    }

    @Bean
    public CommentService commentService() {
        var p =new CommentService(emailNotificationProxy(), emailCommentRepository());
        return p;
    }

}
