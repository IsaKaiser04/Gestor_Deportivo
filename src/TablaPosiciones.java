import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

class TablaPosiciones {
    Date fechaActualizacion;
    List<Equipo> equiposList;

    public TablaPosiciones(Date fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
        this.equiposList = new ArrayList<>();
    }

    public void agregarEquipo(Equipo equipo) {
        if (!equiposList.contains(equipo)) {
            equiposList.add(equipo);
        }
    }

    public void actualizarPosiciones() {
    // Ordena los equipos por puntos de mayor a menor
        Collections.sort(equiposList, new Comparator<Equipo>() {
            @Override
            public int compare(Equipo e1, Equipo e2) {
                return Integer.compare(e2.getPuntos(), e1.getPuntos());
            }
        }
    );

    fechaActualizacion = new Date(); // Actualizar la fecha
}

    public void mostrarTabla() {
        System.out.println("Tabla de Posiciones:");
        for (Equipo equipo : equiposList) {
            System.out.println(equipo);
        }
    }

}
