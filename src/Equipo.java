import java.util.ArrayList;
import java.util.List;

class Equipo {
    int nroRegistro;
    String nombre;
    String genero;
    String categoria;
    List<Jugador> jugadorList;

    public Equipo(int nroRegistro, String nombre, String genero, String categoria) {
        this.nroRegistro = nroRegistro;
        this.nombre = nombre;
        this.genero = genero;
        this.categoria = categoria;
        this.jugadorList = new ArrayList<>();
    }

    public void agregarJugador(Jugador jugador) {
        jugadorList.add(jugador);
    }
}
