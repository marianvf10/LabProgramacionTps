package ExecutorServiceCallable;

import java.util.concurrent.Callable;
public class AlumnoMasCincoAprobada implements Callable {

    private BaseBatos baseDatos;

    public AlumnoMasCincoAprobada(BaseBatos b){
        this.baseDatos = b;
    }

    public Object call() {
        int nota[][] = this.baseDatos.getNotas();
        int cantAlumMasCincoMateriasAprobadas, cantAlumnos, cantMaterias,cantMateriasAprobadas;
        cantAlumMasCincoMateriasAprobadas = 0;
        cantAlumnos = baseDatos.getCantAlumnos();
        cantMaterias = baseDatos.getCantMaterias();
        cantMateriasAprobadas = 0;
        
        for (int i = 0; i < cantAlumnos; i++){
            for(int j = 0; j < cantMaterias; j++){
                if (nota[i][j] >= 6){
                    cantMateriasAprobadas++;
                }
                if (cantMateriasAprobadas == 6){
                    j = cantMaterias;
                }
                }
                if (cantMateriasAprobadas > 5){
                    cantAlumMasCincoMateriasAprobadas++;
                }
                cantMateriasAprobadas = 0;
            }
            return cantAlumMasCincoMateriasAprobadas;
}
} 