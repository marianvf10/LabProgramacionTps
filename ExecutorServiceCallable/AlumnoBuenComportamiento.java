package ExecutorServiceCallable;

import java.util.concurrent.Callable;

public class AlumnoBuenComportamiento implements Callable {

    private BaseBatos baseDatos;

    public AlumnoBuenComportamiento(BaseBatos b) {
        this.baseDatos = b;
    }

    public Object call() {
        int cantAlumnosBuenComportamiento = 0, cantAlumnos = baseDatos.getCantAlumnos();
        int cantMeses = baseDatos.getCantMeses();
        int cantFaltas;
        int[][] amonestaciones = baseDatos.getAmonestaciones();

        // alumno con buen comportamiento: ninguna amonestacion y menos de 10 faltas
        for (int i = 0; i < cantAlumnos; i++) {
            int j = 0;
            boolean tieneAmonestacion = false;
            while (j < cantMeses && !tieneAmonestacion) {
                if (amonestaciones[i][j] > 0) {
                    tieneAmonestacion = true;
                }
                j++;
            }
            if (!tieneAmonestacion) {
                // si el alumno no tiene ninguna amonestacion, procedemos a contar la cantidad de
                // faltas que tiene
                cantFaltas = baseDatos.sumaFilaFalta(i);
                if (cantFaltas < 10) {
                    cantAlumnosBuenComportamiento++;
                }
            }

        }
        return cantAlumnosBuenComportamiento;
    }
}
