package com.uade.adoo.mri.domain.entities;
import java.io.*;
import java.util.*;

/**
 * 
 */
public class GestionPacienteController {


    private static GestionPacienteController instancia;

    /**
     * Colección para almacenar los pacientes.
     */

    private Collection<Paciente> pacientes;

    private GestionPacienteController() {
        this.pacientes = new ArrayList<>();
    }

    /**
     * Obtiene la instancia única de la clase.
     *
     * @return La instancia única de GestionPacienteController.
     */
    public static GestionPacienteController getInstancia() {
        if (instancia == null) {
            synchronized (GestionPacienteController.class) {
                if (instancia == null) {
                    instancia = new GestionPacienteController();
                }
            }
        }
        return instancia;
    }


    /**
     * @param nombre 
     * @param nroDocumento 
     * @param mail
     * @param telefono
     * @return el paciente creado
     */
    public Paciente crearPaciente(String nombre, Integer nroDocumento, String mail, Integer telefono) {

        if (nombre == null || nombre.isEmpty() || nroDocumento == null || mail == null || mail.isEmpty()) {
            throw new IllegalArgumentException("Todos los campos son obligatorios.");
        }

        // Verificar si ya existe un paciente con el mismo número de documento
        for (Paciente p : pacientes) {
            if (p.getNroDocumento().equals(nroDocumento)) {
                throw new IllegalArgumentException("Ya existe un paciente con este número de documento.");
            }
        }

        Paciente nuevoPaciente = new Paciente(nombre, nroDocumento, mail, telefono);
        pacientes.add(nuevoPaciente);
        return nuevoPaciente;
    }

    /**
     * Obtiene la colección de todos los pacientes.
     *
     * @return Una colección inmutable de pacientes.
     */
    public Collection<Paciente> getPacientes() {
        return new ArrayList<>(pacientes); // Devuelve una copia para evitar modificaciones externas.
    }

}