package Compartido;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.concurrent.Callable;

public class Secundaria implements Callable {

    final static int cantAlumnos = 6;
    final static int cantMaterias = 10;
    final static int cantMeses = 12;

    static int[][] nota;
    static int [][] falta;
    static int[][] amonestacion;

    

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int opcion;

        inicializar();

        System.out.println("Bienvenido al sistema de gestion de notas del secundario.Ingrese su opcion:");
        opcion = s.nextInt();
        /*
        ("1- Calcular cantidad de faltas totales de alumno.");
        "Calcular promedio de faltas de un alumno por mes"
         
        "calcular promedio de notas de un alumno"
        "Calcular promedio de notas de una materia"
        "Calcular cantidad de alumnos que aprobaron una materia"
        "Calcular cantidad de alumnos a punto de ser expulsados(3 amonestaciones o mas)"
        "Calcular cantidad de alumnos con buen comportamiento(ninguna amonestacion y menos de 10 faltas)"
        */

    }

    private static void inicializar()
    {
        //Inicializa los arreglos

        Random r = new Random();

        for (int i = 0;i<cantAlumnos;i++)
        {
            for (int j = 0;j<cantMaterias;j++)
            {
                nota[i][j] = r.nextInt(9)+1;
            }
            for (int j = 0; j<cantMeses;j++)
            {
                falta[i][j] = r.nextInt(30)+1;
                amonestacion[i][j] = r.nextInt(4)+1;
            }
        }
    }

    @Override
    public Object call() throws Exception {
        // TODO Auto-generated method stub
        return null;
    }
}
