import java.util.Random;

public class PersonajeBasico implements Personaje {

    private String nombre;
    private int vida;
    private int dañoAtaque;
    private int velocidadAtaque;
    private double probabilidadAtaqueCritico;
    private Random random = new Random();

    public PersonajeBasico(String unNombre) {
        this.nombre = unNombre;
        this.vida = 100;
        this.dañoAtaque = 5;
        this.velocidadAtaque = 3;
        this.probabilidadAtaqueCritico = 1.0;
    }

    public void recibirDaño(double dañoAtaque) {
        this.vida -= dañoAtaque;
    }

    public void defenderse(double dañoAtaque) {
        // Cuando el personaje se defiende, el daño recibido se reduce a la mitad
        double daño = dañoAtaque / 2;
        this.vida -= daño;
    }

    public void atacar(PersonajeBasico perso) {
        /*
         * en este caso la probabilidad de realizar ataque critico del jugador es de 50%
         */
        if (perso.getVida() == 0) {
            System.out.println(this.nombre + " no puede atacar a " + perso.getNombre() + "dado que no tiene vida");
        } else {
            /* se calcula el daño con el critico */
            double dañoAInfrigir = 0;
            perso.recibirDaño(dañoAInfrigir);
            System.out
                    .println(this.nombre + " ataco con " + dañoAInfrigir + " puntos de ataque a " + perso.getNombre() +
                            "la vida ahora de " + perso.getNombre() + " es de " + perso.getNombre());
        }

    }

    public void escapar() {
        System.out.println(this.getNombre() + " escapando...");
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
        }
        System.out.println(this.getNombre() + " se escapo");
    }

    public int getDaño() {
        return this.dañoAtaque;
    };

    public int getVida() {
        return this.vida;
    };

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getVelocidad() {
        return this.velocidadAtaque;
    };

    private boolean esCritico() {
        boolean critico = false;
        int valor = random.nextInt(101);
        return critico;
    }

    public String getNombre() {
        return this.nombre;
    }
}