public interface Personaje{
 
    public abstract void recibirDaño(double dañoAtaque);

    public abstract void defenderse(double dañoAtaque);
    
    
    public abstract void atacar(PersonajeBasico perso);

    public abstract void escapar();


    public abstract int getDaño();

    public abstract int getVida();

    public abstract int getVelocidadAtaque();

    public abstract String getNombre();



}