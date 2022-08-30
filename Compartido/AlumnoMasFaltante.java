package Compartido;
import java.util.Scanner;
import java.util.concurrent.Callable;

public class AlumnoMasFaltante implements Callable {

    private BaseBatos base;
 
    public AlumnoMasFaltante(BaseBatos b)
    {
        base = b;
    }
    
    public Object call()
    {
        int alumnoMasFaltante,mayorCantFaltas,faltasActuales,cantAlumnos;

        alumnoMasFaltante = -1;
        mayorCantFaltas = 0;
        cantAlumnos = base.getCantAlumnos();

        for(int alumno = 0;alumno<cantAlumnos;alumno++)
        {
            faltasActuales = base.sumaFilaFalta(alumno);
            if(faltasActuales>mayorCantFaltas)
            {
                alumnoMasFaltante = alumno;
                mayorCantFaltas = faltasActuales;
            }
            else if(faltasActuales == mayorCantFaltas)
            {
                alumnoMasFaltante = -1;
            }
        }

        return alumnoMasFaltante;
    }
}
