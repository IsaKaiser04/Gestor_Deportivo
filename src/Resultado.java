

class Resultado {
    Equipo equipoGanador;
    Equipo equipoPerdedor;
    boolean esEmpate; // Nuevo atributo para manejar empates

    public Resultado(Equipo equipoGanador, Equipo equipoPerdedor, boolean esEmpate) {
        this.equipoGanador = equipoGanador;
        this.equipoPerdedor = equipoPerdedor;
        this.esEmpate = esEmpate;
    }
}
