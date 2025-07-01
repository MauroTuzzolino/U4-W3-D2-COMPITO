package maurotuzzolino;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class GestioneEventi {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("gestioneeventi");

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
