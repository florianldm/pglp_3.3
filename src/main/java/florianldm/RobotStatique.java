package florianldm;

public class RobotStatique extends Robot implements Avancer{
    public RobotStatique(){
        super();
    }

    public void avancer() {
        System.out.println("Ce robot n'avance pas");
    }
}
