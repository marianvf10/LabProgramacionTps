import java.util.Random;

public class main {
    public static void main(String args[]){
        Random r = new Random();
        
        //Se crean los personajes
        Personaje[] heroe = {
                            new PersonajeBasico("Agus"),
                            new PersonajeBasico("Juampi"),
                            new PersonajeBasico("Silvia")
                            };
        PersonajeBasico e1 = new PersonajeBasico("Orco malvado");
        PersonajeBasico e2 = new PersonajeBasico("Bruja oscura");
        PersonajeBasico e3 = new PersonajeBasico("Gigante eterno");


        //Los personajes exploran el mapa,y consiguen mejoras
        heroe[0] = new GemaGuerrero(heroe[0]);
        heroe[1] = new GemaTanque(heroe[1]);

        //Aparece un orco!
        do
        {
            e1.accion(heroe[r.nextInt(3)]);

            heroe[0].accion(e1);
            heroe[1].accion(e1);
            heroe[2].accion(e1);

        }while(e1.getEstado() && (heroe[0].getEstado() || heroe[1].getEstado() || heroe[2].getEstado()));
        
        //Se preparan para otras peleas.
        heroe[0].setEstado(true);
        heroe[1].setEstado(true);
        heroe[2].setEstado(true);
        heroe[0].finDefensa();
        heroe[1].finDefensa();
        heroe[2].finDefensa();

        //Los personajes exploran el mapa,y consiguen mejoras
        heroe[1] = new GemaCurador(heroe[1]);
        heroe[2] = new GemaCurador(heroe[2]); 


        do
        {
            e2.accion(heroe[r.nextInt(3)]);

            heroe[0].accion(e2);
            heroe[1].accion(e2);
            heroe[2].accion(e2);

        }while(e2.getEstado() && (heroe[0].getEstado() || heroe[1].getEstado() || heroe[2].getEstado()));

        //Se preparan para otras peleas.
        heroe[0].setEstado(true);
        heroe[1].setEstado(true);
        heroe[2].setEstado(true);
        heroe[0].finDefensa();
        heroe[1].finDefensa();
        heroe[2].finDefensa();

        //Los personajes exploran el mapa,y consiguen mejoras
        heroe[0] = new GemaTanque(heroe[0]);
        heroe[1] = new GemaGuerrero(heroe[1]);
        heroe[2] = new GemaGuerrero(heroe[2]); 

        do
        {
            e3.accion(heroe[r.nextInt(3)]);

            heroe[0].accion(e3);
            heroe[1].accion(e3);
            heroe[2].accion(e3);

        }while(e3.getEstado() && (heroe[0].getEstado() || heroe[1].getEstado() || heroe[2].getEstado()));

        /* 
        heroe[0].defenderse();
        heroe[0].defenderse();
        heroe[0].defenderse();
        heroe[0].defenderse();
        heroe[0].defenderse();
        heroe[0].defenderse();
        heroe[0].defenderse();
        heroe[0].defenderse();
        heroe[0].defenderse();
        heroe[0].defenderse();
        heroe[0].defenderse();
        heroe[0].defenderse();
        heroe[0].defenderse();
        heroe[0].defenderse();
        heroe[0].defenderse();
        heroe[0].defenderse();
        heroe[0].atacar(e1);
        heroe[0].atacar(e1);
        heroe[0].atacar(e1);
        heroe[0].atacar(e1);
        heroe[0].atacar(e1);
        heroe[0].atacar(e1);
        heroe[0].atacar(e1);
        heroe[0].atacar(e1);
        heroe[0].atacar(e1);
        heroe[0].atacar(e1);
        heroe[0].atacar(e1);
        heroe[0].atacar(e1);
        heroe[0].atacar(e1);
        */

        /*
        e1.atacar(heroe[0]);
        e1.atacar(heroe[0]);
        e1.atacar(heroe[1]);
        e1.atacar(heroe[1]);
        heroe[1].defenderse();
        e1.atacar(heroe[1]);
        e1.atacar(heroe[1]);
        e1.atacar(heroe[1]);
        heroe[1].escapar();
        heroe[1].escapar();
        heroe[1].atacar(e1);
        */


        /* 
        heroe[0].atacar(e1);
        heroe[0].atacar(e1);
        heroe[0].atacar(e1);
        e1.defenderse();
        heroe[0].atacar(e1);
        heroe[0].atacar(e1);
        heroe[1].atacar(e1);
        heroe[1].atacar(e1);
        heroe[1].atacar(e1);
        heroe[1].atacar(e1);
        heroe[1].atacar(e1);
        heroe[1].atacar(e1);
        heroe[0].atacar(e1);
        */


    }
}