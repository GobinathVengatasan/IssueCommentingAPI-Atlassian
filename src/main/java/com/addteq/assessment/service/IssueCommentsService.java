package com.addteq.assessment.service;

import com.addteq.assessment.model.Comment;

import java.util.List;

public interface IssueCommentsService {

    void addComment(Comment comment);
    List<Comment> getAllComments();
    List<Comment> getCommentsByIssueID(String issueId);
    List<Comment> getCommentsByAuthor(String author);
}
