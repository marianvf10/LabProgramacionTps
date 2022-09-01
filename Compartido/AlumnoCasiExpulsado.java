package Compartido;

import java.util.concurrent.Callable;

public class AlumnoCasiExpulsado implements Callable {

    private BaseBatos baseDatos;

    public AlumnoCasiExpulsado(BaseBatos b) {
        this.baseDatos = b;
    }

    public Object call() {
        int amonestaciones[][] = this.baseDatos.getAmonestaciones();
        int cantAlumApuntoSerExpulsado, cantAlumnos, cantMeses, cantAmonestaciones;
        cantAlumApuntoSerExpulsado = 0;
        cantAlumnos = baseDatos.getCantAlumnos();
        cantMeses = baseDatos.getCantMaterias();
        cantAmonestaciones = 0;

        for (int i = 0; i < cantAlumnos; i++) {
            for (int j = 0; j < cantMeses; j++) {
                if (amonestaciones[i][j] > 0) {
                    cantAmonestaciones++;
                }
                if (cantAmonestaciones == 5) {
                    // este if es para cortar cuando ya se detecta que el alumno tiene 3
                    // amonestaciones
                    j = cantMeses;
                }
            }
            if (cantAmonestaciones > 4) {
                cantAlumApuntoSerExpulsado++;
            }
            cantAmonestaciones = 0;
        }
        return cantAlumApuntoSerExpulsado;
    }
}
