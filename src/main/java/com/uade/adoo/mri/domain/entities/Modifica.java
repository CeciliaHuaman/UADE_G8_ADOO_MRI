package com.uade.adoo.mri.domain.entities;
import java.io.*;
import java.util.*;

/**
 * 
 */
public class Modifica implements EstadoTurno {

    /**
     * Default constructor
     */
    public Modifica() {
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
     * @param turno
     */
    public abstract void asignar(Turno turno);

    /**
     * @param turno
     */
    public abstract void modificar(Turno turno);

    /**
     * @param turno
     */
    public abstract void cancelar(Turno turno);

}