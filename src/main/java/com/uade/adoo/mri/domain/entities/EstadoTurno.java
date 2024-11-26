
import java.io.*;
import java.util.*;

/**
 * 
 */
public interface EstadoTurno {

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