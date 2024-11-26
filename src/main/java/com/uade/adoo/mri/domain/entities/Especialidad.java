
import java.io.*;
import java.util.*;

/**
 * 
 */
public abstract class Especialidad {

    /**
     * Default constructor
     */
    public Especialidad() {
    }

    /**
     * 
     */
    private String nombre;

    /**
     * 
     */
    private Integer codigo;

    /**
     * 
     */
    private List<Medico> medicos;

    /**
     * @param especialidad 
     * @param horario 
     * @return
     */
    public Medico pedirMedico(Especialidad especialidad, Date horario) {
        // TODO implement here
        return null;
    }

}