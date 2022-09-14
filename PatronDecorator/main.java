public class Main {
    public static void main(String args[]){
        //Se crean los personajes
        PersonajeBasico p1 = new PersonajeBasico("Pepe");
        PersonajeBasico p2 = new PersonajeBasico("Lucas");
        PersonajeBasico e1 = new PersonajeBasico("Orco malvado");
        PersonajeBasico e2 = new PersonajeBasico("Bruja oscura");

        //Los personajes exploran el mapa,y consiguen mejoras
        GemaGuerrero g1 = new GemaGuerrero(p1);
        
        //Empieza una batalla
    }
}