import java.util.Random;

public class GemaGuerrero extends PersonajeDecorator {
   
    private int danioCritico;

    public GemaGuerrero(Personaje personaje){
        super(personaje);
        danioCritico = 2;
    }

    @Override
    public int recibirDaño(int dañoAtaque) {
        // TODO Auto-generated method stub
        return getPersonaje().recibirDaño(dañoAtaque);
    }

    @Override
    public void defenderse() {
        // TODO Auto-generated method stub
        getPersonaje().defenderse();
        
    }

    @Override
    public int atacar(PersonajeBasico perso) {

        Random r = new Random();
        int res = getPersonaje().atacar(perso);
        
        if(res == 0 && r.nextInt(2) == 0)
        {
            perso.recibirDaño(danioCritico);
            System.out
                    .println(getNombre()+ "tambien genero un extra de danio critico de " +danioCritico+ " a "+
                    perso.getNombre()+ "Le quedan " +perso.getVida()+ " puntos de vida.");
        }

        return res;
    }

    public void finDefensa()
    {
        getPersonaje().finDefensa();
    }

    public void matar(PersonajeBasico perso)
    {
        finDefensa();
        if(perso.getVida() <= 0)
        {
            System.out.println(getNombre()+ " mato a "+ perso.getNombre());
        }
        else
        {
            System.out.println("Aun no puede matarse a "+ perso.getNombre());
        }
    }

    @Override
    public void escapar() {
        // TODO Auto-generated method stub
        getPersonaje().escapar();
    }

    @Override
    public int getDaño() {
        return getPersonaje().getDaño();
    }

    @Override
    public int getVida() {
        // TODO Auto-generated method stub
        return getPersonaje().getVida();
    }

    @Override
    public boolean getEstado() {
        // TODO Auto-generated method stub
        return getPersonaje().getEstado();
    }

    @Override
    public void setEstado() {
        // TODO Auto-generated method stub
        getPersonaje().setEstado();
    }

    @Override
    public String getNombre() {
        return getPersonaje().getNombre();
    }

    @Override
    public void accion(PersonajeBasico enemigo) {
        Random r = new Random();
        
        switch(r.nextInt(4))
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
