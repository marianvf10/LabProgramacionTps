package Compartido;

import java.util.concurrent.Callable;

public class MateriaMejorPromedio implements Callable {
   
    private BaseBatos base;
 
    public MateriaMejorPromedio(BaseBatos b)
    {
        base = b;
    }
    
    public Object call()
    {
        int materiaMejorPromedio,mayorPromedio,promedioActual,cantAlumnos,cantMaterias;

        materiaMejorPromedio = -1;
        mayorPromedio = 0;
        cantAlumnos = base.getCantAlumnos();
        cantMaterias = base.getCantMaterias();

        for(int materia = 0;materia<cantMaterias;materia++)
        {
            promedioActual = base.sumaColumnaNota(materia) / cantAlumnos;
            if(promedioActual>mayorPromedio)
            {
                materiaMejorPromedio = materia;
                mayorPromedio = promedioActual;
            }
            else if(mayorPromedio == promedioActual)
            {
                materiaMejorPromedio = -1;
            }
        }

        return materiaMejorPromedio;
    }
}
