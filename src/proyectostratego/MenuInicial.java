import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MenuInicial {

    private static Map<String, Jugador> jugadores = new HashMap<>();

    public static void main(String[] args) {
        mostrarMenuInicial();
    }

    public static void mostrarMenuInicial() {
        System.out.println("MENU INICIAL");
        System.out.println("1. LOG IN");
        System.out.println("2. CREAR PLAYER");

        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                login();
                break;
            case 2:
                crearJugador();
                break;
            default:
                System.out.println("Opción inválida");
                break;
        }
    }

    public static void login() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su nombre de usuario: ");
        String username = scanner.nextLine();
        System.out.println("Ingrese su contraseña: ");
        String password = scanner.nextLine();

        if (jugadores.containsKey(username) && jugadores.get(username).getPassword().equals(password)) {
            System.out.println("¡Inicio de sesión exitoso!");
            mostrarMenuPrincipal(username);
        } else {
            System.out.println("¡Nombre de usuario o contraseña incorrectos!");
        }
    }

    public static void crearJugador() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un nombre de usuario: ");
        String username = scanner.nextLine();

        
        while (jugadores.containsKey(username)) {
            System.out.println("El nombre de usuario ya existe. Ingrese otro nombre de usuario: ");
            username = scanner.nextLine();
        }

        System.out.println("Ingrese una contraseña de 5 caracteres: ");
        String password = scanner.nextLine();

        
        while (password.length() != 5) {
            System.out.println("La contraseña debe tener exactamente 5 caracteres. Ingrese otra contraseña: ");
            password = scanner.nextLine();
        }

        Jugador jugador = new Jugador(username, password);
        jugadores.put(username, jugador);

        System.out.println("Jugador creado exitosamente.");
        mostrarMenuInicial();
    }

    public static void mostrarMenuPrincipal(String username) {
        System.out.println("Bienvenido, " + username + "!");
     
    }
}

class Jugador {
    private String username;
    private String password;
    private int puntos;
    private int vecesJugadasBuenos;
    private int vecesJugadasMalos;

    public Jugador(String username, String password) {
        this.username = username;
        this.password = password;
        this.puntos = 0;
        this.vecesJugadasBuenos = 0;
        this.vecesJugadasMalos = 0;
    }

   

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

   
}

