public class Persona {
    private String apellido;
    private String nombre;

    public Persona(String apellido, String nombre) {
        this.apellido = apellido;
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void modificarPersona(String apellido, String nombre){
        setApellido(apellido);
        setNombre(nombre);
    }
}