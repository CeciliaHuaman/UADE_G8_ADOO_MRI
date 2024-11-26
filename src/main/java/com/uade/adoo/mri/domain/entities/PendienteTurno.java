
import java.io.*;
import java.util.*;

/**
 * 
 */
public class PendienteTurno implements EstadoPaciente {

    /**
     * Default constructor
     */
    public PendienteTurno() {
    }

    /**
     * @param paciente
     */
    public void pendienteTurno(Paciente paciente) {
        // TODO implement here
    }

    /**
     * @param paciente
     */
    public void turnoAsignado(Paciente paciente) {
        // TODO implement here
    }

    /**
     * @param paciente
     */
    public void enTratamiento(Paciente paciente) {
        // TODO implement here
    }

    /**
     * @param paciente
     */
    public void alta(Paciente paciente) {
        // TODO implement here
    }

    /**
     * @param paciente
     */
    public abstract void pendienteTurno(Paciente paciente);

    /**
     * @param paciente
     */
    public abstract void turnoAsignado(Paciente paciente);

    /**
     * @param paciente
     */
    public abstract void enTratamiento(Paciente paciente);

    /**
     * @param paciente
     */
    public abstract void alta(Paciente paciente);

}