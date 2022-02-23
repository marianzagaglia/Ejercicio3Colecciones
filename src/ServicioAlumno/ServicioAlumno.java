/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServicioAlumno;

import EntidadesAlumno.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Mariana
 */
public class ServicioAlumno {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
   
    public Alumno crearAlumno(Alumno a1) {
        
        ArrayList calificaciones = new ArrayList();

        System.out.println("Ingrese el nombre del alumno");
        a1.setNombre(leer.next());
        System.out.println("Ingrese la nota 1");
        int nota1 = leer.nextInt();
        calificaciones.add(nota1);
        System.out.println("Ingrese la nota 2");
        int nota2 = leer.nextInt();
        calificaciones.add(nota2);
        System.out.println("Ingrese la nota 3");
        int nota3 = leer.nextInt();
        calificaciones.add(nota3);
        a1.setNotas(calificaciones);
        System.out.println(a1.toString());

        return a1;
    }
    
   
    public void mostrarAlumnos() {
        System.out.println("Los alumnos cargados son: ");
        
}

}
