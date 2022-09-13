public class GemaTanque extends PersonajeDecorator {

    private int armadura;
    public GemaTanque(Personaje personaje) {
        super(personaje);
        this.armadura = 50;
    
    }
    @Override
    public void recibirDaño(double dañoAtaque) {
        // TODO Auto-generated method stub
        
    }
    public double defenderseTanque(double dañoAtaque){
        double dañoRetorno = 0;
        double dañoRecibido = this.armadura - dañoAtaque;
        if (dañoRecibido < 0) {
            double daño = dañoRecibido*-1;
            //se rompio el escudo, se debe restar vida
            this.recibirDaño(daño);
        } else {
            this.armadura -= dañoAtaque;
        }
        /*se calcula la probabilidad de retornar el daño */
        return dañoRetorno;
    }
    @Override
    public void atacar(PersonajeBasico perso) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void escapar() {
        System.out.println(this.getNombre()+" escapando...");
        try {
            Thread.sleep(4000);
        } catch (Exception e) {
        }
        System.out.println(this.getNombre()+" se escapo");
        
    }
    
    
}
