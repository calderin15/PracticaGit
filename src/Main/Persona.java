package Main;
public class Persona {
    private String nombre;
    private int edad;

    Persona() {
    }

    Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString(){
        return "Nombre: " + this.nombre + " - Edad: " + this.edad + "\n";
    }

}
