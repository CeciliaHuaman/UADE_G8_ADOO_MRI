package com.uade.adoo.mri.domain.entities;
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
    public abstract Medico pedirMedico(Especialidad especialidad, Date horario);

}