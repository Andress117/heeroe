public class Heeroe {
    private int vida;
    private int x;
    private final String nombre;
    private boolean saltando;

    public Heeroe(String nombre) {
        this.vida = 3;
        this.x = 0;
        this.nombre = nombre;
        this.saltando = false;
    }

    public int getVida() {
        return vida;
    }

    public int getX() {
        return x;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isSaltando() {
        return saltando;
    }

    public void avanzar() {
        this.x++;
    }

    public void saltar() {
        this.saltando = true;
        System.out.println(this.nombre + ": ¡He saltado!");
    }

    public void aterrizar() {
        if (saltando) {
            this.saltando = false;
            System.out.println(this.nombre + ": ¡He aterrizado!");
        } else {
            System.out.println(this.nombre + ": Ya estoy en el suelo.");
        }
    }

    public void perderVida() {
        this.vida--;
        System.out.println(this.nombre + ": ¡Perdí una vida! Vidas restantes: " + this.vida);
    }

    public boolean debeSaltar() {
        return x % 10 == 0;
    }

    public void reset() {
        this.saltando = false;
    }
}