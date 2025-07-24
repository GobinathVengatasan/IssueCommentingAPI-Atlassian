package com.addteq.assessment.rest;

import com.addteq.assessment.model.Comment;
import com.addteq.assessment.service.IssueCommentsService;
import com.atlassian.plugins.rest.common.security.AnonymousAllowed;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/comments")
public class IssueCommentsController {

    @Autowired
    private IssueCommentsService issueCommentsService;

    /*@Autowired
    private ActiveObjects ao;*/

    @POST
    @AnonymousAllowed
    @Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_JSON})
    public Response addComments(Comment comment)
    {
        issueCommentsService.addComment(comment);

        /*ao.executeInTransaction(new TransactionCallback<CommentEntity>() {
            @Override
            public CommentEntity doInTransaction() {
                final CommentEntity todo = ao.create(CommentEntity.class); // (2)
                todo.setDescription(comment.getMessage()); // (3)
                todo.setComplete(false);
                todo.save(); // (4)
                System.out.println("A row is added into CommentEntity..");
                return todo;
            }
        });*/

        return Response.ok(issueCommentsService.getCommentsByIssueID(comment.getIssueId())).build();
    }

    @GET
    @AnonymousAllowed
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_JSON})
    public Response getCommentsBy(@QueryParam(value = "author") String author)
    {
        if(author == null || author.isEmpty())
            return Response.ok(issueCommentsService.getAllComments()).build();
        return Response.ok(issueCommentsService.getCommentsByAuthor(author)).build();
    }
}