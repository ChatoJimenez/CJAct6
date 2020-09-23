package cjact6;

import java.util.Scanner;


public class CJAct6 {
    //Atributos: 
    private static String nombre;
    private static Double [] calificaciones = new Double[5];
    
    public static void main(String[] args) {
        //Variables
        Scanner s = new Scanner(System.in); 
        double promedio;
        char calificacion;
        //Entrada de datos por el usuario
        System.out.println("\033[31mEntrada de datos:\033[30m");
        System.out.print("Escribe tu nombre: ");
        nombre = s.next();
        System.out.println("Digita tus calificaciones: ");
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.print("Calificación " + (i+1) + ": ");
            calificaciones[i] = s.nextDouble();
        }
        //Métodos implementados
       promedio = CalcularPromedio(calificaciones);
       calificacion = ObtenerCalificacion(promedio);
       System.out.println("\n\033[31mImpresión de resultados:\033[30m");
       ImprimirResultados(nombre, calificaciones, promedio, calificacion);
    }
    
    public static double CalcularPromedio(Double[] calificaciones){
        double total = 0;
        for (int i = 0; i < calificaciones.length; i++) {
            total += calificaciones[i];
        }
        return (total/calificaciones.length);
    }
    
    public static char ObtenerCalificacion(Double promedio){
        char calificacion = ' ';
        if (promedio <= 50){
            calificacion = 'F';
        } else if (promedio > 50 && promedio < 60){
            calificacion = 'E';
        } else if (promedio > 60 && promedio < 70){
            calificacion = 'D';
        } else if (promedio > 70 && promedio < 80){
            calificacion = 'C';
        } else if (promedio > 80 && promedio < 90){
            calificacion = 'B';
        } else if (promedio > 90 && promedio < 100){
            calificacion = 'A';
        } 
        return calificacion;
    }
    
    public static void ImprimirResultados(String nombre, Double[] calificaciones,
            double promedio, char calificacion){
        System.out.println("Nombre del estudiante: " + nombre);
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.println("Calificación " + (i+1) + ": " + calificaciones[i]);
        }
        System.out.println("Promedio: " + promedio);
        System.out.println("Calificación: " + calificacion);
    }
}
