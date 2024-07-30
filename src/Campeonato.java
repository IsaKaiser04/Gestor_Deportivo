import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Campeonato {
    int nroCampeonato;
    int nroClubs;
    Date fechaInicio;
    String lugar;
    String genero;
    String categoria;
    String sistemaCampeonato;
    List<InscripcionEquipo> inscripcionesEquipos;
    List<Resultado> resultadosList;
    TablaPosiciones tablaPosiciones;

    public Campeonato(int nroCampeonato, int nroClubs, Date fechaInicio, String lugar, String genero, String categoria, String sistemaCampeonato) {
        this.nroCampeonato = nroCampeonato;
        this.nroClubs = nroClubs;
        this.fechaInicio = fechaInicio;
        this.lugar = lugar;
        this.genero = genero;
        this.categoria = categoria;
        this.sistemaCampeonato = sistemaCampeonato;
        this.inscripcionesEquipos = new ArrayList<>();
        this.resultadosList = new ArrayList<>();
        this.tablaPosiciones = new TablaPosiciones(new Date());
    }

    public void registrarInscripcion(InscripcionEquipo inscripcion) {
        inscripcionesEquipos.add(inscripcion);
        tablaPosiciones.agregarEquipo(inscripcion.equipo);
    }

    public void registrarResultado(Resultado resultado) {
        resultado.actualizarResultados();
        resultadosList.add(resultado);
        tablaPosiciones.actualizarPosiciones();
    }

}
