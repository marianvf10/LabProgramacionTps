import java.util.Random;

public class GemaTanque extends PersonajeDecorator {

    private int escapesRestantes;

    public GemaTanque(Personaje personaje) {
        super(personaje);
        escapesRestantes = 1;
    }
  
    public void defenderse(){
        getPersonaje().defenderse();
    }

    @Override
    public void escapar() {

        if(escapesRestantes == 0)
        {
            getPersonaje().escapar();

        }
        else
        {
            getPersonaje().finDefensa();
            System.out.println(this.getNombre()+" debe intentar escapar " +escapesRestantes+ " mas.");
            escapesRestantes--;

        }
    }

    @Override
    public int recibirDaño(int dañoAtaque){
        // TODO Auto-generated method stub

        Random r= new Random();
        int res = getPersonaje().recibirDaño(dañoAtaque);

        if(res == 1 && r.nextInt(2) == 0)
        {
            res++;
        }

        return res;
    }

    @Override
    public int atacar(Personaje perso) {
        // TODO Auto-generated method stub
        return getPersonaje().atacar(perso);
    }

    @Override
    public int getDaño() {
        // TODO Auto-generated method stub
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
        // TODO Auto-generated method stub
        return getPersonaje().getNombre();
    }

    @Override
    public void finDefensa() {
        // TODO Auto-generated method stub
        getPersonaje().finDefensa();
    }
    
    @Override
    public void sumarVida(int vida) {
        // TODO Auto-generated method stub
        getPersonaje().sumarVida(vida);
    }
    
}
