package com.addteq.assessment.repository;

import com.addteq.assessment.model.Comment;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class IssueCommentsRepository {

    private List<Comment> issueComments = new ArrayList<>();

    public void addComment(Comment comment) {
        this.issueComments.add(comment);
    }

    public List<Comment> getCommentsByIssueID(String issueId) {
        return this.issueComments.stream().filter(comment -> issueId.equalsIgnoreCase(comment.getIssueId())).collect(Collectors.toList());
    }

    public List<Comment> getCommentsByAuthor(String author) {
        return this.issueComments.stream().filter(comment -> author.equalsIgnoreCase(comment.getAuthor())).collect(Collectors.toList());
    }

    public List<Comment> getIssueComments() {
        return issueComments;
    }
}
