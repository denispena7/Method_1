package es.studium.ejercicio1;

public class TestPersona 
{

	public static void main(String[] args) 
	{
		
		Persona persona1 = new Persona();
		persona1.setNombre("Denis Samuel");
		persona1.setApellidos("Peña Masis");
		persona1.setDni("Z12345678");
		persona1.setDomicilio("Avda. Hytasa, n°7");
		persona1.setTelefono(87654321);
		
		// System.out.println(persona1.getNombre() + " " + persona1.getApellidos() + ", " + persona1.getDni() + ", " + persona1.getDomicilio() + ", " + persona1.getTelefono());
		
		Persona persona2 = new Persona("Juan", "Fernández", "Z01259846", "Avda. Soleá", 88997755);
		System.out.println(persona2.getNombre() + " " + persona2.getApellidos() + ", " + persona2.getDni() + ", " + persona2.getDomicilio() + ", " + persona2.getTelefono());

	}
}
