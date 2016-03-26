import antroy.app.App;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ant on 26/03/16.
 */
public class AppTest {

    @Test
    public void testHello() throws Exception {
        App app = new App();
        assertEquals("Hi", app.hello());
    }
}