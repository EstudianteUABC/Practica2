package clases;

import clases.Entrada;

public class Estudiante {
	private String nombre;
	private int numControl;
	private String materia;
	private int calificacion;
	private String estado;
	
	public Estudiante() {
		//constructor predeterminado
	}
	
	//Nota: no recibe parametro para estado porque el constructor manda a llamar 
	//metodo AsignarEstado al momento de crear el objeto.
	public Estudiante( String nombre, int numControl, String materia, int calificacion ){
		establecerNombre( nombre );
		establecerNumControl( numControl );
		establecerMateria( materia );
		CambiarCalificacion( calificacion );
		AsignarEstado();
	}
	
	public void AsignarEstado() {
		if( this.calificacion < 60 )
			this.estado = "reprobado";
		else 
			this.estado = "aprobado";
	}
	
	public void CambiarCalificacion( int calificacion ) {
		if( calificacion >= 0 && calificacion <= 100 )
			this.calificacion = calificacion;
		else 
			System.out.println( "Calificacion invalida.\n" );
	}
	
	public void establecerNombre( String nombre ) {
		this.nombre = nombre;
	}
	
	public void establecerNumControl( int numControl ) {
		this.numControl = numControl;
	}
	
	public void establecerMateria( String materia ) {
		this.materia = materia;
	}
	
	public String obtenerNombre() {
		return nombre;
	}
	
	public int obtenerCalificacion() {
		return calificacion;
	}
	
	public void capturarDatos() {
		establecerNombre( Entrada.cadena( "Nombre: " ) );
		establecerNumControl( Entrada.entero( "Numero de control: " ) );
		establecerMateria( Entrada.cadena( "Materia: " ) );
		CambiarCalificacion( Entrada.entero( "Calificacion: " ) );
		AsignarEstado( );	
	}
	
	public void mostrarDatos() {
		System.out.println( "Nombre: " + nombre );
		System.out.println( "Numero de control: " + numControl );
		System.out.println( "Materia: " + materia );
		System.out.println( "Calificacion: " + calificacion );
		System.out.println( "Estado: " + estado );
	}
}
