
import java.util.Date;

class InscripcionEquipo {
    int idInscripcion;
    Date fechaInscripcion;
    Equipo equipo;

    public InscripcionEquipo(int idInscripcion, Date fechaInscripcion, Equipo equipo) {
        this.idInscripcion = idInscripcion;
        this.fechaInscripcion = fechaInscripcion;
        this.equipo = equipo;
    }
}
