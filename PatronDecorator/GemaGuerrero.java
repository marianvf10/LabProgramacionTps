public class GemaGuerrero extends PersonajeDecorator {
    private int escudo;
    public GemaGuerrero(Personaje personaje){
        super(personaje);
        this.escudo = 10;
    }

    @Override
    public void recibirDaño(double dañoAtaque) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void defenderse(double dañoAtaque) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void atacar(PersonajeBasico perso) {
        double dañoAInfrigir = 0;
        /*se calcula el daño con el critico de 50% */
        if (dañoAInfrigir >= perso.getVida()){
            this.matar(perso,dañoAInfrigir);
        } else {
            perso.recibirDaño(dañoAInfrigir);
        }
    }

    private void matar(PersonajeBasico perso,double dañoAtaque){
        perso.recibirDaño(dañoAtaque);
        perso.setVida(0);
        System.out.println(this.getNombre()+" ejecuta a "+perso.getNombre()+"ya no puede participar en la batalla");
    }

    public int getEscudo(){
        return this.escudo;
    }

    public void setEscudo(int escudo){
        this.setEscudo(escudo);
        try {
            Thread.sleep(5000);
            //luego de 5 segundos desaparece el escudo
            this.setEscudo(0);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }


    
}
