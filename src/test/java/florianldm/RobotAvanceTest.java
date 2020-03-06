package florianldm;

import org.junit.*;
import org.junit.Assert;

public class RobotAvanceTest {
    @Test
    public void testAvance(){
        RobotAvance r = new RobotAvance();
        r.avancer();
        Position p = new Position(1,2);

        Assert.assertTrue(p.getX() == r.getPosition().getX());
        Assert.assertTrue(p.getY() == r.getPosition().getY());
    }

}
