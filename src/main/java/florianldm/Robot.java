package florianldm;

public class Robot {
    /** Direction du robot. */
    private Direction direction;
    /** Position robot. */
    private Position position;

    /**
     * Constructeur robot.
     */
    public Robot() {
        this.direction = Direction.setDirection();
        this.position = new Position(1, 1);
    }

    /**
     * getter.
     * @return direction.
     */
    public Direction getDirection() {
        return direction;
    }

    /**
     * getter.
     * @return position.
     */
    public Position getPosition() {
        return position;
    }

    /**
     * Setter.
     * @param d direction robot.
     */
    public void setDirection(final Direction d) {
        this.direction = d;
    }

    /**
     * setter.
     * @param p robot.
     */
    public void setPosition(final Position p) {
        this.position = p;
    }
}
