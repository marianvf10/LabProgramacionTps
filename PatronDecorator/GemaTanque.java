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

        }
    }

    private boolean esCritico(){
        Random r = new Random();
        int valor = r.nextInt(100);
        return valor % 2 == 0;
    }

    public void protegerAliado(){
        
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
    public int atacar(PersonajeBasico perso) {
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
    public void setEstado() {
        // TODO Auto-generated method stub
        getPersonaje().setEstado();
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
    
}
