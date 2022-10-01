package Compartido;

import java.util.Random;

public class BaseBatos {
    
    final private static Random r = new Random();

    final private static int cantAlumnos = 6;
    final private static int cantMaterias = 10;
    final private static int cantMeses = 9;

    private int[][] nota;
    private int[][] falta;
    private int[][] amonestacion;

    public BaseBatos()
    {
        nota = new int[cantAlumnos][cantMaterias];
        falta = new int[cantAlumnos][cantMeses];
        amonestacion = new int[cantAlumnos][cantMeses];

        for (int i = 0;i<cantAlumnos;i++)
        {
            for (int j = 0;j<cantMaterias;j++)
            {
                nota[i][j] = r.nextInt(9)+1;
            }
            for (int j = 0; j<cantMeses;j++)
            {
                falta[i][j] = r.nextInt(6);
                amonestacion[i][j] = r.nextInt(3);
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

    public int getCantMaterias()
    {
        return cantMaterias;
    }

    public int sumaFilaFalta(int alumno)
    {
        int res = 0;

        for(int mes = 0;mes<cantMeses;mes++)
        {
            //Emula la latencia fisica de acceso a la base de datos
            try {
                Thread.sleep(r.nextInt(200));
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            res += falta[alumno][mes];
        }

        return res;
    }

    public int sumaFilaNota(int alumno)
    {
        int res = 0;

        for(int materia = 0;materia<cantMaterias;materia++)
        {
            //Emula la latencia fisica de acceso a la base de datos
            try {
                Thread.sleep(r.nextInt(200));
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            res += nota[alumno][materia];
        }

        return res;
    }

    public int sumaColumnaNota(int materia)
    {
        int res = 0;

        for(int alumno = 0;alumno<cantAlumnos;alumno++)
        {
            //Emula la latencia fisica de acceso a la base de datos
            try {
                Thread.sleep(r.nextInt(200));
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            res += nota[alumno][materia];
        }

        return res;
    }

    public String toString()
    {
        String res = "";

        res += "Notas: \n";

        for (int i = 0;i<cantAlumnos;i++)
        {
            for (int j = 0;j<cantMaterias;j++)
            {
                res += nota[i][j] + "-";
            }
            res += "\n";
        }

        res += "Faltas: \n";
        for (int i = 0;i<cantAlumnos;i++)
        {
            for (int j = 0;j<cantMeses;j++)
            {
                res += falta[i][j] + "-";
            }
            res += "\n";
        }

        res += "Amonestacion: \n";
        for (int i = 0;i<cantAlumnos;i++)
        {
            for (int j = 0;j<cantMeses;j++)
            {
                res += amonestacion[i][j] + "-";
            }
            res += "\n";
        }

        return res;
    }
    public int[][] getNotas(){
        return this.nota;
    }
    public int[][] getFaltas(){
        return this.falta;
    }
    public int[][] getAmonestaciones(){
        return this.amonestacion;
    }
}
