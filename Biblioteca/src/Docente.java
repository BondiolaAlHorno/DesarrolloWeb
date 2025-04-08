public class Docente extends Persona {
    private String titulo;

    public Docente (String apellido, String nombre, String titulo){
        super(apellido, nombre);
        this. titulo = titulo;
    }

    public String getTitulo(){
        return this.titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void modificarDocente(String apellido, String nombre, String titulo){
        modificarPersona(apellido, nombre);
        setTitulo(titulo);
    }
}