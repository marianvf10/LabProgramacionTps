public class Main {
    public static void main(String args[]){
        PersonajeBasico p1 = new PersonajeBasico("MARIANO");
        PersonajeBasico p2 = new PersonajeBasico("ADRIANO");
        p1.atacar(p2);
        System.out.println();
        GemaGuerrero gemaGuerrero = new GemaGuerrero(p1);
        gemaGuerrero.atacar(p2);

    }
}