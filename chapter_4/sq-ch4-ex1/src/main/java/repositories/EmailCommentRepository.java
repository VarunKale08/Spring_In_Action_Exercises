package repositories;

import model.Comment;

public class EmailCommentRepository implements CommentRepository{

    private Comment comment;


    public EmailCommentRepository(Comment comment){
        this.comment = comment;
    }

    @Override
    public void storeComment(Comment comment){
//        System.out.println("The comment was published by: " + this.comment.getAuthor() + " and had text: " + this.comment.getText() );
        System.out.println("Author: " + this.comment.getAuthor() + "Comment Stored: " + this.comment.getText());
    }
}
