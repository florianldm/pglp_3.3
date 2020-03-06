package florianldm;

public class RobotAvance extends Robot implements Avancer{
    public RobotAvance(){
        super();
    }

    public void avancer() {
        Position p = this.getPosition();
        if(this.getDirection().equals(Direction.NORD)){
            p.setY(p.getY()+1);
        }
        if(this.getDirection().equals(Direction.EST)){
            p.setX(p.getX()+1);
        }
        if(this.getDirection().equals(Direction.SUD)){
            p.setY(p.getY()-1);
        }
        if(this.getDirection().equals(Direction.OUEST)){
            p.setX(p.getX()-1);
        }
    }
}
