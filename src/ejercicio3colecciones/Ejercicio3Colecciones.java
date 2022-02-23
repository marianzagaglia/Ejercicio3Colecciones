/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3colecciones;

import EntidadesAlumno.Alumno;
import ServicioAlumno.ServicioAlumno;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Mariana
 */
public class Ejercicio3Colecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ServicioAlumno s1 = new ServicioAlumno();
        int contador = 1;
        String respuesta;
        ArrayList<Alumno> estudiantes = new ArrayList();

        do {
            Alumno a1 = new Alumno();
            s1.crearAlumno(a1);
            estudiantes.add(a1);
            System.out.println("Desea continuar agregando alumnos si/no");
            respuesta = leer.next();
            contador++;
        } while (respuesta.equals("si"));
        
        for (Alumno aux : estudiantes) {
            System.out.println(aux);
        }
      
        System.out.println("Ingrese el nombre del alumno a calcular la nota final");
        String nombreabuscar = leer.next();
        int sumanotas=0;
        for (Alumno aux : estudiantes) {
            if (nombreabuscar.equals(aux.getNombre())) {
                for (int i = 0; i < aux.getNotas().size(); i++) {
                    sumanotas=sumanotas+aux.getNotas().get(i);
                }       
            }       
        }
        double promedio=sumanotas/3;
        System.out.println("El promedio de "+nombreabuscar+" es: "+promedio);
    }

}
