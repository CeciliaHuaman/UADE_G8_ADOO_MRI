package com.uade.adoo.mri.domain.entities;
import java.io.*;
import java.util.*;

/**
 * 
 */
public class Medico {

    /**
     * Default constructor
     */
    public Medico() {
    }

    /**
     * 
     */
    private String nombre;

    /**
     * 
     */
    private Integer matricula;

    /**
     * 
     */
    private String mail;

    /**
     * 
     */
    private List<Turno> turnos;

    /**
     * @return
     */
    public Horario getHorario() {
        // TODO implement here
        return null;
    }

    /**
     * @param horario 
     * @return
     */
    public Boolean estoyDisponible(Date horario) {
        // TODO implement here
        return null;
    }

}