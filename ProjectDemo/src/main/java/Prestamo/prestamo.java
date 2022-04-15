package Prestamo;

public class prestamo {
private String nombre,apellido;
private int dia,id;

public prestamo(String nombre, String apellido, int dia, int id) {
	super();
	this.nombre = nombre;
	this.apellido = apellido;
	this.dia = dia;
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

public int getDia() {
	return dia;
}

public void setDia(int dia) {
	this.dia = dia;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}


}
