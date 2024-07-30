public class Resultado {
    Equipo equipo1;
    Equipo equipo2;
    int golesEquipo1;
    int golesEquipo2;

    public Resultado(Equipo equipo1, Equipo equipo2, int golesEquipo1, int golesEquipo2) {
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.golesEquipo1 = golesEquipo1;
        this.golesEquipo2 = golesEquipo2;
    }

    public void actualizarResultados() {
        if (golesEquipo1 > golesEquipo2) {
            // Victoria para equipo1
            equipo1.agregarPuntos(3);
            equipo2.agregarPuntos(0);
        } else if (golesEquipo2 > golesEquipo1) {
            // Victoria para equipo2
            equipo1.agregarPuntos(0);
            equipo2.agregarPuntos(3);
        } else {
            // Empate
            equipo1.agregarPuntos(1);
            equipo2.agregarPuntos(1);
        }
    }
}
