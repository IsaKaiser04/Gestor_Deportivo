


class Jugador extends Persona {
    int jugadorId;
    String categoria;

    public Jugador(String nombre, String cedula, String nacionalidad, String sexo, String direccion, String celular, String correo, int jugadorId, String categoria) {
        super(nombre, cedula, nacionalidad, sexo, direccion, celular, correo);
        this.jugadorId = jugadorId;
        this.categoria = categoria;
    }
}
