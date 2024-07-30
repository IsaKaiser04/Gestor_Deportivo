import java.util.Date;

class InscripcionEquipo {
    int inscripcionEquipoId;
    Date fechaInscripcion;
    Equipo equipo;

    public InscripcionEquipo(int inscripcionEquipoId, Date fechaInscripcion, Equipo equipo) {
        this.inscripcionEquipoId = inscripcionEquipoId;
        this.fechaInscripcion = fechaInscripcion;
        this.equipo = equipo;
    }
}
