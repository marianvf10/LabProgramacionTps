public abstract class PersonajeDecorator implements Personaje {

    private Personaje personaje;

    public PersonajeDecorator(Personaje personaje){
        this.personaje = personaje;
    }

    protected Personaje getPersonaje(){
        //Este metodo es protected, dado que solo lo pueden utilizar
        //las clases que hereden de personajeDecorator
        return personaje;
    }
    
}
