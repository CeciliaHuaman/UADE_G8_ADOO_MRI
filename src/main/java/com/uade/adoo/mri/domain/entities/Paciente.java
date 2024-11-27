package com.uade.adoo.mri.domain.entities;
import java.io.*;
import java.util.*;

/**
 * 
 */
public class Paciente {

    /**
     * Default constructor
     */
    public Paciente() {
    }

    /**
     * 
     */
    private String nombre;

    /**
     * 
     */
    private Integer nroDocumento;

    /**
     * 
     */
    private List<Turno> turnos;

    /**
     * 
     */
    private HistoriaClinica historiaClinica;

    /**
     * 
     */
    private String mail;

    /**
     * 
     */
    private Integer telefono;

    /**
     * 
     */
    public void pendienteTurno() {
        // TODO implement here
    }

    /**
     * 
     */
    public void turnoAsignado() {
        // TODO implement here
    }

    /**
     * 
     */
    public void enTratamiento() {
        // TODO implement here
    }

    /**
     * 
     */
    public void alta() {
        // TODO implement here
    }

    /**
     * 
     */
    public void cambiarEstado() {
        // TODO implement here
    }

    /**
     * 
     */
    public void notificarDiagnostico() {
        // TODO implement here
    }

}