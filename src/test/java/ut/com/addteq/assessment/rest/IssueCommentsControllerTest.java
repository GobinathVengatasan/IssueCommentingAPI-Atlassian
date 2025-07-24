package ut.com.addteq.assessment.rest;

import com.addteq.assessment.model.Comment;
import org.junit.Test;
import org.junit.After;
import org.junit.Before;

import static org.junit.Assert.*;

import com.addteq.assessment.rest.IssueCommentsController;

import javax.ws.rs.core.Response;

public class IssueCommentsControllerTest {

    @Before
    public void setup() {

    }

    @After
    public void tearDown() {

    }

    @Test
    public void messageIsValid() {
        /*IssueCommentsController resource = new IssueCommentsController();

        Response response = resource.getComments();
        final Comment responseEntity = (Comment) response.getEntity();*/

        //assertEquals("Wrong Author","Gobinath",responseEntity.getAuthor());
        //assertEquals("Wrong Message","Use Java Standards",responseEntity.getMessage());
    }
}
