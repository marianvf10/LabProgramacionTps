import java.util.Random;

public interface Personaje {

    public abstract int recibirDaño(int dañoAtaque);

    public abstract void defenderse();

    public abstract int atacar(Personaje perso);

    public abstract void escapar();

    public abstract int getDaño();

    public abstract int getVida();

    public abstract boolean getEstado();

    public abstract void setEstado(boolean e);

    public abstract String getNombre();

    public abstract void finDefensa();

    public abstract void sumarVida(int vida);

    public default void accion(Personaje enemigo) {
        Random r = new Random();
        int res;

        if (getEstado()) {
            
            res = r.nextInt(11);
            if(res == 0)
            {
                escapar();
            }
            else
            {
                if(res <6)
                {
                    atacar(enemigo);
                }
                else
                {
                    defenderse();
                }
            }

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

    }

}