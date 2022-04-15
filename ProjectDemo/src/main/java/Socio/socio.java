package Socio;

public class socio {
private String nombre,apellido;
private int fecha,id;

public socio(String nombre, String apellido, int fecha, int id) {
	super();
	this.nombre = nombre;
	this.apellido = apellido;
	this.fecha = fecha;
	this.id = id;
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

public int getFecha() {
	return fecha;
}

public void setFecha(int fecha) {
	this.fecha = fecha;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}


}
