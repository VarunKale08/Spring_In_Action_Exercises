package repositories;

import model.Comment;

public interface StorageRepository {

    public void publishComment(Comment comment);
}
