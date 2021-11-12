package clases;

import clases.Estudiante;
import clases.Entrada;

public class Opciones {
	//captura las calificaciones del 6to alumno en adelante
	//las primeras 5 calificacion son definidas por el programador
	public void capurarAlumnos( Estudiante estudiantes[] ) {
		for( int i = 5; i < estudiantes.length; i++ ) {
			System.out.println( "\nAlumno " + ( i + 1 ) + ": " );
			estudiantes[i].capturarDatos();
		}
	}
	
	//muestra los datos de cada alumno
	public void mostrarAlumnos( Estudiante estudiantes[] ) {
		for( int i = 0; i < estudiantes.length; i++ ) {
			System.out.println( "\nAlumno " + ( i + 1 ) + ":" );
			estudiantes[i].mostrarDatos();
		}
	}
	
	
	//muestra un resumen con el numero de los alumnos, sus nombres, 
	//y sus calificaciones
	public void cambiarCalificacion( Estudiante estudiantes[] ) {
		for( int i = 0; i < estudiantes.length; i++ ) {
			System.out.println( "\nAlumno " + ( i + 1 ) + ": " );
			System.out.println( "Nombre: " + estudiantes[i].obtenerNombre() );
			System.out.println( "Nombre: " + estudiantes[i].obtenerCalificacion() );
		}
		
		//obtiene el numero del alumno y le resta 1 para que corresponda a su
		//lugar en el arreglo
		int seleccion = Entrada.entero( "\nIngrese el numero del alumno: ") - 1;
		int calificacion = Entrada.entero( "Escriba la nueva calificacion: " );
		
		estudiantes[ seleccion ].CambiarCalificacion( calificacion );
	}

}
