package it.com.addteq.assessment.rest;

import com.addteq.assessment.model.Comment;
import org.junit.Test;
import org.junit.After;
import org.junit.Before;

import static org.junit.Assert.*;

import org.apache.wink.client.Resource;
import org.apache.wink.client.RestClient;

public class IssueCommentsControllerFuncTest {

    @Before
    public void setup() {

    }

    @After
    public void tearDown() {

    }

    @Test
    public void messageIsValid() {

        /*String baseUrl = System.getProperty("baseurl");
        String resourceUrl = baseUrl + "/rest/api/issue-comments/1.0/comments";

        RestClient client = new RestClient();
        Resource resource = client.resource(resourceUrl);

        Comment response = resource.get(Comment.class);*/

        //assertEquals("Wrong Author","Gobinath",response.getAuthor());
        //assertEquals("Wrong Message","Use Java Standards",response.getMessage());
    }
}
