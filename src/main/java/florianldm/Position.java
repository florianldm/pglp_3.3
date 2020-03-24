package florianldm;

public class Position {
    /** position x. */
    private int x;
    /** position y. */
    private int y;

    /**
     * Constructeur.
     * @param x1 posx.
     * @param y1 posy.
     */
    public Position(final int x1, final int y1) {
        this.x = x1;
        this.y = y1;
    }

    /**
     * getter.
     * @return position.
     */
    public Position getPosition() {
        return this;
    }

    /**
     * setter.
     * @param x1 posx.
     */
    public void setX(final int x1) {
        this.x = x1;
    }

    /**
     * setter.
     * @param y1 posy.
     */
    public void setY(final int y1) {
        this.y = y1;
    }

    /**
     * getter.
     * @return posx.
     */
    public int getX() {
        return x;
    }

    /**
     * getter.
     * @return posy.
     */
    public int getY() {
        return y;
    }
}
