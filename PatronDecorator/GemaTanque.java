import java.util.Random;

public class GemaTanque extends PersonajeDecorator {

    public GemaTanque(Personaje personaje) {
        super(personaje);
        
    }
  
    public int defenderseTanque(int dañoAtaque){
        defenderse(dañoAtaque);
        int dañoRetornado = 0;
        if (esCritico()){
            //se calcula la probabilidad de critico
            dañoRetornado = dañoAtaque;
        }
        return dañoRetornado;
    }

    @Override
    public void escapar() {
        System.out.println(this.getNombre()+" escapando...");
  
        System.out.println(this.getNombre()+" se escapo");
        
    }

    private boolean esCritico(){
        Random r = new Random();
        int valor = r.nextInt(100);
        return valor % 2 == 0;
    }

    public void protegerAliado(){
        
    }
    
}
