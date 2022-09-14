public class GemaGuerrero extends PersonajeDecorator {
   
    public GemaGuerrero(Personaje personaje){
        super(personaje);
       
    }

    @Override
    public void recibirDaño(int dañoAtaque) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void defenderse(int dañoAtaque) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void atacar(PersonajeBasico perso) {
        int dañoAInfrigir = 0;
        /*se calcula el daño con el critico de 50% */
        if (dañoAInfrigir >= perso.getVida()){
            this.matar(perso,dañoAInfrigir);
        } else {
            perso.recibirDaño(dañoAInfrigir);
        }
    }

    private void matar(PersonajeBasico perso,int dañoAtaque){
        perso.recibirDaño(dañoAtaque);
        perso.setVida(0);
        System.out.println(this.getNombre()+" ejecuta a "+perso.getNombre()+"ya no puede participar en la batalla");
    }

    
}
