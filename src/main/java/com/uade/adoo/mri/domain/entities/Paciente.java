package com.uade.adoo.mri.domain.entities;
import lombok.*;

import java.io.*;
import java.util.*;

/**
 * 
 */
@RequiredArgsConstructor
@Getter
@Setter
public class Paciente {

    /**
     * Default constructor
     */
    public Paciente() {
    }

    /**
     * 
     */
    @NonNull
    private String nombre;

    /**
     * 
     */
    @NonNull
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
    @NonNull
    private String mail;

    /**
     * 
     */
    @NonNull
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