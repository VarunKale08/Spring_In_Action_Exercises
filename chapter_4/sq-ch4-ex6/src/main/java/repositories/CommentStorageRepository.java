package repositories;

import model.Comment;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class CommentStorageRepository implements StorageRepository {

    @Override
    public void publishComment(Comment comment) {
        System.out.println("Publishing comment: " + comment.getText() + " by " + comment.getAuthor());
    }
}
