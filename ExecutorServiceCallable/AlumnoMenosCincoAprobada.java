package ExecutorServiceCallable;

import java.util.concurrent.Callable;

public class AlumnoMenosCincoAprobada implements Callable {
    
    private BaseBatos baseDatos;

    public AlumnoMenosCincoAprobada(BaseBatos b){
        this.baseDatos = b;
    }

    public Object call() {
        int nota[][] = this.baseDatos.getNotas();
        int cantAlumMenosCincoMateriasAprobadas, cantAlumnos, cantMaterias,cantMateriasAprobadas;
        cantAlumMenosCincoMateriasAprobadas = 0;
        cantAlumnos = baseDatos.getCantAlumnos();
        cantMaterias = baseDatos.getCantMaterias();
        cantMateriasAprobadas = 0;
        
        for (int i = 0; i < cantAlumnos; i++){
            for(int j = 0; j < cantMaterias; j++){
                if (nota[i][j] >= 6){
                    cantMateriasAprobadas++;
                }
                if (cantMateriasAprobadas == 5){
                    j = cantMaterias;
                }
                }
                if (cantMateriasAprobadas < 5){
                    cantAlumMenosCincoMateriasAprobadas++;
                }
                cantMateriasAprobadas = 0;
            }

        
        return cantAlumMenosCincoMateriasAprobadas;

    }
    
}
