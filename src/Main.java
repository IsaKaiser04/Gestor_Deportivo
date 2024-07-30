import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Crear jugadores
        Jugador jugador1 = new Jugador("Juan", "123", "Colombiano", "M", "Calle 1", "555-1234", "juan@mail.com", 1, "A");
        Jugador jugador2 = new Jugador("Pedro", "124", "Peruano", "M", "Calle 2", "555-5678", "pedro@mail.com", 2, "A");
        Jugador jugador3 = new Jugador("Maria", "125", "Ecuatoriana", "F", "Calle 3", "555-9876", "maria@mail.com", 3, "B");
        Jugador jugador4 = new Jugador("Ana", "126", "Venezolana", "F", "Calle 4", "555-6543", "ana@mail.com", 4, "B");

        // Crear equipos
        Equipo equipo1 = new Equipo(1, "Equipo A", "Masculino", "A");
        Equipo equipo2 = new Equipo(2, "Equipo B", "Femenino", "B");

        // Asignar jugadores a equipos
        equipo1.agregarJugador(jugador1);
        equipo1.agregarJugador(jugador2);
        equipo2.agregarJugador(jugador3);
        equipo2.agregarJugador(jugador4);

        // Crear inscripciones
        InscripcionEquipo inscripcion1 = new InscripcionEquipo(1, new Date(), equipo1);
        InscripcionEquipo inscripcion2 = new InscripcionEquipo(2, new Date(), equipo2);

        // Crear campeonatos
        Campeonato campeonato1 = new Campeonato(1, 2, new Date(), "Estadio Central", "Masculino", "A", "Liga");
        Campeonato campeonato2 = new Campeonato(2, 2, new Date(), "Estadio Sur", "Femenino", "B", "Grupos");

        // Registrar inscripciones en campeonatos
        campeonato1.registrarInscripcion(inscripcion1);
        campeonato1.registrarInscripcion(inscripcion2);
        campeonato2.registrarInscripcion(inscripcion1);
        campeonato2.registrarInscripcion(inscripcion2);

        // Crear resultados y registrar empates y victorias
        Resultado resultado1 = new Resultado(equipo1, equipo2, true); // Empate
        campeonato1.registrarResultado(resultado1);

        Resultado resultado2 = new Resultado(equipo1, equipo2, false); // Victoria para equipo1
        campeonato2.registrarResultado(resultado2);

        // Mostrar tablas de posiciones
        System.out.println("Tabla de Posiciones del Campeonato 1:");
        campeonato1.tablaPosiciones.actualizarPosiciones();
        // Aquí deberías imprimir la tabla de posiciones de manera adecuada.

        System.out.println("Tabla de Posiciones del Campeonato 2:");
        campeonato2.tablaPosiciones.actualizarPosiciones();
        // Aquí deberías imprimir la tabla de posiciones de manera adecuada.
    }
}
