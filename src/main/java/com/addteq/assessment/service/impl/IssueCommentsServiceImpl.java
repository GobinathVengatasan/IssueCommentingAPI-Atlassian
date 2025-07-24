package com.addteq.assessment.service.impl;

import com.addteq.assessment.model.Comment;
import com.addteq.assessment.repository.IssueCommentsRepository;
import com.addteq.assessment.service.IssueCommentsService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class IssueCommentsServiceImpl implements IssueCommentsService {

    @Autowired
    private IssueCommentsRepository issueCommentsRepository;

    @Override
    public void addComment(Comment comment) {
        issueCommentsRepository.addComment(comment);
    }

    @Override
    public List<Comment> getAllComments() {
        return issueCommentsRepository.getIssueComments();
    }

    @Override
    public List<Comment> getCommentsByIssueID(String issueId) {
        return issueCommentsRepository.getCommentsByIssueID(issueId);
    }

    @Override
    public List<Comment> getCommentsByAuthor(String author) {
        return issueCommentsRepository.getCommentsByAuthor(author);
    }


}
