package repositories;

import model.Comment;
import org.springframework.stereotype.Component;



public class EmailCommentRepository implements CommentRepository{


    @Override
    public void storeComment(Comment comment){
//        System.out.println("The comment was published by: " + this.comment.getAuthor() + " and had text: " + this.comment.getText() );
        System.out.println("Author: " + comment.getAuthor() + "Comment Stored: " + comment.getText());
    }
}
