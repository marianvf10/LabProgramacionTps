import java.util.Random;

public class GemaGuerrero extends PersonajeDecorator {
   
    private int danioCritico;

    public GemaGuerrero(Personaje personaje){
        super(personaje);
        danioCritico = 7;
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
    public int atacar(Personaje perso) {

        Random r = new Random();
        int res = getPersonaje().atacar(perso);
        
        if(res == 0 && r.nextInt(2) == 0)
        {
            perso.recibirDaño(danioCritico);
            System.out
                    .println(getNombre()+ "tambien genero un extra de danio critico de " +danioCritico+ " a "+
                    perso.getNombre()+ "Le quedan " +perso.getVida()+ " puntos de vida.");
        }

        if(perso.getVida() <= 0)
        {
            System.out
                    .println(getNombre()+ "logro asesinar a " +perso.getNombre());
                    perso.setEstado(false);
        }
        return res;
    }

    public void finDefensa()
    {
        getPersonaje().finDefensa();
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
    public void setEstado(boolean e) {
        // TODO Auto-generated method stub
        getPersonaje().setEstado(e);
    }

    @Override
    public String getNombre() {
        return getPersonaje().getNombre();
    }

    @Override
    public void sumarVida(int vida) {
        // TODO Auto-generated method stub
        getPersonaje().sumarVida(vida);
    }
    
}
