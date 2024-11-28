package com.uade.adoo.mri.domain.entities;
import java.io.*;
import java.util.*;

/**
 * 
 */
public class TurnoAsignado implements EstadoPaciente {

    /**
     * Default constructor
     */
    public TurnoAsignado() {
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
        paciente.cambiarEstado(new EnTratamiento());
    }

    /**
     * @param paciente
     */
    public void alta(Paciente paciente) {
        // TODO implement here
    }


}