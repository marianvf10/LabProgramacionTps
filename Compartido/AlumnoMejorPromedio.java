package Compartido;
import java.util.concurrent.Callable;

public class AlumnoMejorPromedio implements Callable {

    private BaseBatos base;
 
    public AlumnoMejorPromedio(BaseBatos b)
    {
        base = b;
    }
    
    public Object call()
    {
        int alumnoMejorPromedio,mayorPromedio,promedioActual,cantAlumnos,cantMaterias;

        alumnoMejorPromedio = -1;
        mayorPromedio = 0;
        cantAlumnos = base.getCantAlumnos();
        cantMaterias = base.getCantMaterias();

        for(int alumno = 0;alumno<cantAlumnos;alumno++)
        {
            promedioActual = base.sumaFilaNota(alumno) / cantMaterias;
            if(promedioActual>mayorPromedio)
            {
                alumnoMejorPromedio = alumno;
                mayorPromedio = promedioActual;
            }
            else if(mayorPromedio == promedioActual)
            {
                alumnoMejorPromedio = -1;
            }
        }

        return alumnoMejorPromedio;
    }
}