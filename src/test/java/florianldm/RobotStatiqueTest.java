package florianldm;

import org.junit.*;
import org.junit.Assert;

public class RobotStatiqueTest {
    /**
     * Testavance.
     */
    @Test
    public void testAvance() {
        RobotStatique r = new RobotStatique();
        r.avancer();
        Assert.assertEquals("","");
    }

}
