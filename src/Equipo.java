import java.util.ArrayList;
import java.util.List;

class Equipo {
    int nroRegistro;
    String nombre;
    String genero;
    String categoria;
    private int puntos; // Atributo para almacenar puntos
    List<Jugador> jugadorList;

    public Equipo(int nroRegistro, String nombre, String genero, String categoria) {
        this.nroRegistro = nroRegistro;
        this.nombre = nombre;
        this.genero = genero;
        this.categoria = categoria;
        this.puntos = 0; // Inicializar puntos en 0
        this.jugadorList = new ArrayList<>();
    }

    public void agregarJugador(Jugador jugador) {
        jugadorList.add(jugador);
    }

    public void agregarPuntos(int puntos) {
        this.puntos += puntos;
    }

    public int getPuntos() {
        return puntos;
    }

    @Override
    public String toString() {
            return nombre + " - Puntos: " + puntos;
    }
}
