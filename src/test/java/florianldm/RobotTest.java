package florianldm;
import org.junit.*;
import org.junit.Assert;

public class RobotTest {
    @Test
    public void TestDirection(){
        Robot r = new Robot();
        Direction d = Direction.NORD;
        r.setDirection(d);
        Assert.assertEquals(r.getDirection(), Direction.NORD);
    }

    @Test
    public void TestPosition(){
        Robot r = new Robot();
        Position p = new Position(5,5) ;
        r.setPosition(p);
        Assert.assertEquals(r.getPosition(), p);
    }
}
