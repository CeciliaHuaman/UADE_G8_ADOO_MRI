
import java.io.*;
import java.util.*;

/**
 * 
 */
public class GestionTurnoController {

    /**
     * Default constructor
     */
    public GestionTurnoController() {
    }

    /**
     * 
     */
    public Collection<Turno> turnos;

    /**
     * @param triage 
     * @param paciente 
     * @param horario 
     * @param especialidad 
     * @return
     */
    public Turno crearTurno(String triage, Paciente paciente, Horario horario, Especialidad especialidad) {
        // TODO implement here
        return null;
    }

    /**
     * @param docu 
     * @return
     */
    public Collection<Turnos> getTurnosPaciente(Paciente.nroDocumento docu) {
        // TODO implement here
        return null;
    }

    /**
     * @param matricula 
     * @return
     */
    public Collection<Turnos> getTurnosMedico(Integer matricula) {
        // TODO implement here
        return null;
    }

}