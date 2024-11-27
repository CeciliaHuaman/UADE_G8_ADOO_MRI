package com.uade.adoo.mri.domain.entities;
import java.io.*;
import java.util.*;

/**
 * 
 */
public abstract class eventoDiagnostico {

    /**
     * Default constructor
     */
    public eventoDiagnostico() {
    }

    /**
     * 
     */
    private String eventType;

    /**
     * 
     */
    private List<IObserverDiagnostico> observer;

}