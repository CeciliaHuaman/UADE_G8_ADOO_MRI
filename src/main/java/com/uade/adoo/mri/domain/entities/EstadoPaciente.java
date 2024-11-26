
import java.io.*;
import java.util.*;

/**
 * 
 */
public interface EstadoPaciente {

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