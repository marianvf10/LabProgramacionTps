import java.util.Random;

public class PersonajeBasico implements Personaje {

    private String nombre;
    private int vida;
    private int dañoAtaque;
    private boolean activo;
    private int escudo;
    private boolean enDefensa;
    private Random random = new Random();

    public PersonajeBasico(String unNombre) {
        this.nombre = unNombre;
        this.vida = 100;
        this.dañoAtaque = 5;
        this.activo = true;
        enDefensa = false;
        this.escudo = 0;

    }
  
    public int recibirDaño(int dañoAtaque) {

        int nivelDefensa = 1;
        if(!enDefensa)
        {
            nivelDefensa = 0;
            this.vida -= dañoAtaque;
        }
        return nivelDefensa;
    }

    public void defenderse() {
        
        // Cuando el personaje se defiende, el daño recibido se reduce a la mitad
        enDefensa = true;
    }

    public int atacar(PersonajeBasico perso) {

            int danioInfrigido = this.dañoAtaque;
            int res = perso.recibirDaño(danioInfrigido);

            finDefensa();

            if(res == 1)
            {
            System.out
                    .println(this.nombre + " ataco con " + danioInfrigido + " puntos de ataque a "
                            + perso.getNombre() +
                            "la vida ahora de " + perso.getNombre() + " es de " + perso.getVida());
            }
            else
            {
                System.out
                    .println(perso.getNombre() + " no perdio vida ya que estaba en defensa");
                    if(res == 2)
                    {
                        this.recibirDaño(this.dañoAtaque);
                        System.out
                    .println(perso.getNombre() + " recibio su propio danio de ataque");
                    }
            }

            return res;
    }

    public void escapar() {
        
            finDefensa();    

            System.out.println(this.getNombre() + "se escapo");
            this.activo = false;
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

    public void finDefensa()
    {
        enDefensa = false;
    }

    @Override
    public void accion(PersonajeBasico enemigo) {
        Random r = new Random();
        
        switch(r.nextInt(3))
        {
            case 0:
                atacar(enemigo);
                break;
            case 1:
                defenderse();
                break;
            case 2:
                escapar();
                break;
        }
    }
}