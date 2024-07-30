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
            equipo1.agregarPuntos(3); // Victoria para equipo1
        } else if (golesEquipo2 > golesEquipo1) {
            equipo2.agregarPuntos(3); // Victoria para equipo2
        } else {
            equipo1.agregarPuntos(1); // Empate
            equipo2.agregarPuntos(1); // Empate
        }
    }
}
