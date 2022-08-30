package Compartido;

import java.util.Random;

public class BaseBatos {
    
    final static int cantAlumnos = 6;
    final static int cantMaterias = 10;
    final static int cantMeses = 12;

    private int[][] nota = new int[cantAlumnos][cantMaterias];
    public int[][] falta = new int[cantAlumnos][cantMeses];
    private int[][] amonestacion = new int[cantAlumnos][cantMeses];

    public void BaseDatos()
    {
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
                System.out.println(falta[i][j]);
            }
        }
    }

    public int getCantMeses()
    {
        return cantMeses;
    }

    public int getCantAlumnos()
    {
        return cantAlumnos;
    }

    public int sumaFilaFalta(int alumno)
    {
        int res = 0;

        for(int mes = 0;mes<cantMeses;mes++)
        {
            //Emula la latencia fisica de acceso a la base de datos
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            res += falta[alumno][mes];
        }

        return res;
    }

}
