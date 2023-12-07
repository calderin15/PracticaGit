package Main;

public class Persona {

    private String nombreCompleto;
    private String direccion;
    private String telefono;

    public Persona() {
    }

    public Persona(String nombreCompleto, String direccion, String telefono) {
        this.nombreCompleto = nombreCompleto;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    @Override
    public String toString() {
        return "nombreCompleto= " + nombreCompleto + "\nDireccion= " + direccion + "\nTelefono= " + telefono + "\n";
    }
}
