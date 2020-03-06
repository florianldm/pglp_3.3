package florianldm;

public class Robot {
    private Direction direction;
    private Position position;

    public Robot(){
        this.direction = Direction.setDirection();
        this.position = new Position(1,1);
    }

    public Direction getDirection() {
        return direction;
    }

    public Position getPosition() {
        return position;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

}
