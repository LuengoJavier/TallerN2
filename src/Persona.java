import java.util.ArrayList;

public class Persona {
	private String nombre;
	private String apellido;
	private String rut;
	public ArrayList<CorreoElectronico> correos = new ArrayList<CorreoElectronico>();
	public ArrayList<Automovil> automoviles = new ArrayList<Automovil>();

	public Persona(String nombre, String apellido, String rut) {
		this.nombre = nombre;
		this.apellido = apellido ;
		this.rut = rut;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getRut() {
		return this.rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public ArrayList<CorreoElectronico> getCorreos() {
		return correos;
	}

	public ArrayList<Automovil> getAutomoviles() {
		return automoviles;
	}
}