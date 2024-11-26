package com.uade.adoo.mri.domain.entities;
import java.io.*;
import java.util.*;

/**
 * 
 */
public abstract class Turno {

    /**
     * Default constructor
     */
    public Turno() {
    }

    /**
     * 
     */
    private Paciente paciente;

    /**
     * 
     */
    private Medico medico;

    /**
     * 
     */
    private Especialidad especialidad;

    /**
     * 
     */
    private Horario horario;

    /**
     * 
     */
    private List<IObserverTurno> observers;

    /**
     * 
     */
    private EstadoTurno estado;

    /**
     * 
     */
    public void cambiarEstado() {
        // TODO implement here
    }

    /**
     * 
     */
    public void asignar() {
        // TODO implement here
    }

    /**
     * 
     */
    public void modificar() {
        // TODO implement here
    }

    /**
     * 
     */
    public void cancelar() {
        // TODO implement here
    }

    /**
     * @return
     */
    public String getTipo() {
        // TODO implement here
        return "";
    }

    /**
     * @param paciente 
     * @return
     */
    public void asignarDatos(Paciente paciente) {
        // TODO implement here
        
    }

}