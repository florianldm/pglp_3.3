package florianldm;

public class RobotStatique extends Robot implements Avancer {
    /**
     * Constructeur.
     */
    public RobotStatique() {
        super();
    }

    /**
     * Méthode avancer.
     */
    public void avancer() {
        System.out.println("Ce robot n'avance pas");
    }
}
