public interface Personaje{
 
    public abstract void recibirDaño(int dañoAtaque);

    public abstract void defenderse(int dañoAtaque);
    
    public abstract void atacar(PersonajeBasico perso);

    public abstract void escapar();

    public abstract int getDaño();

    public abstract int getVida();

    public abstract boolean getEstado();

    public abstract void setEstado();

    public abstract String getNombre();



}