public class Persona {
    String apellido;
    String nombre;

    public Persona(String ape, String nom) {
        this.apellido = ape;
        this.nombre=nom;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getApellido() {
        return apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}

