package repositories;

import model.Comment;
import org.springframework.stereotype.Component;

@Component
public class SaveCommentRepository implements DBRepository{

    @Override
    public void saveComment(Comment comment) {
        System.out.println("Comment: " + comment.getText() + " Author: " + comment.getAuthor());
    }
}
