package com.uade.adoo.mri.domain.entities;
import java.io.*;
import java.util.*;

/**
 * 
 */
public class Notificador {

    /**
     * Default constructor
     */
    public Notificador() {
    }

    /**
     * 
     */
    public IStrategyNotificacion strategyNoti;

    /**
     * @param notificacion
     */
    public void enviarNotificacion(Notificacion notificacion) {
        // TODO implement here
    }

    /**
     * @param estrategia
     */
    public void cambiarEstrategia(IStrategyNotificacion estrategia) {
        // TODO implement here
    }

}