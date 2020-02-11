package ClaseDeDatos;



public class Persona {

	
	private String nombre;
	private String apellido;
	private int edad;
	private String direccion;
	private boolean estado;
	
	public Persona() {}
	 
        public Persona(String nombre, String apellido, int edad, String direccion, boolean estado) {
        	super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;;
		this.edad = edad;
		this.estado = estado;
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		
		return "" + nombre + ", apellido=" + apellido + ",edad="+ edad +",Direccion=" + direccion +",Estado="+ estado +"]";
	}
	
	
	
	
	
	
	
	
}
