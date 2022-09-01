package Compartido;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Secundaria {

    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        
        BaseBatos base = new BaseBatos();        
        //!Puse 7 threads de base,pero si ves que necesitas mas para operaciones mas complejas(como la operacion 7),agregale
        ExecutorService ejecutor = Executors.newFixedThreadPool(7);
        AlumnoMasFaltante alumnoMasFaltante = new AlumnoMasFaltante(base);
        AlumnoMejorPromedio alumnoMejorPromedio = new AlumnoMejorPromedio(base);
        MateriaMejorPromedio materiaMejorPromedio = new MateriaMejorPromedio(base);
        AlumnoMenosCincoAprobada alumnoMenosCincoAprobada = new AlumnoMenosCincoAprobada(base);
        AlumnoMasCincoAprobada alumnoMasCincoAprobada = new AlumnoMasCincoAprobada(base);
        AlumnoCasiExpulsado alumnoCasiExpulsado = new AlumnoCasiExpulsado(base);
        AlumnoBuenComportamiento alumnoBuenComportamiento = new AlumnoBuenComportamiento(base);
        Future[] resultado = new Future[7];
        int aux;

        System.out.println(base.toString());

        //Menu principal
        System.out.println("Bienvenido al sistema de informacion de la secundaria,se mostraran los siguientes"+
        " respecto a notas,faltas y amonestaciones de los estudiantes:");
        System.out.println("1-Calcular el alumno con mas faltas");
        System.out.println("2-Calcular el alumno con mejor promedio");
        System.out.println("3-Calcular la materia con mejor promedio");
        System.out.println("4-Calcular cantidad de alumnos con menos de 5 materias aprobadas");
        System.out.println("5-Calcular cantidad de alumnos con mas de 5 materias aprobadas");
        System.out.println("6-Calcular cantidad de alumnos a punto de ser expulsados(3 amonestaciones o mas)");
        System.out.println("7-Calcular cantidad de alumnos con buen comportamiento(ninguna amonestacion y menos de 10 faltas");
        do
        {
            System.out.println("\n Ingrese 1 para empezar:");   
        }while(s.nextInt() != 1);

        //Ejecucion de operaciones
        resultado[0] = ejecutor.submit(alumnoMasFaltante);
        resultado[1] = ejecutor.submit(alumnoMejorPromedio);
        resultado[2] = ejecutor.submit(materiaMejorPromedio);
        resultado[3] = ejecutor.submit(alumnoMenosCincoAprobada);
        resultado[4] = ejecutor.submit(alumnoMasCincoAprobada);
        resultado[5] = ejecutor.submit(alumnoCasiExpulsado);
        resultado[6] = ejecutor.submit(alumnoBuenComportamiento);
        //Seccion de gets 

        try {
            if((aux = (int)resultado[0].get()) != -1)
            {
                System.out.println("El id de alumno con mas faltas es: " +resultado[0].get());
            }
            else
            {
                System.out.println("No existe un alumno con mas faltas que el resto.");
            }

            if((aux = (int)resultado[1].get()) != -1)
            {
                System.out.println("El id de alumno con mejor promedio: " +resultado[1].get());
            }
            else
            {
                System.out.println("No existe un alumno con mejor promedio que el resto.");
            }

            if((aux = (int)resultado[2].get()) != -1)
            {
                System.out.println("El id de materia con mejor promedio: " +resultado[2].get());
            }
            else
            {
                System.out.println("No existe una materia con mejor promedio que el resto.");
            }
            if((aux = (int)resultado[3].get()) != 0)
            {
                System.out.println("Cantidad alumnos que aprobaron menos de 5 materias" +resultado[3].get());
            }
            else
            {
                System.out.println("Todos los alumnos tienen mas de 5 materias aprobadas");
            }if((aux = (int)resultado[4].get()) != 0)
            {
                System.out.println("Cantidad alumnos que aprobaron mas de 5 materias" +resultado[4].get());
            }
            else
            {
                System.out.println("Ningun alumno tiene mas de 5 materias aprobadas");
            }
            if((aux = (int)resultado[5].get()) != 0)
            {
                System.out.println("Cantidad alumnos que estan a punto de ser expulsados" +resultado[5].get());
            }
            else
            {
                System.out.println("No hay ningun alumno en condiciones de ser expulsados");
            }
            if((aux = (int)resultado[6].get()) != 0)
            {
                System.out.println("Cantidad alumnos con buen comportamiento" +resultado[6].get());
            }
            else
            {
                System.out.println("No hay ningun alumno que posea un buen comportamiento");
            }

        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ExecutionException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        ejecutor.shutdown();
    }
}

