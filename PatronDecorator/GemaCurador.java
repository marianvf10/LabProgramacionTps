import java.util.Random;

public class GemaCurador extends PersonajeDecorator {

    private int turnosHastaCur;

    public GemaCurador(Personaje personaje) {
        super(personaje);
        turnosHastaCur = 3;
        //TODO Auto-generated constructor stub
    }

    private void finTurno()
    {
        if(turnosHastaCur == 1)
        {
            turnosHastaCur = 3;
            getPersonaje().sumarVida(10);
            System.out.println(getPersonaje().getNombre() +" genero 10 de vida de forma pasiva.");
        }
        else
        {
            turnosHastaCur--;
        }
    }

    @Override
    public int recibirDaño(int dañoAtaque) {
        return getPersonaje().recibirDaño(dañoAtaque);
    }

    @Override
    public void defenderse() {
        // TODO Auto-generated method stub
        Random r = new Random();
        
        getPersonaje().defenderse();

        if(r.nextInt(10) == 0)
        {
            System.out.println(getPersonaje().getNombre()+ " se curo 10 de vida.");
            getPersonaje().sumarVida(10);
        }
        finTurno();
    }

    @Override
    public int atacar(Personaje perso) {
        
        Random r = new Random();
        int res = getPersonaje().atacar(perso);
        if(res == 0 && r.nextInt(10) == 0)
        {
            System.out.println(getPersonaje().getNombre()+ " fue veloz y logro un segundo ataque.");
            getPersonaje().atacar(perso);
        }
        finTurno();
        return res;
    }

    @Override
    public void escapar() {
        // TODO Auto-generated method stub
        getPersonaje().escapar();
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
