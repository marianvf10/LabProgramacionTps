public interface Personaje{
 
    public abstract int recibirDaño(int dañoAtaque);

    public abstract void defenderse();
    
    public abstract int atacar(PersonajeBasico perso);

    public abstract void escapar();

    public abstract int getDaño();

    public abstract int getVida();

    public abstract boolean getEstado();

    public abstract void setEstado();

    public abstract String getNombre();

    public abstract void finDefensa();

    public abstract void accion(PersonajeBasico enemigo);



}