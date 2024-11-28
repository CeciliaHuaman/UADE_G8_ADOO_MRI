package com.uade.adoo.mri.domain.entities;
import java.io.*;
import java.util.*;

/**
 * 
 */
public class Alta implements EstadoPaciente {

    /**
     * Default constructor
     */
    public Alta() {
    }

    /**
     * @param paciente
     */
    public void pendienteTurno(Paciente paciente) {
        // TODO implement here
        paciente.cambiarEstado(new PendienteTurno());

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
}