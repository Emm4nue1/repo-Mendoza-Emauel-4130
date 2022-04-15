package Autor;

public class autor {
private String nombre,apellido;
private int año;

public autor(String nombre, String apellido, int año) {
	super();
	this.nombre = nombre;
	this.apellido = apellido;
	this.año = año;
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

public int getAño() {
	return año;
}

public void setAño(int año) {
	this.año = año;
}


}
