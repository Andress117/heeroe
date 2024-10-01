import java.util.Scanner;

public class Juego {
    private Heeroe heeroe;

    public Juego() {
        this.heeroe = new Heeroe("Heeroe");
    }

    public void iniciar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¡Bienvenido al juego de Heeroe!");

        while (heeroe.getVida() > 0) {
            System.out.println("\nIngresa un comando (avanzar, saltar, aterrizar, salir):");
            String comando = scanner.nextLine();

            switch (comando.toLowerCase()) {
                case "avanzar":
                    heeroe.avanzar();
                    if (heeroe.debeSaltar()) {
                        System.out.println(heeroe.getNombre() + ": ¡Un obstáculo se aproxima! ¡Debo saltar!");
                    }
                    break;
                case "saltar":
                    if (heeroe.debeSaltar()) {
                        heeroe.saltar();
                    } else {
                        System.out.println(heeroe.getNombre() + ": No hay obstáculos, no necesito saltar.");
                    }
                    break;
                case "aterrizar":
                    heeroe.aterrizar();
                    break;
                case "salir":
                    System.out.println("¡Juego terminado!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Comando no reconocido. Intenta de nuevo.");
                    continue;  // Vuelve al inicio del bucle para permitir otro intento
            }

            // Si el héroe ha avanzado y debe saltar, verifica si está saltando
            if (heeroe.debeSaltar() && !heeroe.isSaltando()) {
                heeroe.perderVida();
            }

            // Avanzar solo si el héroe ha aterrizado
            if (!heeroe.isSaltando()) {
                heeroe.reset();
            }
        }

        scanner.close();
    }

    public static void main(String[] args) {
        Juego juego = new Juego();
        juego.iniciar();
    }
}