public class GemaCurador extends PersonajeDecorator {

    public GemaCurador(Personaje personaje) {
        super(personaje);
        //TODO Auto-generated constructor stub
    }

    public void curarAliado(PersonajeBasico personaje){
        //el aliado tiene una curacion de 15 unidades
        int vidaRestante = personaje.getVida();
        if (vidaRestante < 86) {
            int vidaActualizada = vidaRestante+15;
            personaje.setVida(vidaActualizada);
            System.out.println(this.getNombre()+" curo a "+personaje.getNombre()+" ahora su vida es: "+personaje.getVida());
        }

    }

    public void otorgarEscudoAliado(PersonajeBasico personaje){
        //El curandero solo otorga escudos a guerreros
        int escudo = 20;
        if (personaje.getEscudo() == 0){
            personaje.setEscudo(escudo);
        }
       

    }

    public void revivirAliado(PersonajeBasico personaje){
        if (personaje.getVida() == 0){
            personaje.setVida(100);
            personaje.setEstado();
        }
    }
    
}
