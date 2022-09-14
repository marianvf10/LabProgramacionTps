import java.util.Random;

public class PersonajeBasico implements Personaje {

    private String nombre;
    private int vida;
    private int dañoAtaque;
    private int probabilidadAtaqueCritico;
    private boolean activo;
    private int cantTurnos;
    private int escudo;
    private Random random = new Random();

    public PersonajeBasico(String unNombre, int cantT) {
        this.nombre = unNombre;
        this.vida = 100;
        this.dañoAtaque = 5;
        this.probabilidadAtaqueCritico = 10; // 10 % de probabilidad de golpe critico
        this.activo = true;
        this.cantTurnos = cantT;
        this.escudo = 0;

    }
  
    public void recibirDaño(int dañoAtaque) {
        this.vida -= dañoAtaque;
    }

    public void defenderse(int dañoAtaque) {
        if (this.cantTurnos > 0) {
            // Cuando el personaje se defiende, el daño recibido se reduce a la mitad
            double daño = dañoAtaque / 2;
            this.vida -= daño;
        }

    }

    public void atacar(PersonajeBasico perso) {
        if (cantTurnos > 0) {
            int danioInfrigido = this.dañoAtaque;

            if (esCritico()) {
                //si el golpe es critico se incrementa el danio infligido
                System.out.println(this.nombre + " ha conseguido un golpe critico");
                danioInfrigido = (int) (this.dañoAtaque * 1.5);
            }

            perso.recibirDaño(danioInfrigido);
            System.out
                    .println(this.nombre + " ataco con " + danioInfrigido + " puntos de ataque a "
                            + perso.getNombre() +
                            "la vida ahora de " + perso.getNombre() + " es de " + perso.getNombre());
        }
    }

    public void escapar() {
        if (this.cantTurnos > 0) {
            System.out.println(this.getNombre() + "se escapo");
            this.activo = false;
        }

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

    private boolean esCritico() {
        boolean resultado = false;
        ;
        int valor = random.nextInt(100);

        switch (this.probabilidadAtaqueCritico) {
            case 10:
                resultado = valor % 10 == 0;
                /*
                 * Entre 0 y 100 hay diez valores que son
                 * múltiplos de 10.
                 * Es decir, hay un 10% de posibilidades
                 * de obtener un valor múltiplo de 10.
                 */
                break;
            case 50:
                /*
                 * Entre 0 y 100 hay 50 valores que son multiplos de 2
                 * Es decir, hay un 50 % de probabilidades de obtener un valor multiplo de 2
                 */
                resultado = valor % 2 == 0;
                break;
        }
        return resultado;

    }

    public String getNombre() {
        return this.nombre;
    }
    public void setEstado(){
        this.activo = true;
    }

    public boolean getEstado(){
        return this.activo;
    }

    public void setEscudo(int escudo){
        this.escudo = escudo;
    }

    public int getEscudo(){
        return this.escudo;
    }
}