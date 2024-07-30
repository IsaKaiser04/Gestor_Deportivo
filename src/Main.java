import java.util.Date;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Crear equipos
        Equipo equipo1 = crearEquipo(1, "Equipo A");
        Equipo equipo2 = crearEquipo(2, "Equipo B");

        // Crear inscripciones
        InscripcionEquipo inscripcion1 = new InscripcionEquipo(1, new Date(), equipo1);
        InscripcionEquipo inscripcion2 = new InscripcionEquipo(2, new Date(), equipo2);

        // Crear campeonatos
        Campeonato campeonato1 = new Campeonato(1, 2, new Date(), "Estadio Central", "Masculino", "A", "Liga");

        // Registrar inscripciones en campeonatos
        campeonato1.registrarInscripcion(inscripcion1);
        campeonato1.registrarInscripcion(inscripcion2);

        // Ingresar resultados
        ingresarResultados(campeonato1);

        // Mostrar tabla de posiciones
        System.out.println("=================================================");
        System.out.println("Tabla de Posiciones del Campeonato 1:");
        campeonato1.tablaPosiciones.mostrarTabla();
    }

    private static Equipo crearEquipo(int nroRegistro, String nombre) {
        System.out.println("=================================================");
        System.out.println("Ingrese la informacion para " + nombre);
        System.out.print("Genero: ");
        String genero = scanner.nextLine();
        System.out.print("Categoria: ");
        String categoria = scanner.nextLine();

        Equipo equipo = new Equipo(nroRegistro, nombre, genero, categoria);
        System.out.println("=================================================");
        System.out.print("Numero de jugadores: ");
        int numJugadores = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= numJugadores; i++) {
            System.out.println("=================================================");
            System.out.println("Ingrese la informacion para el Jugador " + i);
            System.out.print("Nombre: ");
            String nombreJugador = scanner.nextLine();
            System.out.print("Cedula: ");
            String cedula = scanner.nextLine();
            System.out.print("Nacionalidad: ");
            String nacionalidad = scanner.nextLine();
            System.out.print("Sexo: ");
            String sexo = scanner.nextLine();
            System.out.print("Direccion: ");
            String direccion = scanner.nextLine();
            System.out.print("Celular: ");
            String celular = scanner.nextLine();
            System.out.print("Correo: ");
            String correo = scanner.nextLine();
            System.out.print("ID del Jugador: ");
            int jugadorId = Integer.parseInt(scanner.nextLine());
            System.out.print("Rol del Jugador: ");
            String categoriaJugador = scanner.nextLine();

            Jugador jugador = new Jugador(nombreJugador, cedula, nacionalidad, sexo, direccion, celular, correo, jugadorId, categoriaJugador);
            equipo.agregarJugador(jugador);
        }

        return equipo;
    }

    private static void ingresarResultados(Campeonato campeonato) {
        System.out.println("=================================================");
        System.out.println("Ingrese los resultados del partido:");

        System.out.print("Goles del Equipo 1: ");
        int golesEquipo1 = Integer.parseInt(scanner.nextLine());
        System.out.print("Goles del Equipo 2: ");
        int golesEquipo2 = Integer.parseInt(scanner.nextLine());

        Resultado resultado = new Resultado(campeonato.inscripcionesEquipos.get(0).equipo, campeonato.inscripcionesEquipos.get(1).equipo, golesEquipo1, golesEquipo2);
        campeonato.registrarResultado(resultado);
    }
}
