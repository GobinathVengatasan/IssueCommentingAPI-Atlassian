package ut.com.addteq.assessment;

import org.junit.Test;
import com.addteq.assessment.api.MyPluginComponent;
import com.addteq.assessment.impl.MyPluginComponentImpl;

import static org.junit.Assert.assertEquals;

public class MyComponentUnitTest {
    @Test
    public void testMyName() {
        MyPluginComponent component = new MyPluginComponentImpl(null);
        assertEquals("names do not match!", "myComponent", component.getName());
    }
}