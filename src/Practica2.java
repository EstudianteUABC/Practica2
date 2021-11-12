import clases.Estudiante;
import clases.Entrada;
import clases.Opciones;

public class Practica2 {
	//Menu de opciones
	public static void main(String[] args) {
		boolean flag = true; //controlar la continuacion del ciclo
		Estudiante estudiantes[] = new Estudiante[ 10 ]; //arreglo de estudiantes
		Opciones opcion = new Opciones(); //objeto que contiene cada una de las opciones
		
		for( int i = 0; i < estudiantes.length; i++ ) {
			estudiantes[i] = new Estudiante();
		}
		
		//Objetos definidos por el programador
		estudiantes[ 0 ] = new Estudiante( "Pedro",  1, "Geografia", 100 );
		estudiantes[ 1 ] = new Estudiante( "Samuel", 2, "Matematicas", 80 );
		estudiantes[ 2 ] = new Estudiante( "Sofia",  3, "Ingles", 50 );
		estudiantes[ 3 ] = new Estudiante( "Maria",  4, "Historia", 100 );
		estudiantes[ 4 ] = new Estudiante( "Carlos", 5, "Quimica", 70 );
		
		do {
			System.out.println( "1) Capturar alumnos" );
			System.out.println( "2) Mostrar alumnos" );
			System.out.println( "3) Cambiar calificacion" );
			System.out.println( "4) Salir" );
			System.out.println( "Seleccione una opcion y presione ENTER" );
			
			int seleccion = Entrada.entero( "" ); 
			
			switch( seleccion ) {
				case 1:
					opcion.capurarAlumnos( estudiantes );
					break;
				
				case 2:
					opcion.mostrarAlumnos( estudiantes );
					break;
					
				case 3: 
					opcion.cambiarCalificacion( estudiantes );
					break;
					
				case 4:
					flag = false;
					break;
				
				default:
					System.out.println( "Opcion invalida." );
					break;
			}	
		}while( flag ); //mientras flag sea igual a true
	}
}
