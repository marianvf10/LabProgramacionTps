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
        Future[] resultado = new Future[7];

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
            System.out.println("\n Ingrese ENTER para empezar:");   
        }while(s.nextInt() != '\n');

        //Ejecucion de operaciones
        resultado[0] = ejecutor.submit(alumnoMasFaltante);
        System.out.println("a");
        System.out.println("b");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("c");
        System.out.println("d");
        System.out.println("e");

        try {
            System.out.println(resultado[0].get());
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ExecutionException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        /*Seccion de gets */
      
    }
}

