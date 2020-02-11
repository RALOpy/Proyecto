package ClaseDeDatos;


public class Empleado extends Persona {

	private float sueldo_bruto;
	
	public Empleado() {}
	
	public Empleado(String nombre, String apellido, int edad, String direccion, boolean estado, float sueldo) {
		super(nombre, apellido, edad, direccion, estado);
		this.sueldo_bruto = sueldo;
	}

	@Override
	public String toString() {
		return "Empleado [sueldo_bruto=" + sueldo_bruto + "]";
	}
	
	public float calcular_salario_neto() {
		return 0;
	}
	
}
